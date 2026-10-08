package inheritance;

import inheritance.child.Student;
import inheritance.child.Teacher;

public class Main {
    static void main(String[] args) {
        Student s1 = new Student("Abdirahman" , "+8787" , "Howlwdaag" , "C112189");
        Teacher t1 = new Teacher("Abdifitah Gedi" , "+5961" , "Furayaasha"  , 400);

        s1.display();
        System.out.println("------------------");
        t1.display();

    }
}
