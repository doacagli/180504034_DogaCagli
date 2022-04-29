package com.company;

import java.net.PasswordAuthentication;
import java.util.Date;


public class Benutzer extends Person{
    private String PersonalID;
    private String Passwort;
    private String Benutzername;
    private String Arbeitsstelle;

    public Benutzer(String vorname, String nachname, String BurgerId, String adresse, Date geburtsdatum, int telefonnummer, String geschlecht, String mailAdresse, String personalID, String pswort, String bname, String aStelle){
        super(vorname, nachname, BurgerId, adresse, geburtsdatum, telefonnummer, geschlecht, mailAdresse);
        this.Benutzername=bname;
        this.Passwort=pswort;
        this.PersonalID=personalID;
        this.Arbeitsstelle=aStelle;

    }

    public String getPersonalID() {
        return PersonalID;
    }

    public void setPersonalID(String personalID) {
        PersonalID = personalID;
    }

    public String getPasswort() {
        return Passwort;
    }

    public void setPasswort(String passwort) {
        Passwort = passwort;
    }

    public String getBenutzername() {
        return Benutzername;
    }

    public void setBenutzername(String benutzername) {
        Benutzername = benutzername;
    }

    public String getArbeitsstelle() {
        return Arbeitsstelle;
    }

    public void setArbeitsstelle(String arbeitsstelle) {
        Arbeitsstelle = arbeitsstelle;
    }

    @Override
    public String toString(){
        return super.toString()+" "+Benutzername+" "+Passwort+" "+PersonalID+" "+Arbeitsstelle;
    }
}
