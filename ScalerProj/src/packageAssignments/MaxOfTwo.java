package packageAssignments;
import java.util.*;
public class MaxOfTwo {

	public static void main(String[] args) {
		// Given 2 integer inputs A & B, 	Print the max of two
		Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        if (A > B)
        {
            System.out.print(A);
        }
        else
        {
            System.out.print(B);
        }
	}

}
