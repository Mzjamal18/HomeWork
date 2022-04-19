package HW;

public class ReturnTypeMethodWithParameter {


    public String Info(String name) {

        System.out.println("Employee name : " + name);
        return name;
    }

    public String Info1(String name, int age) {

        System.out.println("Employee name : " + name + " Age is " + age);
        return name + age;
    }

    public String Info2(String name, int age, double salary) {

        System.out.println("Employee name : " + name +"." + " Age is " + age +"." + " Salary is "+ salary);
        return name + age + salary;
    }


public double info4 (double num1, double num2, double num3) {
        return num1*num2*num3;
}

    public double info5 (double num1, double num2, double num3) {
        return num1*num2*num3;
    }

    public boolean info6( String pizzaName, char size, int price, boolean Availability) {
        System.out.println(pizzaName + "," +"Size "+ size +" , Pizza Price " + price + " , Availability " + Availability);
        return Availability;
    }

    public static void main(String[] args) {

        ReturnTypeMethodWithParameter obj = new ReturnTypeMethodWithParameter();
        obj.Info("James");
        obj.Info1("Andrew", 32);
        obj.Info2("James",32,4000);

        System.out.println(obj.info4(3,4,5));

        obj.info6("Pieology",'M',15,true);


    }


}
