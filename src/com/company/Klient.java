package com.company;

public class Klient extends Person{
    private String Geschlecht;
    private String Beruf;
    private String EheStatus;
    private String TerminDatum;
    private String Rechtsfall;

    public String getGeschlecht() {
        return Geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        Geschlecht = geschlecht;
    }

    public String getBeruf() {
        return Beruf;
    }

    public void setBeruf(String beruf) {
        Beruf = beruf;
    }

    public String getEheStatus() {
        return EheStatus;
    }

    public void setEheStatus(String eheStatus) {
        EheStatus = eheStatus;
    }

    public String getTerminDatum() {
        return TerminDatum;
    }

    public void setTerminDatum(String terminDatum) {
        TerminDatum = terminDatum;
    }

}
