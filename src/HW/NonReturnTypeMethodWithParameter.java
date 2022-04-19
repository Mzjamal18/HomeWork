package HW;

public class NonReturnTypeMethodWithParameter {

    public void Green(int num1, int num2, int num3 ) {
        int total = num1 + num2 + num3;
        System.out.println("Total value" +" " +total);
    }

    public void Green1(int num1, int num2, int num3 ) {
        int total = (num1 + num2 ) / num3;
        System.out.println("Total value" +" " +total);
    }

    public void Green3(double monthlysalary, int totalmonth) {
        double total = (monthlysalary * totalmonth);
        System.out.println("Total yearly salary" +" " +total);
    }
    public void Green4(String Firstname, String Lastname) {
     String Fullname = Firstname+ " "+ Lastname;
        System.out.println("Customer fullname :" +" " +Fullname);
    }

    public void Green5(int num1, int num2, int num3 ) {
        int total = (num1 - num2 ) * num3;
        System.out.println("Total " +" " +total);
    }

    public static void main(String[] args) {

        NonReturnTypeMethodWithParameter black = new NonReturnTypeMethodWithParameter();
        black.Green(20,32,32);
        black.Green1(10,20,3);
        black.Green3(4000,12);
        black.Green4("Manjurul","Ehsan");
        black.Green5(100,50,3);
    }
}
