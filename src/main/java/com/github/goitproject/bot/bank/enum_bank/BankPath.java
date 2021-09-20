package com.github.goitproject.bot.bank.enum_bank;

public enum BankPath {
    MONO_PATH("https://api.monobank.ua/bank/currency"),
    PRIVAT_PATH("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5"),
    NBU_PATH("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json");
    private String bankPath;

    BankPath(String bankName) {
        this.bankPath = bankName;
    }

    public String getBankPath() {
        return bankPath;
    }
}
