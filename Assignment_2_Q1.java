public class Assignment_2_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15,sqr;
		float sqt;
		sqr = a*a;
		sqt = a;
		System.out.println("Square and squareroot");
		do
		{
			sqt=(sqt+(a/sqt))/2;	
		}while((int)(sqt*sqt)>a);
		System.out.println("a = "+a+"\nSquare of no. = "+sqr +"\nsqrt = "+sqt );
		
	}

}
