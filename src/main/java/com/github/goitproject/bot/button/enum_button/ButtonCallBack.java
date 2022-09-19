package com.github.goitproject.bot.button.enum_button;

public enum ButtonCallBack {
    START_CALLBACK("/start"),
    INFO_CALLBACK("/info"),
    SETTINGS_CALLBACK("/settings"),
    MY_SETTINGS_CALLBACK("/my_settings"),
    HELP_CALLBACK("/help"),
    BACK_CALLBACK("back"),

    BANK_CALLBACK("bank"),
    MONOBANK_CALLBACK("mono_bank"),
    PRIVATBANK_CALLBACK("privat_bank"),
    NBU_CALLBACK("nbu_bank"),

    CURRENCY_CALLBACK("currency"),
    USD_CALLBACK("USD_currency"),
    EUR_CALLBACK("EUR_currency"),
    RUR_CALLBACK("RUR_currency"),
    PLN_CALLBACK("PLN_currency"),
    GBP_CALLBACK("GBP_currency"),


    PRECISION_CALLBACK("precision"),
    PRECISION_TWO_CALLBACK("2"),
    PRECISION_THREE_CALLBACK("3"),
    PRECISION_FOUR_CALLBACK("4"),

    TIME_UPDATE_CALLBACK("time_update"),
    TIME_UPDATE_SIX_CALLBACK("6"),
    TIME_UPDATE_SEVEN_CALLBACK("7"),
    TIME_UPDATE_EIGHT_CALLBACK("8"),
    TIME_UPDATE_NINE_CALLBACK("9"),
    TIME_UPDATE_THEN_CALLBACK("10"),
    TIME_UPDATE_ELEVEN_CALLBACK("11"),
    TIME_UPDATE_TWELVE_CALLBACK("12"),
    TIME_UPDATE_THIRTEEN_CALLBACK("13"),
    TIME_UPDATE_FOURTEEN_CALLBACK("14"),
    TIME_UPDATE_FIFTEEN_CALLBACK("15"),
    TIME_UPDATE_SIXTEEN_CALLBACK("16"),
    TIME_UPDATE_SEVENTEEN_CALLBACK("17"),
    TIME_UPDATE_EIGHTEEN_CALLBACK("18"),
    TIME_UPDATE_NINETEEN_CALLBACK("19"),
    TIME_UPDATE_TWENTY_CALLBACK("20"),
    TIME_UPDATE_TWENTY_ONE_CALLBACK("21"),
    TIME_UPDATE_DISABLE_CALLBACK("disable_update");
    private String callback;

    ButtonCallBack(String callback) {
        this.callback = callback;
    }
    public String getCallback(){
        return callback;
    }

}
