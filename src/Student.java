public class Student {
    //data fields - variables
    String name;
    String ID;
    String tel;
    double gpa;
    boolean status;

    //constructors
    Student() {
        name = "Mohamed abdullahi";
        ID = "C112160";
        tel = "+2526152948";
        gpa = 3.9;
        status = true;
    }

    Student(String newName, String newID,
            String newTel, double newGpa, boolean newStatus) {
        name = newName;
        ID = newID;
        tel = newTel;
        gpa = newGpa;
        status = newStatus;
    }

    //methods
    void display() {
        System.out.println("ID: " + ID);
        System.out.println("name: " + name);
        System.out.println("tel: " + tel);
        System.out.println("gpa: " + gpa);
        System.out.println("status: " + status);
    }
}
