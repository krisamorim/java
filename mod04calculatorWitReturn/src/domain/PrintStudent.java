package domain;

public class PrintStudent {
    public void printStu(Student student) {
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
        System.out.println("----------------------------------");
    }
}
