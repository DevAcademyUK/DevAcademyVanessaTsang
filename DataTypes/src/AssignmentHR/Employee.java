package AssignmentHR;

import java.time.LocalDate; // Obtains an instance of Local Date from a temporal object.
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

class Employee { // the three different employees of the system.

// 'String' is an object that represents sequence of char values.
    String title;
    String forename;
    String surname;
    String dOB;
    String address1;
    String town;
    String county;
    String postCode;
    String contactNumber;
    String emailAddress;
    int employeeID;
    String position;
    String startDate;

    // Below is the Employee object constructor (the blue print).
    Employee(String title, String forename, String surname, String dOB, String address1, String town,
             String county, String postCode, String contactNumber, String emailAddress,
             int employeeID, String position, String startDate) {

        this.title = title;
        this.forename = forename;
        this.surname = surname;
        this.dOB = dOB;
        this.address1 = address1;
        this.town = town;
        this.county = county;
        this.postCode = postCode;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.employeeID = employeeID;
        this.position = position;
        this.startDate = startDate;

    }

    // Comparators based on every property of the Employee object.


    static Comparator<Employee> compareTitle = new Comparator<Employee>() {
        @Override // using the same method with same name but my version, defining it.
        public int compare(Employee e1, Employee e2) {
            String employee1 = e1.title.toUpperCase();
            String employee2 = e2.title.toUpperCase();

            return employee1.compareTo(employee2);
        }
    }; // what is this semicolon for????

    static Comparator<Employee> compareForename = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            String employee1 = e1.forename.toUpperCase();
            String employee2 = e2.forename.toUpperCase();

            return employee1.compareTo(employee2);
        }
    }; // every statement in java has to ends with a semicolon.

    static Comparator<Employee> compareSurname = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            String employee1 = e1.surname.toUpperCase();
            String employee2 = e2.surname.toUpperCase();

            return employee1.compareTo(employee2);
        }
    };

    static Comparator<Employee> compareDOB = new Comparator<Employee>() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        @Override
        public int compare(Employee e1, Employee e2) {
            LocalDate employee1 = LocalDate.parse(e1.dOB, formatter);
            LocalDate employee2 = LocalDate.parse(e2.dOB, formatter);

            return employee1.compareTo(employee2);
        }
    };

    static Comparator<Employee> compareAddress = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            String employee1 = e1.address1.toUpperCase();
            String employee2 = e2.address1.toUpperCase();

            return employee1.compareTo(employee2);
        }
    };

    static Comparator<Employee> compareTown = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            String employee1 = e1.town.toUpperCase();
            String employee2 = e2.town.toUpperCase();

            return employee1.compareTo(employee2);
        }
    };

    static Comparator<Employee> compareCounty = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            String employee1 = e1.county.toUpperCase();
            String employee2 = e2.county.toUpperCase();

            return employee1.compareTo(employee2);
        }
    };

    static Comparator<Employee> comparePostCode = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            String employee1 = e1.postCode.toUpperCase();
            String employee2 = e2.postCode.toUpperCase();

            return employee1.compareTo(employee2);
        }
    };

    static Comparator<Employee> compareContactNumber = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            String employee1 = e1.contactNumber.toUpperCase();
            String employee2 = e2.contactNumber.toUpperCase();

            return employee1.compareTo(employee2);
        }
    };

    static Comparator<Employee> compareEmailAddress = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            String employee1 = e1.emailAddress.toUpperCase();
            String employee2 = e2.emailAddress.toUpperCase();

            return employee1.compareTo(employee2);
        }
    };

    static Comparator<Employee> compareID = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            int employee1 = e1.employeeID;
            int employee2 = e2.employeeID;

            return Integer.compare(employee1, employee2);
        }
    };

    static Comparator<Employee> comparePosition = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            String employee1 = e1.position.toUpperCase();
            String employee2 = e2.position.toUpperCase();

            return employee1.compareTo(employee2);
        }
    };

    static Comparator<Employee> compareStartDate = new Comparator<Employee>() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        @Override
        public int compare(Employee e1, Employee e2) {
            LocalDate employee1 = LocalDate.parse(e1.startDate, formatter);
            LocalDate employee2 = LocalDate.parse(e2.startDate, formatter);
            return employee1.compareTo(employee2);
        }
    };


}