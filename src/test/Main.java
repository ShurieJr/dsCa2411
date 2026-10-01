package test;

import Univ.Student;

public class Main {
    static void main() {
        //create an object
        Student student1 = new Student();
        Student student2 = new Student("Hawa mohamed",
                "C11213", "+278687", 3.8, true);

        Student.getNumberOfStudents();
        student1.display();
    }
}
