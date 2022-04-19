package HW;

public class ReturnTypeMethodWithoutParameter {
    public int summation() {
        int num1 = 25;
        int num2 = 15;
        int total = num1 + num2;

        System.out.println(total);
        return total;
    }

    public double summation1() {
        double num1 = 35;
        int num2 = 15;
        double total = num1 + num2;

        System.out.println(total);
        return total;
    }

    public String summation2() {
        String fname = "Md";
        String lname = "Jamal";
        String fullname = fname + " " + lname;

        System.out.println(fullname);
        return fullname;
    }


    public boolean availability() {
        boolean isAvailable = true;

        System.out.println("Pizza availability " + isAvailable);
        return isAvailable;
    }


    public double Divide() {
        double num3 = 40;
        int num5 = 10;
        double division = num3 / num5;
        System.out.println(division);
        return division;
    }


    public static void main(String[] args) {
        ReturnTypeMethodWithoutParameter obj = new ReturnTypeMethodWithoutParameter();
        obj.summation();
        obj.summation1();
        obj.summation2();
        obj.availability();
        obj.Divide();
    }

}
