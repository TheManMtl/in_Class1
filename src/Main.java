/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        callPayroll();
       // callCircle();
        //callPet();
        //callTestScores();
       // callPatientProcedure();
       //callWidget();
    }

    private static void callPayroll() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee name: ");
        String employeeName = sc.next();

        System.out.print("Enter employee ID: ");
        int employeeID = sc.nextInt();

        System.out.print("Enter Hours worked: ");
        double hoursWorked = sc.nextDouble();

        System.out.print("Enter Pay Rate: ");
        double payRateHourly = sc.nextDouble();

        Payroll payrollOne = new Payroll(employeeName, employeeID);
        payrollOne.setEmpPayRate(payRateHourly);
        payrollOne.setHoursWorked(hoursWorked);
        System.out.println("Employee: " + employeeName + "\nGross Pay is: "
                + payrollOne.getGrossPay());

        //Employee 2

        System.out.print("Enter Employee name: ");
        employeeName = sc.next();

        System.out.print("Enter employee ID: ");
        employeeID = sc.nextInt();

        System.out.print("Enter Hours worked: ");
        hoursWorked = sc.nextDouble();

        System.out.print("Enter Pay Rate: ");
        payRateHourly = sc.nextDouble();

        Payroll payrollTwo = new Payroll(employeeName, employeeID);
        payrollTwo.setHoursWorked(hoursWorked);
        payrollTwo.setEmpPayRate(payRateHourly);

        System.out.println("Employee: " + employeeName + "\nGross Pay is: "
                + payrollTwo.getGrossPay());
    }

    private static void callWidget() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many widgets you need? ");
        int quantity = sc.nextInt();
        WidgetFactory wf = new WidgetFactory(quantity);
        double period = wf.getDaysOfManufacturing();
        double hours = period % 1;
        double days = period - hours;

        System.out.println("The time to produce " + wf.getQuantity() + " of widgets is: ");
        //1 working day is 16 hours
        hours *= 16;
        System.out.println(days + " day(s) " + hours + " hours ");
    }

    private static void callTestScores() {
        Scanner sc = new Scanner(System.in);
        double score;
        TestScores ts = new TestScores();
        System.out.print("Enter First Score: ");
        score = sc.nextDouble();
        ts.setScore1(score);

        System.out.print("Enter Second Score: ");
        score = sc.nextDouble();
        ts.setScore2(score);

        System.out.print("Enter Third Score: ");
        score = sc.nextDouble();
        ts.setScore3(score);

        System.out.println("Average of the scores are : " + ts.averageScores());

    }

    private static void callCircle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the Circle : ");
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println(" Area : " + circle.getArea() +
                "\n Diameter : " + circle.getDiameter() +
                "\n Circumference: " + circle.getCircumference());
    }

    private static void callPet() {

        Scanner sc = new Scanner(System.in);
        String petName;
        String petType;
        double petAge;
        Pet petOne = new Pet();
        System.out.print("Enter the animal Name : ");
        petName = sc.next();

        System.out.print("Enter the animal Type : ");
        petType = sc.next();

        System.out.print("Enter the animal Age : ");
        petAge = sc.nextDouble();

        petOne.setName(petName);
        petOne.setType(petType);
        petOne.setAge(petAge);

        Pet petTwo = new Pet();
        System.out.print("Enter the Name : ");
        petName = sc.next();

        System.out.print("Enter the Type : ");
        petType = sc.next();

        System.out.print("Enter the Age : ");
        petAge = sc.nextDouble();

        petTwo.setName(petName);
        petTwo.setType(petType);
        petTwo.setAge(petAge);


        System.out.println("Pet Number one info:\n" +
                "Name: " + petOne.getName() + " Type: " + petOne.getType() + " Age: " + petOne.getAge());

        System.out.println("Pet Number Two info:\n" +
                "Name: " + petTwo.getName() + " Type: " + petTwo.getType() + " Age: " + petTwo.getAge());
    }

    private static void callPatientProcedure() {
        Patient patOne = new Patient("Iron",
                "man",
                "Newyork",
                "sherbrook",
                "Manhatan",
                "NY",
                "552021",
                "5552223135",
                "Captain America",
                "5561235456");

        Procedure proOne = new Procedure("Appendectomy",
                LocalDate.of(2023, 02, 15),
                "Dr. Nick Fury",
                5423.25);

        Procedure proTwo = new Procedure("Breast biopsy",
                LocalDate.of(2023, 01, 05),
                "Dr. Pepper Pots",
                9524.98);


        Procedure proThree = new Procedure("Carotid endarterectomy",
                LocalDate.of(2022, 12, 15),
                "Dr. Hulk",
                7582.25);

        System.out.println("Patient's information");

        System.out.println(
                " Full Name: " + patOne.getFirstName() + " " + patOne.getMiddleName() + " " + patOne.getLastName() +
                        "\n Phone Number: " + patOne.getPhoneNumber() +
                        "\n Address: " + patOne.getStreet() + ", " + patOne.getCity() + ", " +
                        patOne.getState() + ", " + patOne.getZipCode() +
                        "\n Emergency Contact: " + patOne.getEmergencyName() +
                        "\n Emergency phone Number: " + patOne.getEmergencyPhone()
        );
        System.out.println("Procedure Information: ");

        String date = proOne.getDate().toString();

        System.out.println("Procedure Name   " + "  |  " +
                "Practitioner       " + "  |  " +
                "Cost         " + "  |  " + "Date        ");
        System.out.println(" " + proOne.getProcedureName() + "        |  " +
                " " + proOne.getPractitionerName() + "      |  " +
                " " + proOne.getProcedureCharge() + "       |  " +
                " " + date
        );
        date = proTwo.getDate().toString();
        System.out.println(" " + proTwo.getProcedureName() + "  |  " +
                " " + proTwo.getPractitionerName() + "  |  " +
                " " + proTwo.getProcedureCharge() + "  |  " +
                " " + date
        );
        date = proThree.getDate().toString();
        System.out.println(" " + proThree.getProcedureName() + "  |  " +
                " " + proThree.getPractitionerName() + "  |  " +
                " " + proThree.getProcedureCharge() + "  |  " +
                " " + date
        );
        double totalCost = proOne.getProcedureCharge() +
                proTwo.getProcedureCharge() + proThree.getProcedureCharge();
        System.out.println();
        System.out.println("Total Cost of Procedures: $" + totalCost);
    }
}
