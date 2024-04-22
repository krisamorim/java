package test;

import domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        student01.name = "kris";
        student01.age = 40;
        student01.gender = 'M';

        Student student02 = new Student();
        student02.name = "Anna";
        student02.age = 40;
        student02.gender = 'F';

        student01.prints();
        student02.prints();
    }
}
