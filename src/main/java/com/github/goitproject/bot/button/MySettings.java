package com.github.goitproject.bot.button;

import com.github.goitproject.bot.service.SendMessageBotService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class MySettings implements Button {
    private final SendMessageBotService sendMessageBotService;

    public MySettings(SendMessageBotService sendMessageBotService) {
        this.sendMessageBotService = sendMessageBotService;
    }

    @Override
    public void execute(Update update, Settings settings) {
        String chatId = update.getMessage().getChatId().toString();
        StringBuilder message = new StringBuilder();
        message.append("\uD83D\uDD27  Мої налаштування: \n");
        message.append("Банк: ");
        if (settings.isCheckNBU())
            message.append("НБУ ");
        if (settings.isCheckMonoBank())
            message.append("МоноБанк ");
        if (settings.isCheckPrivatBank())
            message.append("ПриватБанк ");

        message.append("\n");

        message.append("Валюта: ");
        if (settings.isCheckUSD())
            message.append("USD ");
        if (settings.isCheckEUR())
            message.append("EUR ");
        if (settings.isCheckRUR())
            message.append("RUB ");
        if (settings.isCheckPLN())
            message.append("PLN ");
        if (settings.isCheckGBP())
            message.append("GBP ");
        message.append("\n");
        message.append("Кількість знаків після коми: ");

        switch (settings.getPrecision()) {
            case 2:
                message.append("2\n");
                break;
            case 3:
                message.append("3\n");
                break;
            case 4:
                message.append("4\n");
        }
        message.append("Час сповіщень:  ");
        if (!settings.isCheckDisableTimeUpdate()) {
            switch (settings.getTimeUpdate()) {
                case 6:
                    message.append("6:00\n");
                    break;
                case 7:
                    message.append("7:00\n");
                    break;
                case 8:
                    message.append("8:00\n");
                    break;
                case 9:
                    message.append("9:00\n");
                    break;
                case 10:
                    message.append("10:00\n");
                    break;
                case 11:
                    message.append("11:00\n");
                    break;
                case 12:
                    message.append("12:00\n");
                    break;
                case 13:
                    message.append("13:00\n");
                    break;
                case 14:
                    message.append("14:00\n");
                    break;
                case 15:
                    message.append("15:00\n");
                    break;
                case 16:
                    message.append("16:00\n");
                    break;
                case 17:
                    message.append("17:00\n");
                    break;
                case 18:
                    message.append("18:00\n");
                    break;
                case 19:
                    message.append("19:00\n");
                    break;
                case 20:
                    message.append("20:00\n");
                    break;
                case 21:
                    message.append("21:00\n");

            }
        } else
            message.append("Вимк.\n");
        sendMessageBotService.SendMessage(chatId, message.toString());
    }
}
