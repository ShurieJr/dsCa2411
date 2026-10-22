package inheritance.parent;

public class Person {
    private String name;
    private String tel;
    private String address;
    protected int age;  //protected
    boolean isActive;  //default

    public Person() {
//        name = "abdullahi  ali";
//        tel = "+7788";
//        address = "Waaberi";
        this("abdullahi  ali" , "+7788" , "Waaberi");
        System.out.println("Person no-arg constructor");
    }

    public Person(String name, String tel, String address) {
        this.name = name;
        this.tel = tel;
        this.address = address;
        System.out.println("Person param constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //

    //    @Override
//    public String toString() {
//        return "Name: " + name + '\n' +
//                "Tel: " + tel + '\n' +
//                "Address: " + address ;
//    }
      protected void display() {
        System.out.println("Name : " + name + "\nTel: " + tel + "\nAddress: " + address);
    }

   static public int test(){
        return 0;
    }

}
