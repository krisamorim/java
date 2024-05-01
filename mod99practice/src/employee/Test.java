package employee;

public class Test {
    public static void main(String[] args) {
        Employee employee01 = new Employee();
        employee01.name = "Kris";
        employee01.age = 40;
        employee01.payment = new double[] {8000, 10000, 12000};

        employee01.printIt();
    }
}
