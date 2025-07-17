package src;
import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        // if statement = performs a block of code if its condition is true

        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        System.out.print("What is your name? ");
        name = scanner.nextLine();
        boolean isStudent;

        //GROUP 1

        if (name.isEmpty()){
            System.out.println("You don't tell your name... 😡");
        }

        //GROUP 2

        else {
            System.out.print("What is your age? ");
            age = scanner.nextInt();
            if (age >= 65){
                System.out.println(name + ", you are a senior! 👴🏻");
            } else if (age >= 18){
                System.out.println(name + ", you are an adult! 👨🏻");
            } else if (age < 0) {
                System.out.println(name + ", you are not born yet! 👎");
            } else if (age == 0) {
                System.out.println(name + ", you are a baby! 👶🏻");
            } else {
                System.out.println(name + ", you are a child! 🧒🏻");
            }

            //GROUP 3

            System.out.print("Are you a student? (true/false): ");
            isStudent = scanner.nextBoolean();
            if (isStudent) {
                System.out.println("You are a student! 🎓");
            } else {
                System.out.println("You are not a student! ");
            }
        }

        scanner.close();
    }
}
