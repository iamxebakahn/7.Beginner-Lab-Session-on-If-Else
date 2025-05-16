/*Problem Description

Given an integer A representing an year, Return 1 if it is a leap year else return 0.

A year is leap year if the following conditions are satisfied:
Year is multiple of 400.
Else the year is multiple of 4 and not multiple of 100.


Problem Constraints

1 <= A <= 109



Input Format

First and only argument is an integer A



Output Format

Return 1 if it is a leap year else return 0



Example Input

Input 1

 A = 2020
Input 2:

 A = 1999


Example Output

Output 1

 1
Output 2:

 0
 */
import java.lang.*;
import java.util.*;

public class Q6APBeginner_Lab_Session_on_If_Else{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc= new Scanner(System.in);
    int A=sc.nextInt();
      
    /*
    if(N>=500000 && N>1000000)
        System.out.println("gold");
    else if(N>=1000000 && N>10000000)
        System.out.println("platinum");
    else if(N>=10000000)
        System.out.println("diamond");
    else
        System.out.println("None"); */

    if(A%400==0)
        System.out.println(1);
    else if(A%4==0 && A%100!=0)
        System.out.println(1);
    else
        System.out.println(0);
    }
}