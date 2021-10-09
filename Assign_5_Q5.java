import java.util.Scanner;

public class Assign_5_Q5 {

	public static void main(String[] args) {
		int n1=0,n2=0;
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter First number :");
	    n1= sc.nextInt();
	    
	    System.out.println("Enter Second number :");
	    n2= sc.nextInt();
	    if(n1 == n2)
	    	System.out.println("Numbers are EQUAL ");
	    else if(n1 < n2)
	    	System.out.println(n1+ " is LESS than "+n2);
	    else
	    	System.out.println(n1+" is GREATER than "+n2);
	    	
	}

}
