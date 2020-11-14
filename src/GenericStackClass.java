/*Programmer: Austin Parker   Date: Nov 13, 2020
 * Assignment: PE 24.4
 * Description: Program creates memory stack. Then iterates thru loop looking for prime numbers up to 50.
 * If it finds prime number, it pushes number to the stack. If not prime, it pops number from stack.*/

import java.util.*;

public class GenericStackClass {

    public static void main(String[] args) {
        System.out.println(" \nHello! This program shows how you can manipulate the stack memory in Java. \n" +
                "   Below are the prime numbers that are less than 50 in descending order. \n    This program is using " +
                "push and pop to help display the prime numbers.\n");
        Stack<Integer> stack = new Stack<Integer>();
        /*variables*/
        int generatedNumber = 1;
        boolean flag;
        /*while resulting number is less than or equal to 50, program will iterate thru loop*/
        while (generatedNumber <= 50) {
            flag = true;
            /*loop iterates checking to see if generated number is prime. If not, loop stops*/
            for (int j = 2; j < generatedNumber; j++) {
                if (generatedNumber % j == 0) {
                    flag = false;
                    break;
                }
            }
            /*if flag is true, push to stack, add to count and generatedNumber*/
            if (flag) {
                stack.push(generatedNumber);
            }
            generatedNumber += 1;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}








