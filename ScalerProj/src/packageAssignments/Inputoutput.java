package packageAssignments;
import java.util.*;
public class Inputoutput {

	public static void main(String[] args) {
		/* Inputs: The first line contains the integer N denoting the number of layers.
		The second line contains the integer M denoting the time the lasagna has already spent baking in the oven.
		Output : Print in a single line the total elapsed cooking time.
		*/
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        System.out.print((N*2+M));
	}

}
