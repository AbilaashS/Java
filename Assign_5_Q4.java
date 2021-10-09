import java.util.Scanner;
public class Assign_5_Q4 {

public static void main(String[] args) {
	int no=0;
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number :");
    no= sc.nextInt();		
    if(no>0) 
    	System.out.print("It is a positive number");
    
    else if(no==0) 
    	System.out.print("The number is ZERO");
    
    else
    	System.out.print("It is a negative number");
}


}
