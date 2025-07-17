package src;

public class Math {
    public static void main(String[] args) {

        //Arithmetic Operators

        int x = 10;
        int y = 2;
        int z;

        //z = x + y;
        //z = x - y;
        //z = x * y;
        z = x / y;
        //z = x % y;
        System.out.println(z);

        //======Augmented Assignment Operators======

        //x = x + y;
        //x += y;
        x++;//=============> Add 1 to the variable
        x--;//=============> Subtract 1 from the variable
        System.out.println(x);

        // Order of P-E-M-D-A-S
        //P >>> PARENTHESIS
        //E >>> EXPONENCE
        //M >>> MULTIPLICATION
        //D >>> DIVISION
        //A >>> ADITTION
        //S >>> SUBTRACT
        double result = 5 + 7 * (9 - 6) / 3.1;
        System.out.println(result);
    }
}
