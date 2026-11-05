package Stacks.ArrayStacks;

public class Main {
    static void main() {
//        Test t1 = new Test<>();
//        Test<Integer , String> t2 = new Test<>();
//        t1.setData("Mohamed");
//        t2.setData(34);
//        t2.text = "8";
//        Stack<String> names = new Stack<>();
//        names.push("Farah");
//        names.push("Gedi");
//
//        System.out.println(names);
//        System.out.println("size: " + names.size());
//        System.out.println("empty: " + names.isEmpty());
//        System.out.println("removed element: " + names.pop());
//        System.out.println("last element: " + names.peek());
        ArrayStack<String> address = new ArrayStack<>();
        address.push("Waaberi");
        address.push("KM4");
        address.push("HODAN");
        address.push("Howlwadaag");
        address.push("Hiliwaa");

        address.displayElements();
    }
}
