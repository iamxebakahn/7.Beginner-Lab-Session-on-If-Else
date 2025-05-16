/*Problem Description

Write a program to input from user three numbers(A, B & C) representing side lengths of a triangle.

You have to print if the traingle is "equilateral", "scalene" or "isosceles".



Problem Constraints

1 <= A <= 100000

1 <= B <= 100000

1 <= C <= 100000



Input Format

One line containing three space separated integers A, B & C.



Output Format

One string either "equilateral", "scalene" or "isosceles".



Example Input

Input 1:

5 6 7
Input 2:

30 30 30


Example Output

Output 1:

scalene
Output 2:

equilateral
 */
import java.lang.*;
import java.util.*;

public class Q2Beginner_Lab_Session_on_If_Else{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc= new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    int C=sc.nextInt();
    
    if((A==B) && (A==C))
        System.out.println("equilateral");
    else if ((A==B) || (B==C) || (A==C) )
        System.out.println("isosceles");
    else
        System.out.println( "scalene");


    
    }
}