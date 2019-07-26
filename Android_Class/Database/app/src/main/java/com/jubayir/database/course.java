package com.jubayir.database;

public class course {

    private String Tittle,Code,Credit;


    public course() {
    }

    public course(String tittle, String code, String credit) {
        Tittle = tittle;
        Code = code;
        Credit = credit;
    }

    public String getTittle() {
        return Tittle;
    }

    public String getCode() {
        return Code;
    }

    public String getCredit() {
        return Credit;
    }
}
