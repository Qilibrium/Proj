package com.github.goitproject.bot.bank.mono;

import com.github.goitproject.bot.bank.BankResponse;
import com.github.goitproject.bot.service.ClientService;

import java.util.ArrayList;

import static com.github.goitproject.bot.bank.enum_bank.BankCode.*;
import static com.github.goitproject.bot.bank.enum_bank.BankPath.MONO_PATH;

public class MonoAPI {
    ClientService client = new ClientService();
    ArrayList<BankResponse> responses = new ArrayList<>();

    public ArrayList<BankResponse> getInfoFromMonoBank() throws Exception {
        ArrayList<MonoBank> allCurrency = client.getCurrencyFromBank(MONO_PATH.getBankPath(), CurrencyMonoList.class);
        if(allCurrency == null) {
            return null;
        }
            for (MonoBank mb : allCurrency) {
                if (mb.getCurrencyCodeA().equals(USD_CODE.getCode()) || mb.getCurrencyCodeA()
                        .equals(EUR_CODE.getCode()) || mb.getCurrencyCodeA()
                        .equals(RUR_CODE.getCode()) || mb.getCurrencyCodeA()
                        .equals(PLN_CODE.getCode()) || mb.getCurrencyCodeA().equals(GBR_CODE.getCode())) {
                    BankResponse bankResponse = new BankResponse();
                    bankResponse.setBank("МоноБанк");
                    bankResponse.setBuy(mb.getRateBuy());
                    bankResponse.setSale(mb.getRateSell());
                    bankResponse.setCurrency(getCurrencyNameByCode(mb.getCurrencyCodeA()));
                    responses.add(bankResponse);
                }
            }
        return responses;
    }

    private String getCurrencyNameByCode(int code) {
        return switch (code) {
            case 840 -> "USD";
            case 978 -> "EUR";
            case 643 -> "RUR";
            case 985 -> "PLN";
            case 826 -> "GBP";
            default -> null;
        };
    }

}
