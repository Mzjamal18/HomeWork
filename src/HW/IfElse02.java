package HW;

import java.util.Scanner;

public class IfElse02 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("...............Covid 19 vaccination approval requirement................");


        System.out.println("Did you get your first dose?");
        String firstDose = input.nextLine();
        if(firstDose.equalsIgnoreCase("Yes")){
            System.out.println("You are eligible for second dose after six months");
        }
        System.out.println();
        System.out.println("Six months is gone after first dose.");
        System.out.println();
        System.out.println("Did you get your second dose");
        String secondDose = input.nextLine();
        if(secondDose.equalsIgnoreCase("Yes")){
            System.out.println("You are eligible for booster after six months");
        }
        else{
            System.out.println("You are not eligible for Vaccination");
        }







    }
}





