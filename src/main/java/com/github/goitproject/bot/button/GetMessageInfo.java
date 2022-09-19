package com.github.goitproject.bot.button;

import com.github.goitproject.bot.Facade;
import com.github.goitproject.bot.bank.BankResponse;
import com.github.goitproject.bot.button.enum_button.ButtonName;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Optional;

import static com.github.goitproject.bot.button.enum_button.ButtonName.*;

public class GetMessageInfo {
    private ArrayList<BankResponse> responses;
    private Facade facade = new Facade();
    private String[] precisionArray = {"#0", "#0.0", "#0.00", "#0.000", "#0.0000"};

    public String getMessageInfo(ButtonName bank, Settings settings) {
        String message;
        String precision;
        Optional<BankResponse> bankResponseOptional;
        precision = precisionArray[settings.getPrecision()];

        try {
            responses = facade.getInfo(bank);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (responses == null) {
            return "Помилка запиту " + bank.getName() + ". Спробуйте пізніше або віберіть другий банк";
        }

        message = "Курс  " + bank.getName() + ":\n";

        if (!settings.isCheckUSD() && !settings.isCheckEUR() && !settings.isCheckRUR() && !settings.isCheckPLN() && !settings.isCheckGBP()) {
            settings.setCheckUSD(true);
        }
        if (settings.isCheckUSD()) {
            bankResponseOptional = responses.stream().filter(x -> (x.getCurrency().equals("USD"))).findFirst();
            message += createStringMessage(bankResponseOptional, bank, precision);
        }
        if (settings.isCheckEUR()) {
            bankResponseOptional = responses.stream().filter(x -> (x.getCurrency().equals("EUR"))).findFirst();
            message += createStringMessage(bankResponseOptional, bank, precision);
        }
        if (settings.isCheckRUR()) {
            bankResponseOptional = responses.stream().filter(x -> (x.getCurrency().equals("RUR")) || x.getCurrency().equals("RUB")).findFirst();
            message += createStringMessage(bankResponseOptional, bank, precision);
        }
        if (settings.isCheckPLN()) {
            bankResponseOptional = responses.stream().filter(x -> (x.getCurrency().equals("PLN"))).findFirst(); //|| x.getCurrency().equals("PLZ")).findFirst();
            message += createStringMessage(bankResponseOptional, bank, precision);
        }
        if (settings.isCheckGBP()) {
            bankResponseOptional = responses.stream().filter(x -> (x.getCurrency().equals("GBP"))).findFirst();
            message += createStringMessage(bankResponseOptional, bank, precision);
        }
        return message;
    }

    private String createStringMessage(Optional<BankResponse> bankResponse, ButtonName bank, String precision) {
        String priceBuy;
        String priceSale;
        DecimalFormat format = new DecimalFormat(precision);
        priceBuy = format.format(bankResponse.get().getBuy());
        priceSale = format.format(bankResponse.get().getSale());
        return bankResponse.get().getCurrency() + "/UAH" + "\n" +
                "Купівля: " + priceBuy + "\n" +
                (bank == NBU ? "\n" : "Продаж: " + priceSale + "\n\n");
    }
}
