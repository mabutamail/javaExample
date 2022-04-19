package com.github.mabutamail.javatemplate.core.alishevpro.collection_2;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

public class MyLinkedList {

    private Node head;
    private int size;

    public void add(int value) {
        if (head == null) {
            this.head = new Node(value);
        } else {
            Node temp = head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }

            temp.setNext(new Node(value));

        }
        size++;
    }

    public int get(int index) {
        int currentIndex = 0;
        Node temp = head;

//        while (temp != null) {
//            if (currentIndex == index) {
//                return temp.getValue();
//            } else {
//                currentIndex++;
//                temp = temp.getNext();
//            }
//        }
//        throw new IllegalArgumentException();

        if (this.size < index) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 0; i < index; i++) {
                temp = temp.getNext();
            }
        }
        return temp.getValue();
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.getNext();
            size--;
            return;
        }

        int currentIndex = 0;
        Node temp = head;

        while (temp != null) {
            if (currentIndex == index - 1) {
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        size--;
    }

    @Override
    public String toString() {
        int[] result = new int[size];
        int idx = 0;
        Node temp = head;

        while (temp != null) {
            result[idx] = temp.getValue();
            temp = temp.getNext();
            idx++;
        }
        return Arrays.toString(result);
    }

    @Getter
    @Setter
    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

}
