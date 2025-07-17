package src;

import java.util.Scanner;

public class BroCodeCourse {
    public static void main(String[] args) {


       /*
       ======SIMPLE PRINT======
       System.out.println("I like pizza!");
       System.out.println("It´s really good!");
       System.out.println("Buy me pizza!");
       */


        //======user input======

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); //if you want to collect just the first term of your input, use "scanner.next() method

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Whats is your gpa?");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student?(true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello, " + name);
        System.out.println("You are " + age
                + " years old!");
        System.out.println("Your gpa is " + gpa);
        if (isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are not a student!");
        }
        scanner.close();

        //======VARIABLES======

        age = 26;
        int year = 2025;
        int quantity = 1;
        System.out.println("The year is " + year);


        double price = 19;
        gpa = 3.5;
        double temperature = -12.5;
        System.out.println(temperature);


        char grade = 'A';
        char symbol = '!';
        char currency = '$';
        System.out.println(currency);


        isStudent = false;
        boolean forSale = true;
        boolean isOnline = true;
        System.out.println(isStudent);


        if(isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are NOT a student!");
        }

        /*
        name = "Yuri";
        String food = "Pasta";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "Blue";

        if (forSale){
            System.out.println("There is a " + car + " for sale!");
        }
        else{
            System.out.println("The " + car + " is not for sale!");
        }
        */

    }
}