import java.util.Scanner;
public class Assign_6_Q2 {

	public static void main(String[] args) {
		int no=0,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
	    no= sc.nextInt();	
	    for(int i=1; i<no;i++) {
	    	if(no%i==0) {
	    		sum=sum+i;
	    	}
	    }
	    if(sum==no) {
	    	System.out.print("It is a perfefct number!");	
	    }
	    else {
	    	System.out.print("It is not a perfefct number!");
	    }
	}

}
