import java.util.Scanner;
public class Assign_6_Q1 {

	public static void main(String[] args) {
		
		int no=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Print the length of the series:");
	    no= sc.nextInt();		
		int sum=0,a=0,b=1;
		System.out.print(a+ ", "+b);
		for(int i=1;i<no-1;i++) {
			sum=a+b;
			a=b;
			b=sum;		
			System.out.print(", "+sum);
		}

	}
}