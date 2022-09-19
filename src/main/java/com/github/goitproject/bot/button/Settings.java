package com.github.goitproject.bot.button;

public class Settings {

    private boolean isCheckUSD;
    private boolean isCheckEUR;
    private boolean isCheckRUR;
    private boolean isCheckPLN;
    private boolean isCheckGBP;
    private boolean isCheckMonoBank;
    private boolean isCheckPrivatBank;
    private boolean isCheckNBU;
    private Integer TimeUpdate;
    private boolean isCheckDisableTimeUpdate;
    private Integer precision;
    private Long chatId;

    public Settings(Long chatId) {
        this.chatId = chatId;
        isCheckUSD = true;
        isCheckEUR = false;
        isCheckRUR = false;
        isCheckPLN = false;
        isCheckGBP = false;

        isCheckMonoBank = false;
        isCheckPrivatBank = false;
        isCheckNBU = true;
        TimeUpdate = 9;
        isCheckDisableTimeUpdate = true;
        precision = 2;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public Long getChatId() {
        return chatId;
    }

    public boolean isCheckUSD() {
        return isCheckUSD;
    }

    public void setCheckUSD(boolean checkUSD) {
        isCheckUSD = checkUSD;
    }

    public boolean isCheckEUR() {
        return isCheckEUR;
    }

    public void setCheckEUR(boolean checkEUR) {
        isCheckEUR = checkEUR;
    }

    public boolean isCheckRUR() {
        return isCheckRUR;
    }

    public void setCheckRUR(boolean checkRUR) {
        isCheckRUR = checkRUR;
    }

    public boolean isCheckPLN() {
        return isCheckPLN;
    }

    public void setCheckPLN(boolean checkPLN) {
        isCheckRUR = checkPLN;
    }
    public boolean isCheckGBP() {
        return isCheckGBP;
    }

    public void setCheckGBP(boolean checkGBP) {
        isCheckRUR = checkGBP;
    }

    public boolean isCheckMonoBank() {
        return isCheckMonoBank;
    }

    public void setCheckMonoBank(boolean checkMonoBank) {
        isCheckMonoBank = checkMonoBank;
    }

    public boolean isCheckPrivatBank() {
        return isCheckPrivatBank;
    }

    public void setCheckPrivatBank(boolean checkPrivatBank) {
        isCheckPrivatBank = checkPrivatBank;
    }

    public boolean isCheckNBU() {
        return isCheckNBU;
    }

    public void setCheckNBU(boolean checkNBU) {
        isCheckNBU = checkNBU;
    }

    public Integer getTimeUpdate() {
        return TimeUpdate;
    }

    public void setTimeUpdate(Integer timeUpdate) {
        TimeUpdate = timeUpdate;
    }

    public boolean isCheckDisableTimeUpdate() {
        return isCheckDisableTimeUpdate;
    }

    public void setCheckDisableTimeUpdate(boolean checkDisableTimeUpdate) {
        isCheckDisableTimeUpdate = checkDisableTimeUpdate;
    }

    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }
}
