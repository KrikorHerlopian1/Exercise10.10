/*

CSCI 6617 S2 Fall 2019
Java Programming
KRIKOR HERLOPIAN
Kherl1@unh.newhaven.edu
Instructor: Sheehan

Kherl1_exercise_10_10.java
This class is for exercise 10.10

 */
package kherl1_exercise_10_10;

/**
 *
 * @author krikorherlopian
 */
public class Kherl1_exercise_10_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue queue = new Queue();
        int i = 1;
        do {
            queue.enqueue(i);
        } while (i++ < 20);

        System.out.println("Deletes in order");
        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
    
}
