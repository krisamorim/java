package test;
import domain.Car;
public class CarTeste01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Fusca";
        car1.model = "Hat";
        car1.year = 1988;

        car2.name = "Ferrari";
        car2.model = "Sport";
        car2.year = 1998;

        System.out.println("1st car is:\nName: "+car1.name+"\nModel: "+ car1.model+"\nYear: "+car1.year);

        System.out.println("2nd car is:\nName: "+car2.name+"\nModel: "+ car2.model+"\nYear: "+car2.year);

    }
}
