public class Student {
    //data fields - variables
    private String name;
    private String ID;
    private String tel;
    private double gpa;
    private boolean status;

    static String university= "JUST";
    static int numOfStudents = 0;

    //constructors
    Student() {
        name = "Mohamed abdullahi";
        ID = "C112160";
        tel = "+2526152948";
        gpa = 3.9;
        status = true;

        numOfStudents++;
    }

    Student(String newName, String newID,
            String newTel, double newGpa, boolean newStatus) {
        name = newName;
        ID = newID;
        tel = newTel;
        gpa = newGpa;
        status = newStatus;

        numOfStudents++;
    }

    //getter
    public double getGpa() {
        return gpa;
    }

    //setter
    public void setGpa(double value) {
        if (value >= 0 && value <= 4)
            gpa = value;
        else
            System.out.println("gpa must between 0-4");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 3)
            this.name = name;
        else
            System.out.println("name must be at least 3 characters");
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //methods
    void display() {   //instance method
        System.out.println("University: " + university); //static
        System.out.println("ID: " + ID);
        System.out.println("name: " + name);
        System.out.println("tel: " + tel);
        System.out.println("gpa: " + gpa);
        System.out.println("status: " + status);
        getNumberOfStudents(); //static
    }

    static void getNumberOfStudents(){  //static method
        System.out.println("Number of students: " + numOfStudents);
    }
}
