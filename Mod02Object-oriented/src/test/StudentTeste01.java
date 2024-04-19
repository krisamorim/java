package test;
import domain.Student;

public class StudentTeste01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Anna";
        student.age = 37;
        student.gender = 'F';

        System.out.println("Name: "+student.name);
        System.out.println("Age: "+student.age);
        System.out.println("Gender: "+student.gender);

        System.out.println(student);//position on memory

    }
}
