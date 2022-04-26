package HW;

import java.util.Scanner;

public class ifElse01 {



    public static void main(String[] args) {

        ifElse01 Do = new ifElse01();
    Do.getScore();
}


    public void getScore() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your score to get grade");
        double score = input.nextDouble();
        if (score >= 94 && score <= 100) {
            System.out.println("You got Excellent");
        }
        else if (score >= 90 && score <= 93) {
            System.out.println("You got Very Good");
        }
        else if (score >= 85 && score <= 89) {
            System.out.println("You got Good");
        }
        else if (score >= 80 && score <= 84) {
            System.out.println("You got Average");
        }
        else if (score >= 70 && score <= 79) {
            System.out.println("You got Pass");
        }
        else if (score >= 60 && score <= 69) {
            System.out.println("You got poor");
        }
        else if (score >= 50 && score <= 59) {
            System.out.println("You need to repeat the course");
        }

        else {
            System.out.println("You are out of the world.");
        }


    }
}
