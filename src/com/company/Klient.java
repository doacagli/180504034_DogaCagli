package com.company;

public class Klient extends Person{
    private String geschlecht;
    private String beruf;
    private String eheStatus;
    private String terminDatum;
    private String rechtsfall;

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String getBeruf() {
        return beruf;
    }

    public void setBeruf(String beruf) {
        this.beruf = beruf;
    }

    public String getEheStatus() {
        return eheStatus;
    }

    public void setEheStatus(String eheStatus) {
        this.eheStatus = eheStatus;
    }

    public String getTerminDatum() {
        return terminDatum;
    }

    public void setTerminDatum(String terminDatum) {
        this.terminDatum = terminDatum;
    }

}
