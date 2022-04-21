package com.github.mabutamail.javatemplate.core.alishevpro.collection_2;

import java.util.List;
import java.util.Stack;

public class StackTempl {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> stackList = new Stack<>();

        stack.add(5);
        stack.add(1);
        stack.push(7);
        stack.push(3);

        stackList.add(5);
        stackList.add(1);
//        stackList.push(7);
//        stackList.push(3);

        System.out.println("++++++++++++++++++ stack.peek() ++++++++++++++++++\t" + stack.peek());
//        System.out.println(stack.pop());
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }

        while (!stack.empty()) {
            System.out.println("===============" + stack.pop());
        }


    }
}