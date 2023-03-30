/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class Payroll {

    private String empName;
    private int empID;

    private double empPayRate;
    private double hoursWorked;

    public String getEmpName() {
        return empName;
    }

    public Payroll(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public double getEmpPayRate() {
        return empPayRate;
    }

    public void setEmpPayRate(double empPayRate) {
        this.empPayRate = empPayRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getGrossPay() {
        return getHoursWorked() * getEmpPayRate();
    }
}
