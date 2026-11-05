package Stacks.ArrayStacks;

import java.util.Arrays;

public class ArrayStack<T> {
    private int top;
    private final static int DEFAULT_CAPACITY = 2;
    private T[] stack;

    ArrayStack(int initialSize) {
        top = 0;
        stack = (T[]) new Object[initialSize];
    }

    ArrayStack() {
//        top = 0;
//        stack = (T[]) new Object[DEFAULT_CAPACITY];
        this(DEFAULT_CAPACITY);
    }

    //OPERATIONS
    //push
    public void push(T element) {
        if (size() == stack.length)
            expandCapacity();
        stack[top] = element;
        top++;
    }

    //expand capacity
    private void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }
    //pop
    public T pop(){
        if (isEmpty()) {
            System.out.println("The stack is Empty!");
            return null;
        }
        top--;
        T removedElement = stack[top];
        stack[top] = null;
        return removedElement;
    }

    //peek
    public T peek() {
        if (isEmpty()) {
            System.out.println("The stack is Empty!");
            return null;
        }
        return stack[top - 1];
    }

    //isEmpty
    public boolean isEmpty() {
        return top == 0;
//        if (top == 0)
//            return true;
//        return false;
    }

    //size
    public int size() {
        return top;
    }

    //display elements
    public void displayElements(){
        for(int i =0; i < size(); i++){
            System.out.println(stack[i]);
        }
    }
}
