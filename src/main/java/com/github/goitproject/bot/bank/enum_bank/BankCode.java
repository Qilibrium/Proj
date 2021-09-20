package com.github.goitproject.bot.bank.enum_bank;

public enum BankCode {
    USD_CODE(840),
    EUR_CODE(978),
    RUR_CODE(643);
    private Integer code;

    BankCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}


