/*Problem Description

Write a program to input two numbers(A & B) from user and print the minimum element among A & B in each line.


Problem Constraints

1 <= A <= 1000000

1 <= B <= 1000000



Input Format


First line is a single integer A.
Second line is a single integer B.




Output Format

One line containing an integer as per the question.



Example Input


Input 1:


5 
6
Input 2:


1000 
10000



Example Output

Output 1:

5
Output 2:

1000 */
import java.lang.*;
import java.util.*;

public class Q2APBeginner_Lab_Session_on_If_Else 
{
    public static void main(String[] args) 
    {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
    Scanner sc= new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    
    
    if(A>B)
        System.out.println(B);
    else
        System.out.println(A);


        
        
    }
}