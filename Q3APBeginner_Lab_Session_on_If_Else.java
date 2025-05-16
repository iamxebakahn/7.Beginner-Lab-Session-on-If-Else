/*Problem Description

Write a program to calculate the percentage (according to marks of a student) and grade (according to the percentage of a student). Five numbers(A, B, C, D & E) represent the marks of a student in 5 subjects which are out of 100. Print the percentage and the grade of the student.

If percentage >= 90% : Grade A
If percentage >= 80% but <90 : Grade B
If percentage >= 70% but <80: Grade C
If percentage >= 60% but <70: Grade D
If percentage >= 40% but <60: Grade E
If percentage < 40%: Grade F


NOTE: You have to take the lowest integer of the percentage. E.g. 90.8% will be treated as 90%.


Input Format

There will be five lines of inputs as following:
The five lines contain the 5 subject marks of the student in numerical format.


Output Format

The first line indicates the percentage in integer format.
The next line displays the grade in string format. */
import java.lang.*;
import java.util.*;

public class Q3APBeginner_Lab_Session_on_If_Else
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
    int C=sc.nextInt();
    int D=sc.nextInt();
    int E=sc.nextInt();
    int per_cent=(A+B+C+D+E)/5;
    System.out.println((A+B+C+D+E)/5);

    
    
    if(per_cent>=90)
        System.out.println("A");
    else if (per_cent>=80 && per_cent<90)
        System.out.println("B");
    else if (per_cent>=70 && per_cent<80)
        System.out.println("C");
    else if (per_cent>=60 && per_cent<70)
        System.out.println("D");
    else if (per_cent>=40 && per_cent<60)
        System.out.println("E");
    else if(per_cent<40)
        System.out.println("F");



    }
}