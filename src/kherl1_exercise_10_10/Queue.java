/*

CSCI 6617 S2 Fall 2019
Java Programming
KRIKOR HERLOPIAN
Kherl1@unh.newhaven.edu
Instructor: Sheehan

Queue.java
Queue class.This is class for exercise 10.10.

 */
package kherl1_exercise_10_10;

public class Queue {

    private int[] elements;
    private int size = 0;

    Queue() {
        elements = new int[8];
    }

    public void enqueue(int v) {
        if (elements.length <= size) {
            int[] newElements = new int[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size++] = v;
    }

    public int dequeue() {
        int v = elements[0];
        int[] newElements = new int[elements.length];
        System.arraycopy(elements, 1, newElements, 0, size);
        elements = newElements;
        size = size - 1;
        return v;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
