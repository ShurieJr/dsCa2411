public class Main {
    static void main(String[] args) {
        //create an object
        Student student1 = new Student();
        Student student2 = new Student("Hawa mohamed",
                "C11213", "+278687", 3.8, true);
        Student student3 = new Student();

        //student1.display();

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
    }
}
