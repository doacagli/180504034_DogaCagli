package com.company;
import java.util.ArrayList;
import java.util.Date;

public class Termin {
    private Date terminDate;

    public Termin(Date terminDate) {
        this.terminDate = terminDate;
    }

    public Date getTerminDate() {
        return terminDate;
    }

    public void setTerminDate(Date terminDate) {
        this.terminDate = terminDate;
    }
}
