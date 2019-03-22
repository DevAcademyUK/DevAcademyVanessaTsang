package bankAccount;

import java.util.Scanner;

public class banking { // This is the class header.
    private Scanner myScanner = new Scanner(System.in); // with this Scanner allows the user can input data.
    user u; // u is used to represents user.

    public static void main(String[] args) { // this main is also known as the action or behaviour. This is the main head.
        banking create = new banking(); // the main body starts here. This variable holds an object.
        create.getAccountUser(); // this will get the user's account details.
    }



    private void getAccountUser() { // this will user's account details.
        System.out.println("Please enter your username"); // this message will print out on the screen for user to read.
        String login = myScanner.nextLine(); // this will make a new line for user to enter their user name.

        if (login.equalsIgnoreCase("vanessa")) { // this is an if statement with a condition inside the parenthesis.
            u = createUser();
            mainMenu();
        }
        else {
            System.out.println(login + " wrong login details, try again"); // if the user enters an invalid username then this message will print out on the screen to let the user know that they've entered an invalid username..
        }
    }


    private void mainMenu() { // go back to main menu to ask the user the next message.
        System.out.println("What would you like to do?"); // this message will print out.
        String input = myScanner.nextLine(); // will go to the next line.
        checkInput(input); // checking the data the user has input is valid.
    }

    private void checkInput(String input) {
        if(input.equalsIgnoreCase("Check Balance")) { // the users input is not case sensitive.
            System.out.println("Which account do you want to check?"); // then this will be printed on the user screen.
            String acc = myScanner.nextLine(); // will go onto next line.

            if (acc.equalsIgnoreCase("current")) { // the users input is not case sensitive.
                System.out.println("The balance of your current account is: " + u.checkCurrentAccBalance()); // the user balance will be printed on the screen.
            }
            if (acc.equalsIgnoreCase("joint")) { // the users input is not case sensitive.
                System.out.println("The balance of your joint account is: " + u.checkJointAccBalance()); // the user balance will be printed on the screen.
            }
            if (acc.equalsIgnoreCase("saving")) {
                System.out.println("The balance of your saving account is: " + u.checkSavingAccBalance()); // the user balance will be printed on the screen.
            }
        }
        else if (input.equalsIgnoreCase("Deposit")) { // the users input is not case sensitive.
            System.out.println("Which account do you wish to deposit into?");
            String acc = myScanner.nextLine();

            if (acc.equalsIgnoreCase("current")) { // the users input is not case sensitive.
                System.out.println("How much would you like to deposit?: " + u.depositCurrentAcc()); // this question will be printed on screen for user to read.
            }
            if (acc.equalsIgnoreCase("joint")) { // the users input is not case sensitive.
                System.out.println("How much would you like to deposit?: " + u.depositJointAcc()); // this question will be printed on screen for user to read.
            }
            if (acc.equalsIgnoreCase("saving")) { // the users input is not case sensitive.
                System.out.println("How much would you like to deposit?: " + u.depositSavingAcc()); // this question will be printed on screen for user to read.
            }

            else if (input.equalsIgnoreCase("Withdrawals")) { // the users input is not case sensitive.
                System.out.println("Which account do you wish to withdraw from?");
                acc = myScanner.nextLine();

                if (acc.equalsIgnoreCase("current")) { // the users input is not case sensitive.
                    System.out.println("How much would you like to withdraw?: " + u.withdrawCurrentAcc()); // this question will be printed on screen for user to read.
                }
                if (acc.equalsIgnoreCase("joint")) { // the users input is not case sensitive.
                    System.out.println("How much would you like to withdraw?: " + u.withdrawJointAcc()); // this question will be printed on screen for user to read.
                }
                if (acc.equalsIgnoreCase("saving")) { // the users input is not case sensitive.
                    System.out.println("How much would you like to withdraw?: " + u.withdrawSavingAcc()); // this question will be printed on screen for user to read.
                }
            }
        }
    }

    private user createUser() { // this is to create a new user to login and create new bank accounts of various types.
        System.out.println("Please enter your username"); // this will be printed on screen to prompted user to input their username.
        String username = myScanner.nextLine(); // this will make the next line.
        System.out.println("Please enter your password"); // this will be printed on screen to prompted user to input their username.
        String password = myScanner.nextLine(); // this will make the next line.
        user u = new user(username, password, "500", "500", "500"); // these are the info java will ask for from user and the amount up to the user can request for.

       return u; // the end.
    }

}