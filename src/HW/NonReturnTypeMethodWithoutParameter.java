package HW;

public class NonReturnTypeMethodWithoutParameter {


    public void display() {

        System.out.println("I live in Atlanta");
    }
    public void display1() {
        int num1 =25;
        int num2 = 35;
        int total = num1 + num2;
        System.out.println("Total value" +" " +total);
    }


    public void display2() {
        int num1 =25;
        int num2 = 35;
        int total = num2 - num1;
        System.out.println("Total value" +" " +total);
    }

    public void display3() {
        String firstName ="MD";
        String lastName ="Jamal";
        String fullName = firstName+ " " +lastName;
    }


    public void display5() {
        int num1 =50;
        int num2 = 10;
        int total = num1 / num2;
        System.out.println("Total value" +" " +total);
    }


    public static void main(String[] args) {

        NonReturnTypeMethodWithoutParameter red = new NonReturnTypeMethodWithoutParameter();
        red.display();
        red.display1();
        red.display2();
        red.display3();
        red.display5();
    }
}
