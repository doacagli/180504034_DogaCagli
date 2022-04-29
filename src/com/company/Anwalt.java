package com.company;

import java.util.Date;

public class Anwalt extends Benutzer{
    public Anwalt(String vorname, String nachname, String BurgerId, String adresse, Date geburtsdatum, int telefonnummer, String geschlecht, String mailAdresse, String personalID, String pswort, String bname, String aStelle) {
        super(vorname, nachname, BurgerId, adresse, geburtsdatum, telefonnummer, geschlecht, mailAdresse, personalID, pswort, bname, aStelle);
    }

    private void updateKundenInfo(String Vorname, String Nachname, String EheStatus, String Beruf, String TerminDatum, String Geschlecht, String Telefonnummer, String Adresse, String Geburtsdatum) {
    }
    private void setTermin(String BurgerID, String TerminDatum){
    }

}
