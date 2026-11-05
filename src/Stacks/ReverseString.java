package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = input.nextLine();
        // read characters and push to the stack
        Stack<Character> temp = new Stack<>();
        for(int i=0 ; i <text.length(); i++){
            temp.push(text.charAt(i));
        }
        //pop the chars from temp
        String reversed = "";
        while(!temp.isEmpty()){
            reversed += temp.pop();
        }

        System.out.println("original text: " + text);
        System.out.println("reversed text: " + reversed);
    }
}
