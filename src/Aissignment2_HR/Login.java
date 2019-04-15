package Aissignment2_HR;

import java.util.Scanner;

public class Login {

    private Scanner myScanner = new Scanner(System.in);
    ManageFunctions manageFunctions;



    public static void main(String[] args) {

        Login log= new Login();
        log.manageFunctions.addEmployees();

    }

    private void employee1() { // this will prompt the User to enter their login details to populate the User Class.
        System.out.println("Please enter your title"); // this message (character, String) will print out on the screen for User to read.
        String username = myScanner.nextLine(); // this will make a new line for User to enter their Username.


        if (employee1().equalsIgnoreCase("Vanessa")) { // this checks the username is correct - 'Vanessa' before it can execute the body of this 'if' statement. The data input by the user is not case sensitive.
            u = createUser(username); // this creates the User with the specified username.
            mainMenu(); // this takes the User back to main menu to ask the User the next question.
        } else {
            System.out.println(username + " wrong login details, try again"); // if the User enters an invalid username, then this message (String) will print out on the screen to let the User know that they've entered an invalid username.
        }
    }


}
