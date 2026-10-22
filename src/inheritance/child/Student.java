package inheritance.child;

import inheritance.parent.Person;

public class Student extends Person {
    private String stdId;

    public Student() {
        this("C112160");
        System.out.println("student no-arg constructor");
    }

    public Student(String id) {
        stdId = id;
        System.out.println("student 1 param constructor");
    }

    public Student(String name, String tel, String address,
                   String stdId) {
        super(name, tel, address);
        this.stdId = stdId;
        System.out.println("student param constructor");
    }

    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void display() {
        System.out.println("ID : " + stdId);
        super.display();
        super.age = 50;
    }


   static public int test() {
        return 45;
    }
}
