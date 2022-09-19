package com.github.goitproject.bot.button;

import com.github.goitproject.bot.service.SendMessageBotService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class HelpButton implements Button {
    private final SendMessageBotService sendMessageBotService;
    private final static String MESSAGE_HELP = "Допомога: \n" +
            "✉️  Отримати інфу - отримання поточного курсу валют залежно від налаштувань\n\n" +
            "⚙️  Налаштування - вибір валюти, банка, час сповіщення\n\n" +
            "\uD83C\uDFAF   Кількусть знаків після коми - вибір точного відображення курсу (за замовчуванням 2)\n\n" +
            "\uD83C\uDFE6   Банк - вибір банка (за замовчуванням НБУ)\n\n" +
            "\uD83D\uDCB0   Валюта - вибір валюти (за замовчуванням USD)\n\n" +
            "⏱   Час сповіщення - вибір часу повідомлень курсу валют по заданним налаштуванням (за замовчуванням 9:00)\n\n" +
            "\uD83D\uDD27   Мої налаштування - покати данні налаштування\n\n" +
            "✅   Вимкнуті повідомлення - увім./вимк. повідомлення (за замовчуванням вимк.)\n";

    public HelpButton(SendMessageBotService sendMessageBotService) {
        this.sendMessageBotService = sendMessageBotService;
    }

    @Override
    public void execute(Update update, Settings settings) {
        String chatId = update.getMessage().getChatId().toString();
        sendMessageBotService.SendMessage(chatId, MESSAGE_HELP);
    }
}
