package HW;

import java.util.Scanner;

public class ScannerCalculation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number 1");
        int num1 = input.nextInt();
        System.out.println("Enter Number 2");
        int num2 = input.nextInt();
        int TotalSummation = num1 + num2;
        System.out.println( "Total of summation"  + " " +TotalSummation);

        System.out.println("Enter Number 3");
        int num3 = input.nextInt();
        System.out.println("Enter Number 4");
        int num4 = input.nextInt();
        int TotalSubtraction = num1 - num2;
        System.out.println("Total of subtraction" + " " +TotalSubtraction);

        System.out.println("Enter Number 5");
        int num5 = input.nextInt();
        System.out.println("Enter Number 6");
        int num6 = input.nextInt();
        int TotalDivision = num1 / num2;
        System.out.println( "Total of division " + "  " +TotalDivision);



        System.out.println("Enter Number 7");
        int num7 = input.nextInt();
        System.out.println("Enter Number 8");
        int num8 = input.nextInt();
        int TotalMultiplication = num1 * num2;
        System.out.println("Total of multiplication"  + " "  +TotalMultiplication);









    }
}
