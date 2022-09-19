package com.github.goitproject.bot.button.enum_button;

public enum ButtonName {
    START("/start"),
    INFO("✉  Отримати інформацію"),
    SETTINGS("⚙ Налаштування"),
    HELP("\uD83D\uDE91 Допомога"),
    BACK("Повернутсь"),

    BANK("\uD83C\uDFE6 Банк"),
    MONOBANK("МоноБанк"),
    PRIVATBANK("ПриватБанк"),
    NBU("НБУ"),

    CURRENCY("\uD83D\uDCB0 Валюта"),
    USD("USD"),
    EUR("EUR"),
    RUR("RUR"),
    PLN("PLN"),
    GBP("GBP"),

    PRECISION("\uD83C\uDFAF Округлення до"),
    PRECISION_TWO("2"),
    PRECISION_THREE("3"),
    PRECISION_FOUR("4"),

    TIME_UPDATE("⏱  Час сповіщення"),
    TIME_UPDATE_SIX("6"),
    TIME_UPDATE_SEVEN("7"),
    TIME_UPDATE_EIGHT("8"),
    TIME_UPDATE_NINE("9"),
    TIME_UPDATE_THEN("10"),
    TIME_UPDATE_ELEVEN("11"),
    TIME_UPDATE_TWELVE("12"),
    TIME_UPDATE_THIRTEEN("13"),
    TIME_UPDATE_FOURTEEN("14"),
    TIME_UPDATE_FIFTEEN("15"),
    TIME_UPDATE_SIXTEEN("16"),
    TIME_UPDATE_SEVENTEEN("17"),
    TIME_UPDATE_EIGHTEEN("18"),
    TIME_UPDATE_NINETEEN("19"),
    TIME_UPDATE_TWENTY("20"),
    TIME_UPDATE_TWENTY_ONE("21"),

    TIME_UPDATE_DISABLE("Вимкнути повідомлення");
    private String buttonName;

    ButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    public String getName() {
        return buttonName;
    }
}
