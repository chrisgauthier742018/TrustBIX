/*
Author:  Chris Gauthier
Date:  April 28, 2021
Client:  Trustbix
Challenge: One

*/

import java.util.*;

public class Two {
    // create our two stacks, respecting java's oddity about static types
    public static Stack<String> in = new Stack<String>();
    public static Stack<String> out = new Stack<String>();

    // our enqueue function
    public static void queue(String item) {
        in.push(item);
    }

    // our dequeue function
    // Theoretically, i could wrap this in a while loop and pring off all the
    // elements of the out stack,
    // but the way i read the specs was that I was to return one item off the queue.
    public static String dequeue(Stack<String> in) {
        if (out.isEmpty()) {
            if (!in.isEmpty()) {
                return in.pop();
            }

        }
        return "outbox is not empty";
    }

    public static void main(String[] args) {
        // load up our queue
        queue("1");
        queue("2");
        queue("3");
        queue("4");
        // print out our inbox
        System.out.println(in.toString());
        // save the popped string in a variable
        String outboxItem = dequeue(in);
        // print it off.
        System.out.println(outboxItem);

    }

}
