import java.util.Scanner;
public class Assign_6_Q4 {

	public static void main(String[] args) {
		int num=0,armg=0,temp1=0,temp2=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
	    num= sc.nextInt();
	    temp1=num;
	    while(temp1!=0) {
	    	temp2=(temp1%10);
	    	armg=(armg+(temp2*temp2*temp2));
	    	temp1=(temp1/10);
	    };
	    if(armg==num) {
	    	System.out.print("It is an armstrong number!");
	    }
	    else {
	    	System.out.print("It is not an armstrong number!");
	    }

	}

}
