package animals;

import java.util.Scanner;

public class createAnimal {
    Scanner myScanner = new Scanner(System.in); // Scanner is used to get user input.

    public static void main (String[] args) {
        createAnimal create = new createAnimal();
        create.getAnimalType();
    }

    private void getAnimalType () {
        System.out.println("What animal would you like to create?"); // users will see this text in green.
        String animal = myScanner.nextLine(); // the value entered by the user is saved into a local String variable named animal.

        if (animal.equalsIgnoreCase("dog")) { // users can use any case as this is not case sensitive. If..Else is 1 of the main forms of conditional logic.
            createDog();  // if statement will control the flow of the program by only executing code if a condition is met.
        }
        else if (animal.equalsIgnoreCase("cat")) {  // when we are comparing Strings, we are using equalsIgnoreCase - not case sensitive.
            createCat(); // if user enters either of the 2 animals, then the program will call the constructor for that class.
        }
        else {
            System.out.println(animal + " is not an animal we can currently create, please try again"); // but if user then the if statements would never be accessed and the compiler would cascade down the list of statements until it fell through at the end
        }
    }

    private void createCat() { // homework, implement a cat object. I have created a New java class called cat.java
        System.out.println("What is the cats name?");
        String name = myScanner.nextLine();
        System.out.println("How old is the cat?");
        int age = myScanner.nextInt(); // amend this...
        System.out.println("What is the cats nature?");
        String nature = myScanner.nextLine();
        cat myCat = new cat(name, name, age, nature);

        System.out.println(myCat.stroke(name));
        System.out.println(myCat.stroke(name));

    }

    public void createDog() {    // this is the method for createDog.
        System.out.println("What is the dogs name?");
        String name = myScanner.nextLine();
        System.out.println("How big is the dog?");
        String size = myScanner.nextLine();
        System.out.println("How old is the dog?");
        int age = myScanner.nextInt();
        System.out.println("What breed is the dog?");
        String breed = myScanner.nextLine();
        dog myDog = new dog(name, size, age, breed);

        myDog.bark(size);
        myDog.play(breed);
        myDog.beHuman(name, age, breed);

    }
}