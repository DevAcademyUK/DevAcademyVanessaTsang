package bankAccount;

import java.util.Scanner;

public class banking { // with this Scanner the user can input data. This is the class header.
    private Scanner myScanner = new Scanner(System.in);
    user u;

    public static void main(String[] args) { // this is the class body.
        banking create = new banking();
        create.getAccountUser();
    }



    private void getAccountUser() { // this is the method/action.
        System.out.println("Please enter your username");
        String login = myScanner.nextLine();

        if (login.equalsIgnoreCase("vanessa")) { // this is a if...else statement.
            u = createUser();
            mainMenu();
        }
        else {
            System.out.println(login + " wrong login details, try again");
        }
    }


    private void mainMenu() {
        System.out.println("What would you like to do?");
        String input = myScanner.nextLine();
        checkInput(input);
    }

    private void checkInput(String input) {
        if(input.equalsIgnoreCase("Check Balance")) {
            System.out.println("Which account do you want to check?");
            String acc = myScanner.nextLine();

            if (acc.equalsIgnoreCase("current")) {
                System.out.println("The balance of your current account is: " + u.checkCurrentAccBalance());
            }
            if (acc.equalsIgnoreCase("joint")) {
                System.out.println("The balance of your joint account is: " + u.checkJointAccBalance());
            }
            if (acc.equalsIgnoreCase("saving")) {
                System.out.println("The balance of your saving account is: " + u.checkSavingAccBalance());
            }
        }
        else if (input.equalsIgnoreCase("Deposit")) {
            System.out.println("Which account do you wish to deposit into?");
            String acc = myScanner.nextLine();

            if (acc.equalsIgnoreCase("current")) {
                System.out.println("How much would you like to deposit?: " + u.depositCurrentAcc());
            }
            if (acc.equalsIgnoreCase("joint")) {
                System.out.println("How much would you like to deposit?: " + u.depositJointAcc());
            }
            if (acc.equalsIgnoreCase("saving")) {
                System.out.println("How much would you like to deposit?: " + u.depositSavingAcc());
            }

            else if (input.equalsIgnoreCase("Withdrawals")) {
                System.out.println("Which account do you wish to withdraw from?");
                acc = myScanner.nextLine();

                if (acc.equalsIgnoreCase("current")) {
                    System.out.println("How much would you like to withdraw?: " + u.withdrawCurrentAcc());
                }
                if (acc.equalsIgnoreCase("joint")) {
                    System.out.println("How much would you like to withdraw?: " + u.withdrawJointAcc());
                }
                if (acc.equalsIgnoreCase("saving")) {
                    System.out.println("How much would you like to withdraw?: " + u.withdrawSavingAcc());
                }
            }
        }
    }

    private user createUser() { // this is the method to create a new user to login and create new bank accounts of various types.
        System.out.println("Please enter your username");
        String username = myScanner.nextLine();
        System.out.println("Please enter your password");
        String password = myScanner.nextLine();
        user u = new user(username, password, "500", "500", "500");

       return u;
    }

}