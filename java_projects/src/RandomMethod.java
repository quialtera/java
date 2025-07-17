package src;
import java.util.Random;
import java.util.Scanner;

//This program work with the Random method of Java, using multiple options of datatypes

public class RandomMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Select an option:\n" +
                "1: Integer\n" +
                "2: double\n" +
                "3: boolean\n" +
                "Select: ");
        int option = scanner.nextInt();

        if (option == 1){

            System.out.print("Type the initial range as integer number: ");
            int initialRangeInt = scanner.nextInt();

            System.out.print("Type the last range as integer number: ");
            int lastRangeInt = scanner.nextInt();

            int number = random.nextInt(initialRangeInt, lastRangeInt);
            System.out.println("The random integer number in this range is: " + number);
        }

        if (option == 2){
            System.out.print("Type the initial range as decimal number: ");
            double initialRangeDecimal = scanner.nextDouble();

            System.out.print("Type the last range as decimal number: ");
            double lastRangeDecimal = scanner.nextDouble();

            double numberDouble = random.nextDouble(initialRangeDecimal, lastRangeDecimal);
            System.out.println("The random decimal number in this range is: " + numberDouble);
        }

        if (option == 3){
            boolean optionBool = random.nextBoolean();
            System.out.print("The random option between 'true' os 'false' is: " + optionBool);
        }
        /*Random random = new Random();

        int number;

        number = random.nextInt(1, 999);//============>range of randomization
        System.out.println(number);*/
        scanner.close();
    }
}
