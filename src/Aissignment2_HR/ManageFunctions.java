package Aissignment2_HR;

import java.util.ArrayList;

public class ManageFunctions { // this is the Array List.
    ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployees(){
        employees.add(new Employee("Miss", "Vanessa", "Tsang", "27th December 1078",
                "28 Osprey Park, Thornbury", "Bristol", "England", "Post Code",
                "07867840561", "info@vanessatsang.uk", "12345678",
                "Employee", "18th March 2019"));

        employees.add(new Employee("Mrs", "Joanne", "Tsang", "27th December 1078",
                "28 Osprey Park, Thornbury", "Bristol", "England", "Post Code",
                "07867840561", "info@vanessatsang.uk", "12345678",
                "HR Staff", "18th March 2019"));

        employees.add(new Employee("Mr", "Dean", "Tsang", "27th December 1078",
                "28 Osprey Park, Thornbury", "Bristol", "England", "Post Code",
                "07867840561", "info@vanessatsang.uk", "12345678",
                "Manager", "18th March 2019"));
    }



}