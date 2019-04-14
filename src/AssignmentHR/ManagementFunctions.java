package AssignmentHR;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

class ManagementFunctions {

    private ArrayList<Employee> employees = new ArrayList<Employee>();
    private Scanner myScanner = new Scanner(System.in);

    // Below is the Method to populate the array list with data at the start of the application.
    void populateList() {

    /* Below is 3 examples of employees within the company: employee, manager and HR team.
    They all have different level of capabilities. Employees can view their data (or details) and manage some of their data themselves. HR team has the
    capabilities to view a list of all employees and add new employees. HR Manger has all the capabilities as employees and HR team, plus can change employee's data
     sort all info into ascending or descending order as required */

        employees.add(new Employee("Miss", // adding my employee object to the array list named "Employee".
                "Vanessa",
                "Tsang",
                "1985 12 27",
                "28 Osprey Park",
                "Bristol",
                "South Gloucestershire",
                "BS35 1LX",
                "07867840562",
                "tai.tsang@gmail.com",
                1234,
                "employee",
                "2019 03 18"));
        employees.add(new Employee("Mr", // adding another employee object to the array list.
                "Joe",
                "White",
                "1985 08 08",
                "12 Park Street",
                "Bristol",
                "Bristol",
                "BS1 7PP",
                "07451236522",
                "joe.white@gmail.com",
                8888,
                "manager",
                "2015 07 18"));

        employees.add(new Employee("Mrs", // adding another employee object to the array list.
                "Sam",
                "Brown",
                "1985 08 10",
                "8 Fellow Avenue",
                "Bath",
                "Somerset",
                "BA1 8TT",
                "07451236512",
                "sam.brown8.@gmail.com",
                7788,
                "hr",
                "2011 10 20"));
    }

    // Below is the Method to add a new employee to the arrayList. For security reasons, the data is set to private rather than public.
    private void addEmployee(Employee e) {
        this.employees.add(e);
    }

    // Below is the Method to return a list of employees. Its an Array List rather than a normal list.
    ArrayList<Employee> getEmployees() {
        return this.employees;
    }

    // Below is the Method to add a new employee based on the user input.
    void addNewEmployee() {
        System.out.println("Please input your title (i.e. Miss, Mrs or Mr)");
        String title = myScanner.nextLine();
        System.out.println("Please input your forename");
        String forename = myScanner.nextLine();
        System.out.println("Please input your surname");
        String surname = myScanner.nextLine();
        System.out.println("Please input your date of birth");
        String dOB = myScanner.nextLine();
        System.out.println("Please input the first line of your address");
        String address = myScanner.nextLine();
        System.out.println("Please input the town or city");
        String town = myScanner.nextLine();
        System.out.println("Please input the county");
        String county = myScanner.nextLine();
        System.out.println("Please input the Post Code");
        String postCode = myScanner.nextLine();
        System.out.println("Please input contact your mobile number");
        String contactNumber = myScanner.nextLine();
        System.out.println("Please input your email address");
        String emailAddress = myScanner.nextLine();
        System.out.println("Please input employee ID");
        int employeeID = Integer.parseInt(myScanner.nextLine());
        System.out.println("Please input your position");
        String position = myScanner.nextLine();
        System.out.println("Please input the start date of your current job");
        String startDate = myScanner.nextLine();
        Employee newEmployee = new Employee(title, forename, surname, dOB, address, town, county,
                postCode, contactNumber, emailAddress, employeeID, position, startDate);
        addEmployee(newEmployee);


    }

    // Below is the Method to show a list of all the employees.
    void showEmployees() {
        for (Employee e : employees) {
            System.out.println("Employee: " + e.title + " " + e.forename + " " + e.surname + " DOB: " + e.dOB + " Address: " + e.address1
                    + " " + e.town + " " + e.county + " " + e.postCode + " Contact number: " + e.contactNumber + " Email Address: "
                    + e.emailAddress + " Employee ID: " + e.employeeID + " Position: " + e.position + " Start Date: " + e.startDate);
        }
    }

    // Below is the Method to display the user's data based on inputted name. May be best based on inputted Employee ID?
    void showUserData(String userName) {

        for (Employee e : employees) {
            if (userName.equalsIgnoreCase(e.forename)) {
                System.out.println("Your details are:");
                System.out.println("Employee: " + e.title + " " + e.forename + " " + e.surname + " DOB: " + e.dOB + " Address: " + e.address1
                        + " " + e.town + " " + e.county + " " + e.postCode + " Contact number: " + e.contactNumber + " Email Address: "
                        + e.emailAddress + " Employee ID: " + e.employeeID + " Position: " + e.position + " Start Date: " + e.startDate);
            }
        }
    }

    // Below is the Method to change the details of an employee.
    void changeDetails(String userName, String position) {
        if (position.equalsIgnoreCase("hr") || position.equalsIgnoreCase("manager")) {
            System.out.println("Please input the name of the employee you wish to make change(s) to");
            userName = myScanner.nextLine();
        }
        System.out.println("Please select the field you wish to change");
        System.out.println("1 - Title");
        System.out.println("2 - Forename");
        System.out.println("3 - Surname");
        System.out.println("4 - Address");
        System.out.println("5 - Town");
        System.out.println("6 - County");
        System.out.println("7 - Post Code");
        System.out.println("8 - Contact Number");
        System.out.println("9 - Email Address");
        if (position.equalsIgnoreCase("hr") || position.equalsIgnoreCase("manager")) {
            System.out.println("10 - Date of Birth");
            System.out.println("11 - Employee ID");
            System.out.println("12 - Position");
            System.out.println("13 - Start Date");
        }
        int input = Integer.parseInt(myScanner.nextLine());
        for (Employee e : employees) { // this is a for loop.
            if (userName.equalsIgnoreCase(e.forename)) { // this is the start of the 'if' statement.
                if (position.equalsIgnoreCase("employee") || position.equalsIgnoreCase("hr")
                        || position.equalsIgnoreCase("manager")) {
                    switch (input) { // this is a 'switch case' with x9 cases.
                        case 1:
                            System.out.println("Please input the new title");
                            e.title = myScanner.nextLine();
                            System.out.println("Your new title is: " + e.title.toUpperCase()); // the function call title.toUpperCase()); returns the string obtained by replacing any lower case letters in the name with upper case letters.
                            break;
                        case 2:
                            System.out.println("Please input the new forename");
                            e.forename = myScanner.nextLine();
                            System.out.println("Your new forename is " + e.forename.toUpperCase());
                            break;
                        case 3:
                            System.out.println("Please input the new surname");
                            e.surname = myScanner.nextLine();
                            System.out.println("Your new forename is " + e.surname.toUpperCase());
                            break;
                        case 4:
                            System.out.println("Please input the new address");
                            e.address1 = myScanner.nextLine();
                            System.out.println("Your new address is " + e.address1.toUpperCase());
                            break;
                        case 5:
                            System.out.println("Please input the new town");
                            e.town = myScanner.nextLine();
                            System.out.println("Your new town is " + e.town.toUpperCase());
                            break;
                        case 6:
                            System.out.println("Please input the new county");
                            e.county = myScanner.nextLine();
                            System.out.println("Your new county is " + e.county.toUpperCase());
                            break;
                        case 7:
                            System.out.println("Please input the new post code");
                            e.postCode = myScanner.nextLine();
                            System.out.println("Your new post code is " + e.postCode.toUpperCase());
                            break;
                        case 8:
                            System.out.println("Please input the new contact number");
                            e.contactNumber = myScanner.nextLine();
                            System.out.println("Your new contact number is " + e.contactNumber);
                        case 9:
                            System.out.println("Please input the new email address");
                            e.emailAddress = myScanner.nextLine();
                            System.out.println("Your new email address is " + e.emailAddress);
                        default:
                            System.out.println("Wrong input. Please try again"); // if user enters wrong input, this message will print out as an default.
                            break;
                    }
                    if (position.equalsIgnoreCase("hr") || position.equalsIgnoreCase("manager")) {
                        switch (input) {
                            case 10:
                                System.out.println("Please input the new date of birth");
                                e.dOB = myScanner.nextLine(); // this creates new line for user to input their new D.O.B.
                                System.out.println("Your new date of birth is: " + e.dOB); // this confirms the user input - their new date of birth.
                                break; // this is used to "jump out" of the switch statement.
                            case 11:
                                System.out.println("Please input the new Employee ID");
                                e.employeeID = myScanner.nextInt();
                                System.out.println("Your new Employee ID is " + e.employeeID);
                                break;
                            case 12:
                                System.out.println("Please input the new Position");
                                e.position = myScanner.nextLine();
                                System.out.println("Your new position is " + e.position);
                                break;
                            case 13:
                                System.out.println("Please input the new start date");
                                e.startDate = myScanner.nextLine();
                                System.out.println("Your new start date is " + e.startDate);
                                break;
                            default:
                                System.out.println("Wrong input. Please try again");
                                break;
                        }

                    }
                }
            }
        }

    }

    // Below is the Method to get a sorted list of object property based on user input.
    void getSortedLists(){
        System.out.println("Please select which field you wish to sort : title, forename, surname, dob, address, town, county, post code, contact number, email, id, position, start date");
        String fieldToSort = myScanner.nextLine().toLowerCase();
        System.out.println("Please select order:");
        System.out.println("A - Ascending Order");
        System.out.println("D - Descending Order");
        String order = myScanner.nextLine();
        switch (fieldToSort){
            case "title":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.compareTitle);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.compareTitle.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.title);
                }
                break;

            case "forename":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.compareForename);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.compareForename.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.forename);
                }
                break;

            case "surname":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.compareSurname);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.compareSurname.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.surname);
                }
                break;

            case "dob":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.compareDOB);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.compareDOB.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.dOB + " " + e.forename);
                }
                break;

            case "address":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.compareAddress);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.compareAddress.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.address1);
                }
                break;

            case "town":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.compareTown);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.compareTown.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.town);
                }
                break;

            case "county":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.compareCounty);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.compareCounty.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.county);
                }
                break;

            case "post code":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.comparePostCode);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.comparePostCode.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.postCode);
                }
                break;

            case "contact number":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.compareContactNumber);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.compareContactNumber.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.contactNumber);
                }
                break;

            case "email":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.compareEmailAddress);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.compareEmailAddress.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.emailAddress);
                }
                break;

            case "id":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.compareID);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.compareID.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.employeeID);
                }
                break;

            case "position":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.comparePosition);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.comparePosition.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.position);
                }
                break;

            case "start date":
                if (order.equalsIgnoreCase("a")){
                    Collections.sort(employees, Employee.compareStartDate);

                } else if (order.equalsIgnoreCase("d")){
                    Collections.sort(employees, Employee.compareStartDate.reversed());
                }
                for (Employee e: employees){
                    System.out.println(e.startDate + " " + e.forename);
                }
                break;

            default:
                System.out.println("Wrong input. Please try again");
                getSortedLists();
                break;
        }

    }


}
