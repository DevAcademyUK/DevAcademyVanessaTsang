package switches;

import java.util.Scanner;

public class parking {
    Scanner myScanner = new Scanner(System.in);

    public static void main (String[] argas) { // this is the entry point.

        parking p = new parking(); // this parenthesis is like a constructor.
        p.getInput();
    }

    private void getInput() { // this is for the day -  see below.
        System.out.println("What day is it?"); // a string asking the User to input their answer that will be printed out.
        String day = myScanner.nextLine();
        System.out.println("How long will you be staying?");
        int duration = Integer.parseInt(myScanner.nextLine()); // the int data type is used here as the figure size of the duration would be up to 8 bits.
        System.out.println("What position do you hold within the college?(Staff, Student, Visitor)"); // this string (text) will be printed out on screen.
        String position = myScanner.nextLine(); // this will create a space for User to input their data that will be printed out.
        calculateFees(day, duration, position); // this is creating the calculator to calcuate the duration of the User's stay.
    }

    private void calculateFees(String day, int duration, String position) { // creating the constructor form selections.
        int cost;
        int hourlyRate = 0;
        int multiplier = 0;

        switch (position) { // switch statements must be provided with a value to evaluate a String or Integer variable.
            case "Staff": // here we have both a String and a variable.
                multiplier = 2;
                break;

            case  "Student":
                multiplier = 1;
                break;

            case "Visitor":
                multiplier = 3;
                break;

            default:
                System.out.println("Invalid input for position, please retry");
                getInput(); // this will send User back up to start 'private void getInput' for the User to make their choices again.
        }

        switch (day) { // User must choose one of the below day.
            case "Monday":
                hourlyRate = 2;
                break; // this means 'stop' if they User input 'Monday'. This is case sensitive.

            case "Tuesday":
                hourlyRate = 2;
                break;

            case "Wednesday":
                hourlyRate = 3;
                break;

            case "Thursday":
                hourlyRate = 2;
                break;

            case "Friday":
                hourlyRate = 3;
                break;

            case "Saturday":
                hourlyRate = 4;
                break;

            case "Sunday":
                hourlyRate = 5;
                break;

                default:
                    System.out.println("Invalid input for position, please retry");
                    getInput();

        }

        cost = (hourlyRate * multiplier) * duration; // calculate equation inside of brackets first. Example: (Monday is 2 x Staff is 2) x duration is 5 = £20.
        System.out.println("Thanks for parking at Gateshead College. Please pay: £" + cost);

    }
}
