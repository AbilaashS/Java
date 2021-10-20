import java.util.Scanner;
public class Assign_6_Q3 {

	public static void main(String[] args) {
		int num=0,rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
	    num= sc.nextInt();
	    int temp = num;
	    while ( temp !=0)
	    {
	    	rev = (rev*10)+(temp%10);
	    	temp /= 10;
	    }
	    if(num == rev)
	    	System.out.print("It is a Pallindrome");
	    else
	    	System.out.print("It is NOT a Pallindrome");
	    	
	}
}
	   	    