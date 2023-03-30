/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

import java.time.LocalDate;
import java.util.Date;

public class Procedure {

    private String procedureName;
    private LocalDate date;
    private String PractitionerName;
    private double procedureCharge;

    public Procedure(String procedureName,
                     LocalDate date,
                     String practitionerName,
                     double procedureCharge) {
        this.procedureName = procedureName;
        this.date = date;
        PractitionerName = practitionerName;
        this.procedureCharge = procedureCharge;
    }

    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPractitionerName() {
        return PractitionerName;
    }

    public void setPractitionerName(String practitionerName) {
        PractitionerName = practitionerName;
    }

    public double getProcedureCharge() {
        return procedureCharge;
    }

    public void setProcedureCharge(double procedureCharge) {
        this.procedureCharge = procedureCharge;
    }
}
