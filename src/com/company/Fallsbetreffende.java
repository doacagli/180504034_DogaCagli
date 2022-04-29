package com.company;

import java.util.Date;

public class Fallsbetreffende extends Person{
    private String interesse;

    public Fallsbetreffende(String vorname, String nachname, String BurgerId, String adresse, Date geburtsdatum, int telefonnummer, String geschlecht, String mailAdresse, String interesse) {
        super(vorname, nachname, BurgerId, adresse, geburtsdatum, telefonnummer, geschlecht, mailAdresse);
        this.interesse= interesse;
    }

    public String getInteresse() {
        return interesse;
    }

    public void setInteresse(String interesse) {
        this.interesse = interesse;
    }

    @Override
    public String toString(){
        return super.toString()+" "+interesse;
    }
}
