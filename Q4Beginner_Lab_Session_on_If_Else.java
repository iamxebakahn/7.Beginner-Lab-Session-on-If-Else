/*Problem Description

Given a Number N. If number is divisible by 5,
print "Divisible by 5".
Otherwise print "Not divisible by 5".


Problem Constraints

0 <= N <= 100000


Input Format

In single line, take N in int variable.


Output Format

Print statement in single line accordingly.


Example Input

Input 1 :
135

Input 2 :
149


Example Output

Output 1 :
Divisible by 5

Output 2 :
Not divisible by 5 */
import java.lang.*;
import java.util.*;

public class Q4Beginner_Lab_Session_on_If_Else{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc= new Scanner(System.in);
      int N=sc.nextInt();
      if(N%5==0)
        System.out.println("Divisible by 5");
      else
        System.out.println("Not divisible by 5");
    }
}