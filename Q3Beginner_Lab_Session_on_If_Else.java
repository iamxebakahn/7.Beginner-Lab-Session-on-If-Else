/*Problem Description

Write a program that takes in a number N as input and does the following:

if N is a multiple of 3, print Fizz
if N is a multiple of 5, print Buzz
if N is a multiple of both 3 and 5, print FizzBuzz
Problem Constraints:

1 <= N <= 1000

Input Format

There is only 1 single line in the input, which is the integer N.

Output Format

Print Fizz / Buzz / FizzBuzz depending on the value N.

Example Input

Input 1:-
9
Input 2:-
15 */
import java.lang.*;
import java.util.*;

public class Q3Beginner_Lab_Session_on_If_Else{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
    Scanner sc= new Scanner(System.in);
    int N=sc.nextInt();
    if((N%3==0)&&(N%5!=0))
        System.out.println("Fizz");
    else if((N%5==0) && (N%3!=0))
        System.out.println("Buzz");
    else if((N%3==0) && (N%5==0))
        System.out.println("FizzBuzz");

    }
}