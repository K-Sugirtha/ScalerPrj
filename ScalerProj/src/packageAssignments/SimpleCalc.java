package packageAssignments;
import java.util.*;
public class SimpleCalc {

	public static void main(String[] args) {
		// Simple Calculator for given 2 numbers : +, - , *, /
		Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        System.out.print((A+B)+ " " + (A*B) + " " + (A-B) +" "+ (A/B)); 
	}

}
