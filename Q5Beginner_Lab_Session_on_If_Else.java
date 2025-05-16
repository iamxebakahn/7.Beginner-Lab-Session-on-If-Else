/*Problem Description

Given the number N, Categorise the number according to following condition :
1. Odd-Positive
2. Odd-Negative
3. Even-Positive
4. Even-Negative

Note : Intention of problem is to teach you Nested If-Else, so try to solve this problem using nested if-else


Problem Constraints

-10000 <= N <= 10000 except 0


Input Format

Take Number in single line.


Output Format

Print the statement, according to number N in single line.


Example Input

Input 1 :
15

Input 2 :
-38


Example Output

Output 1 :
Odd-Positive

Output 2 :
Even-Negative
 */
import java.lang.*;
import java.util.*;

public class Q5Beginner_Lab_Session_on_If_Else{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
    Scanner sc= new Scanner(System.in);
    int N=sc.nextInt();
    if((N%2==0)&&(N>0))
        System.out.println("Even-Positive");
    else if((N%2==0) && (N<0))
        System.out.println("Even-Negative");
    else if((N%2!=0) && (N>0))
        System.out.println("Odd-Positive");
    else if((N%2!=0) && (N<0))
        System.out.println("Odd-Negative");
    }
}