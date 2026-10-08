package inheritance.child;

import inheritance.parent.Person;

public class Teacher extends Person {
    private double salary;

    public Teacher() {
        salary = 300;
    }

    public Teacher(String name, String tel, String address, double salary) {
        super(name, tel, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display(){
        System.out.println("salary: " + salary);
        System.out.println(super.toString());
    }
}
