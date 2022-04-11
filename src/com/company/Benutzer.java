package com.company;

import java.net.PasswordAuthentication;

public class Benutzer extends Person{
    private String PersonalID;
    private String Password;
    private String Arbeitsstelle;
    private String Arbeitsanfangsdatum;

    public String getPersonalID() {
        return PersonalID;
    }

    public void setPersonalID(String personalID) {
        PersonalID = personalID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getArbeitsstelle() {
        return Arbeitsstelle;
    }

    public void setArbeitsstelle(String arbeitsstelle) {
        Arbeitsstelle = arbeitsstelle;
    }

    public String getArbeitsanfangsdatum() {
        return Arbeitsanfangsdatum;
    }

    public void setArbeitsanfangsdatum(String arbeitsanfangsdatum) {
        Arbeitsanfangsdatum = arbeitsanfangsdatum;
    }
}
