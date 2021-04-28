/*
Author:  Chris Gauthier
Date:  April 28, 2021
Client:  Trustbix
Challenge: One

*/

import java.util.*;

public class One {

    public static boolean bracketsBalanced(String expr) {
        // create a stack to push our chars onto
        Stack<Character> charStack = new Stack<>();
        // create an array of chars so that we can iterate over the string character by
        // character.
        char[] chars = expr.toCharArray();
        // we need this as a place holder to store the top of our stack
        char d;

        // loop through our chars
        for (int i = 0; i < chars.length; i++) {
            // store the char in question in a string so we can run comparisons on it
            char c = chars[i];
            // if any of these chars exist, push them onto our stack
            if (c == '(' || c == '[' || c == '{') {
                charStack.push(c);
                continue;
            }

            // if we don't have any of those chars, our stack is empty and we have nothing
            // to continue with, return
            // boolean false right away
            if (charStack.empty())
                return false;
            // now we look for the balanced pair
            switch (c) {
            case ')':
                d = charStack.pop();
                if (d == '{' || d == '[')
                    return false;
                break;

            case '}':
                d = charStack.pop();
                if (d == '(' || d == '[')
                    return false;
                break;

            case ']':
                d = charStack.pop();
                if (d == '(' || d == '{')
                    return false;
                break;

            }

        }
        return (charStack.empty());
    }

    public static void main(String[] args) {
        // here is our test case. If its balanced, we'll return true, if not return
        // false.
        String testString = "([]{})";
        // String testString = "";

        if (bracketsBalanced(testString))
            System.out.println("String is balanced");

        else if (!bracketsBalanced(testString))
            System.out.println("String is unbalanced");

    }

}
