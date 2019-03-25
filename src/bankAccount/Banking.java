package bankAccount;

import java.util.Scanner;

public class Banking { // Everything within this bracket belong to the Class called Banking. This class runs the programme.

    public Banking() { }

    private Scanner myScanner = new Scanner(System.in);// with this Scanner allows the User can input their data to use this programme.
    User u; // This 'u' is  an instance to represents 'User'. This variable 'u' holds all the data for this user.
    double amount = 4000; // this 4000 is the initial amount in the users account. The data type 'double' is the type of date that can hold decimals (not whole numbers like an 'int'.

    public static void main(String[] args) { // this main method is also known as the action or behaviour. This main header will run by default within the bankAccount package.
        Banking create = new Banking(); // This is creating a new instance of the class Banking.
        create.getAccountUser(); // this is getting the User's account details.
    }


    private void getAccountUser() { // this will prompt the User to enter their login details to populate the User Class.
        System.out.println("Please enter your username"); // this message (character, String) will print out on the screen for User to read.
        String username = myScanner.nextLine(); // this will make a new line for User to enter their Username.


        if (username.equalsIgnoreCase("vanessa")) { // this checks the username is correct - 'Vanessa' before it can execute the body of this 'if' statement. The data input by the user is not case sensitive.
            u = createUser(username); // this creates the User with the specified username.
            mainMenu(); // this takes the User back to main menu to ask the User the next question.
        } else {
            System.out.println(username + " wrong login details, try again"); // if the User enters an invalid username, then this message (String) will print out on the screen to let the User know that they've entered an invalid username.
        }
    }


    private void mainMenu() { // this is the main menu. This method has NO return value, hence 'void' which is used as a datatype.
        System.out.println("What would you like to do?"); // this message will print out for User to read on screen.
        System.out.println("you can input: 'check balance', 'make a deposit', 'make a withdrawal', 'exit'." ); // this message will print out for User to read on screen to give the User some options in what they can choose from.
        String input = myScanner.nextLine(); // this will make a new line for User to enter their chosen option.
        checkInput(input); // checking the data the User has input is valid.
    }

    private void checkInput(String input) { // checks the data that the user has input.
        if (input.equalsIgnoreCase("check balance")) { // the user has typed 'check balance' (not case sensitive).
            System.out.println("Which account do you want to check? For example, current, joint or saving?"); // this character, String asks the user which account they like to check for their balance.
            String acc = myScanner.nextLine(); // The User can enter which account they like to check.

            if (acc.equalsIgnoreCase("current")) { // the user has typed 'current' as that is the account they wish to check balance on (not case sensitive).
                System.out.println("The balance of your current account is: " + u.checkCurrentAccBalance()); // the current account balance will be printed on the screen.
                mainMenu(); // this takes User back to the main menu.
            }
            if (acc.equalsIgnoreCase("joint")) { // the user has typed 'joint' (not case sensitive).
                System.out.println("The balance of your joint account is: " + u.checkJointAccBalance()); // the joint account balance will be printed on the screen.
                mainMenu();
            }
            if (acc.equalsIgnoreCase("saving")) { // the user has typed 'saving' as that is the account they like to check the balance of (not case sensitive).
                System.out.println("The balance of your saving account is: " + u.checkSavingAccBalance()); // the saving account balance will be printed on the screen.
                mainMenu(); // takes the User back to the main menu.
            }
        } else if (input.equalsIgnoreCase("make a deposit")) { // the user has typed 'make a deposit' (not case sensitive).
            System.out.println("Which account do you wish to deposit into? For example, current, joint or saving?"); // this character, String asks the user which account they wish to deposit into.
            String acc = myScanner.nextLine(); // The user can enter which account they like to make a deposit into.

            if (acc.equalsIgnoreCase("current")) { // the user has typed 'current' (not case sensitive).
                System.out.println("How much would you like to deposit?: "); // this question will be printed on screen for User to read.
                double amount = Integer.parseInt(myScanner.nextLine()); // this is waiting for User to input the amount that they wish to deposit.
                System.out.println("you wish to deposit " + amount); // this will tell the user they wish to deposit the amount they inputted.
                double newBalance = u.depositCurrentAcc(amount); // working out the new total balance after the deposit into the current account.
                System.out.println("your updated balance in our current account is " + newBalance); // this will printout the new figure after the amount the user has deposited.
                mainMenu(); // takes the user back to the main menu.
            }

            if (acc.equalsIgnoreCase("joint")) { // the users has chosen 'joint account' to make a deposit into. What the user inputs is Not case sensitive.
                System.out.println("How much would you like to deposit?: "); // this question will be printed on screen for User to read and to prompted user to enter an amount they wish to deposit in to their joint account.
                double amount = Integer.parseInt(myScanner.nextLine()); // this is waiting for User to input the amount that they wish to deposit.
                System.out.println("you wish to deposit " + amount); // this will tell the user they wish to deposit the amount they inputted.
                double newBalance = u.depositJointAcc(amount); // working out the new total balance after the deposit into the joint account.
                System.out.println("your updated balance in your joint account is " + newBalance); // this will printout the new figure after the amount the user has deposited into their joint account.
                mainMenu(); // takes the user back to the main menu.
            }

            if (acc.equalsIgnoreCase("saving")) { // the users has chosen their 'saving account' to make a deposit into. What the user inputs is Not case sensitive.
                System.out.println("How much would you like to deposit?: " ); // this question will be printed on screen to prompted the User to input an amount they like to make a deposit into their saving account.
                double amount = Integer.parseInt(myScanner.nextLine()); // this is waiting for User to input the amount that they wish to deposit.
                System.out.println("you wish to deposit " + amount); // this will tell the user they wish to deposit the amount they've inputted.
                double newBalance = u.depositSavingAcc(amount); // working out the new total balance (after User has made an deposit into their saving account).
                System.out.println("your updated balance in our saving account is " + newBalance); // this will printout the new balance amount after the amount the user has deposited.
                mainMenu(); // takes the user back to the main menu.

            }
        }
        else if (input.equalsIgnoreCase("make a withdrawal")) { // the users has inputted (not case sensitive) 'make a withdrawal' as that is what they wish to do.
            System.out.println("Which account do you wish to withdraw from? For example current, joint, saving."); // this question will print out to prompt the User to input the amount they wish to withdrawal from their saving account.
            String acc = myScanner.nextLine(); // the user can input which account they wish to make a withdrawal from.

            if (acc.equalsIgnoreCase("current")) { // the users has chosen their current account to make a withdrawal from. Their input data is NOT case sensitive.
                System.out.println("How much would you like to withdraw?: "); // this question will be printed on screen to prompted to ask user how much their wish to withdraw from their saving account.
                double amount = Integer.parseInt(myScanner.nextLine()); // this is waiting for User to input the amount that they wish to deposit.
                System.out.println("you wish to withdraw " + amount); // this will message will printout to confirm the user they wish to withdraw the amount they've inputted.
                double newBalance = u.withdrawCurrentAcc(amount); // now working out the new balance after the withdrawal amount requested by user from their current account.
                System.out.println("your updated balance in your current account is " + newBalance); // this displays the new balance after the amount withdrawn by the user.
                mainMenu(); // takes the user back to the main menu.
            }
            if (acc.equalsIgnoreCase("joint")) { // the users has chosen to make a withdraw from joint account. The inputted data by user is not case sensitive.
                System.out.println("How much would you like to withdraw?: "); // this question will be printed on screen to prompted the user to input an amount they wish to withdraw from their joint account.
                double amount = Integer.parseInt(myScanner.nextLine()); // this is waiting for User to input the amount that they wish to make a withdrawal.
                System.out.println("you wish to withdraw " + amount); // this will printout the amount the user has inputted to withdraw from their joint account.
                double newBalance = u.withdrawJointAcc(amount); // working out the new balance amount after the withdrawal from user's joint account.
                System.out.println("your updated balance of your joint account is " + newBalance); // this will print out the new balance amount after the withdrawal made by user.
                mainMenu(); // taking the User back to the main menu.
            }
            if (acc.equalsIgnoreCase("saving")) { // the users has chosen to make a withdrawal from their saving account. Their input data is NOT case sensitive.
                System.out.println("How much would you like to withdraw?: "); // this question will be printed on screen to prompted the User to input the amount they wish to make a withdrawal.
                double amount = Integer.parseInt(myScanner.nextLine()); // this is waiting for User to input the amount that they wish to withdraw.
                System.out.println("you wish to withdraw " + amount); // this message will print out to display the chosen amount the user wish to withdraw from their saving account.
                double newBalance = u.withdrawSavingAcc(amount); // now working out the new balance after the withdrawal amount requested by user from their saving account..
                System.out.println("your updated balance in your saving account is " + newBalance); // the new balance amount after the requested withdrawal will be printed out on screen for User's information.
                mainMenu(); // taking User back to the main menu.
            }
        }
        else if (input.equalsIgnoreCase("exit")) { // User has chosen to exit the Cash Point service or this programme.
            System.out.println("You have chosen to exit. Thank and goodbye."); // this message will print out to confirm that the user has decided to exit their service from this cash point service and to take them for being a banking customer.
            System.exit(0); // this will exit the cash point programme successfully.
        }

        else {
            System.out.println("you have entered an invalid option."); // if user inputted an invalid data, this message will print out on screen to confirm this issue.
            mainMenu(); // taking the User back to the main menu.
        }
    }

    private User createUser(String username) { // this is the method (also know as the action or behaviour) that will create the User with the given username.
        System.out.println("Please enter your password"); // this will prompted the User to input their password.
        String password = myScanner.nextLine(); // waiting for the User input their password.
        User createdUser; //this is where the User will be created and stored.

        if (password.equalsIgnoreCase("password123")) { // this checks the User has input the correct 'password' before it can execute the body of this 'if' statement.
            createdUser = new User(username, password, "CURRENT", "JOINT", "SAVINGS", amount, amount, amount); // If the input password is correct, then the User will be created.
        }
        else {
            System.out.println("Wrong Password entered! Please try again."); // this will wait for the User to input their password.
            createdUser = createUser(username); // if User has input wrong password, this message will print out on screen to confirm this issue.
        }
        return createdUser; // this takes User back to the login section where they can input their login details again.
    }
}