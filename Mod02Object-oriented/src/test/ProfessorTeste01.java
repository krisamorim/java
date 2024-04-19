package test;
import domain.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Jack";
        professor.age = 57;
        professor.gender = 'M';

        System.out.println("Professor data:\nName: "+professor.name+"\nAnge: "+professor.age+"\nGender: "+professor.gender);
    }    
}
