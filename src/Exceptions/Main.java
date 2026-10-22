package Exceptions;

public class Main {
    static void main() {
        //unchecked exception
        try {
            String name = "Ali";
            System.out.println(name.length());
            int a = 2;
            int b = 2;
            System.out.println(a/b);

            String[] names = {"farah" , "warsame"};
            System.out.println(names[0]);
        } catch (NullPointerException n) {
            System.out.println("name is null!");
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide to zero!");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("finally ~ end of the program");
        }


    }
}
