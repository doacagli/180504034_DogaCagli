package com.company;

import java.net.PasswordAuthentication;

public class Benutzer extends Person{
    private String personalID;
    private String password;
    private String arbeitsstelle;
    private String arbeitsanfangsdatum;

    public String getPersonalID() {
        return personalID;
    }

    public void setPersonalID(String personalID) {
        this.personalID = personalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getArbeitsstelle() {
        return arbeitsstelle;
    }

    public void setArbeitsstelle(String arbeitsstelle) {
        this.arbeitsstelle = arbeitsstelle;
    }

    public String getArbeitsanfangsdatum() {
        return arbeitsanfangsdatum;
    }

    public void setArbeitsanfangsdatum(String arbeitsanfangsdatum) {
        this.arbeitsanfangsdatum = arbeitsanfangsdatum;
    }
}
