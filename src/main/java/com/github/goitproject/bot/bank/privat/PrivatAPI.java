package com.github.goitproject.bot.bank.privat;

import com.github.goitproject.bot.bank.BankResponse;
import com.github.goitproject.bot.service.ClientService;

import java.util.ArrayList;

import static com.github.goitproject.bot.bank.enum_bank.BankPath.PRIVAT_PATH;
import static com.github.goitproject.bot.button.enum_button.ButtonName.*;

public class PrivatAPI {
    ClientService client = new ClientService();
    ArrayList<BankResponse> responses = new ArrayList<>();

    public ArrayList<BankResponse> getInfoFromMonoBank() throws Exception {
        ArrayList<PrivatBank> allCurrency = client.getCurrencyFromBank(PRIVAT_PATH.getBankPath(), CurrencyPrivatList.class);
        if(allCurrency == null) {
            return null;
        }
        for (PrivatBank pb : allCurrency) {
            if (pb.getCcy().equals(USD.getName()) || pb.getCcy().equals(EUR.getName()) || pb.getCcy().equals(RUR.getName())) {
                BankResponse bankResponse = new BankResponse();
                bankResponse.setBank("Пртватбанк");
                bankResponse.setBuy(Float.parseFloat(pb.getBuy()));
                bankResponse.setSale(Float.parseFloat(pb.getSale()));
                bankResponse.setCurrency(pb.getCcy());
                responses.add(bankResponse);
            }
        }
        return responses;
    }

}
