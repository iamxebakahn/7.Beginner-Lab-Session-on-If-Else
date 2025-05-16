/*Problem Description

A programmer for a music company is developing a program to determine the highest level of certification for an album.
The program needs to follow this table of thresholds for each certification level:


Minimum albums sold Certification
500000 (5*105) gold
1000000 (106) platinum
10000000 (107) diamond


Given the albums sold(N) as input, print the certification for the album.


Problem Constraints

1 <= N <= 109


Input Format

There is only 1 single line in the input, which is the integer denoting the no. of albums sold.


Output Format

Output the certification either diamond, platinum or gold.
If no certification, print None.


Example Input

Input 1:-
50
Input 2:-
500000


Example Output

Output 1:-
None
Output 2:-
gold */
import java.lang.*;
import java.util.*;

public class Q5APBeginner_Lab_Session_on_If_Else{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
    Scanner sc= new Scanner(System.in);
    int N=sc.nextInt();
      
    /*
    if(N>=500000 && N>1000000)
        System.out.println("gold");
    else if(N>=1000000 && N>10000000)
        System.out.println("platinum");
    else if(N>=10000000)
        System.out.println("diamond");
    else
        System.out.println("None"); */

    if(N>=10000000)
        System.out.println("diamond");
    else if(N>=1000000)
        System.out.println("platinum");
    else if(N>=500000)
        System.out.println("gold");
    else
        System.out.println("None");
    }
}