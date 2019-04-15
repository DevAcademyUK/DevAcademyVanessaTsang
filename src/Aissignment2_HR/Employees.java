package Aissignment2_HR;

import java.util.Comparator;

public class Employees { // this is the object that contains the employee's details.

    private String title;
    private String forename;
    private String surname;
    private String dob;
    private String address1;
    private String townCity;
    private String country;
    private String postCode;
    private String contactNumber;
    private String emailAddress;
    private String employeeID;
    private String position;
    private String startDate;

    public Employees(String title, String forename, String surname, String dob, String address1, String townCity,
                     String country, String postCode, String contactNumber, String emailAddress, String employeeID,
                     String position, String startDate) { // this is the constructor.

        this.title = title;
        this.forename = forename;
        this.surname = surname;
        this.dob = dob;
        this.address1 = address1;
        this.townCity = townCity;
        this.country = country;
        this.postCode = postCode;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.employeeID = employeeID;
        this.position = position;
        this.startDate = startDate;

    }

    public static Comparator<Employee> employeeTitleComparator = new Comparator<Employee> (){
        @Override
        public int compare(Employee e1, Employee e2) {

            String employee1 = e1.title.toUpperCase();
            String employee2 = e2.title.toUpperCase();

            return employee1.compareTo(employee2);


        }
    };


}