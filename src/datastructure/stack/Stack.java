package datastructure.stack;


import java.util.LinkedList;

public class Stack {

    public static void main(String[] arr) {
        System.out.println("Implementing Stack using Array");
        ArrayStack stack = new ArrayStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.push(4);
        stack.push(5);
        stack.pop();
        stack.pop();
        stack.push(5);
        stack.push(4);
        stack.push(4);
        stack.printStack();

        System.out.println();

        System.out.println("Implementing Stack using LinkedList");
        LinkedListStack llStack = new LinkedListStack();
        llStack.push(1);
        llStack.push(2);
        llStack.push(3);
        llStack.push(4);
        llStack.pop();
        llStack.push(4);
        llStack.push(5);
        llStack.pop();
        llStack.pop();
        llStack.push(5);
        llStack.push(4);
        llStack.printStack();

    }
}

class ArrayStack {
    Integer[] stack;
    int top = 0;
    public ArrayStack(int capacity) {
        stack = new Integer[capacity];
    }

    public void push(int number) {
        if(top == stack.length) {
            System.out.println("Stack is full...");
        } else {
            stack[top++] = number;
        }
    }

    public void pop() {
        if(top == 0) {
            System.out.println("Stack is null...");
        } else {
            stack[top-1] = null;
            top--;
        }
    }

    public void printStack() {
        for(int index = top-1; index >=0; index--) {
            System.out.println(stack[index]);
        }
    }
}

class LinkedListStack {
    LinkedList<Integer> stack = new LinkedList<>();
    public void push(int number) {
        stack.push(number);
    }

    public void pop() {
        if(stack.size()  == 0)
            System.out.println("Stack is null...");
        else
            stack.pop();
    }

    public void printStack() {
        for (Integer num : stack) {
            System.out.println(num);
        }
    }
}
