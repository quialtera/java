package src;
import java.lang.Math;
import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println(Math.PI);
        //System.out.println(Math.E);

        double result;
        int option;
        System.out.print("Select one of those Math operations below:\n" +
                "1: Powering\n" +
                "2: Absolute\n" +
                "3: Square root (sqrt)\n" +
                "4: Round\n" + //arredonda para inteiro mais próximo
                "5: Ceiling\n" + //arredonda para cima
                "6: Floor\n" + //arredonda para baixo
                "7: Max\n" +
                "8: Min\n" +
                "9: Others operations" +
                "Type your option: ");
        option = scanner.nextInt();

        //block 1
        if (option == 1){
            System.out.print("Type a number to exponent: ");
            double exponent = scanner.nextDouble();
            System.out.print("Type a number to powering: ");
            double powering = scanner.nextDouble();
            result = Math.pow(exponent, powering);
            System.out.println(result);
        }

        //block 2
        else if (option == 2) {
            System.out.print("Type a number to resolve his absolute value: ");
            double absoluteValue = Math.abs(scanner.nextDouble());
            System.out.print(absoluteValue);
        }

        //block 3
        else if (option == 3) {
            System.out.print("Type a value to discover his Square Root: ");
            double choice = scanner.nextDouble();
            result = Math.sqrt(choice);
            System.out.println(result);
        }

        //block 4
        else if (option == 4) {
            System.out.print("Type a value to round: ");
            double round = Math.round(scanner.nextDouble());
            System.out.println(round);
        }

        //block 5
        else if (option == 5) {
            System.out.print("Enter a value (decimal) to ceiling: ");
            double ceiling = Math.ceil(scanner.nextDouble());
            System.out.println(ceiling);
        }

        //block 6
        else if (option == 6) {
            System.out.print("Enter a value (decimal) to floor: ");
            double floor = Math.floor(scanner.nextDouble());
            System.out.println(floor);
        }

        //block 7
        else if (option == 7) {
            System.out.print("Enter a value: ");
            double value1 = scanner.nextDouble();
            System.out.print("Enter another value:");
            double value2 = scanner.nextDouble();
            double max = Math.max(value1, value2);
            System.out.println(max);
        }

        //block 8
        else if (option == 8) {
            System.out.print("Enter a value: ");
            double value1 = scanner.nextDouble();
            System.out.print("Enter another value:");
            double value2 = scanner.nextDouble();
            double min = Math.min(value1, value2);
            System.out.println(min);
        }

        //block 9
        else if (option == 9) {
            int option2;
            System.out.print("Select one of those Math operations below:\n" +
                    "1: Powering\n" +
                    "2: Absolute\n" +
                    "3: Square root (sqrt)\n" +
                    "4: Round\n" + //arredonda para inteiro mais próximo
                    "5: Ceiling\n" + //arredonda para cima
                    "6: Floor\n" + //arredonda para baixo
                    "7: Max\n" +
                    "8: Min\n" +
                    "9: Others operations" +
                    "Type your option: ");
            option = scanner.nextInt();
        }
        scanner.close();
    }
}
