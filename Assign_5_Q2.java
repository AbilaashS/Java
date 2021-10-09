import java.util.Scanner;
public class Assign_5_Q2 {
	public static void main(String[] args) {
		int no=0,count=0;
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number :");
	    no= sc.nextInt();
	    while(no!=0)
	    {
	    	no=no/10;
	    	count++;
	    }
	    System.out.println("No. of digits ="+count);
	}
}
