package com.company;

import java.util.zip.Adler32;

public class Person {
    private String Vorname;
    private String Nachname;
    private String BurgerID;
    private String Adresse;
    private String Geburtsdatum;
    private String Telefonnummer;
    private String Geschlecht;

    public String getGeschlecht() {
        return Geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        Geschlecht = geschlecht;
    }

    public String getTelefonnummer() {
        return Telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        Telefonnummer = telefonnummer;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public String getBurgerID() {
        return BurgerID;
    }

    public void setBurgerID(String burgerID) {
        BurgerID = burgerID;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getGeburtsdatum() {
        return Geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        Geburtsdatum = geburtsdatum;
    }
}
