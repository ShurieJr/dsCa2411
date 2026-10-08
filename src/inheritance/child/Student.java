package inheritance.child;

import inheritance.parent.Person;

public class Student extends Person {
    private String stdId;

    public Student() {
        this.stdId = "C112160";
    }

    public Student(String name, String tel, String address,
                   String stdId) {
        super(name, tel, address);
        this.stdId = stdId;
    }

    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void display(){
        System.out.println("stdID : " + stdId);
        System.out.println(super.toString());
    }
}
