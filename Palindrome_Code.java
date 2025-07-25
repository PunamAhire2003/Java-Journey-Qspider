//first n fibonacii numbers
import java.util.Scanner;
class PalindromeCode{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	int Number=sc.nextInt();
	System.out.println(PalindromeNumber(Number));
		
		
		
	}
	public static String PalindromeNumber(int Number){
		int originalNumber=Number;
		int rev=0;
		while(Number>0){
		int digit=Number % 10;
		rev=rev*10+digit;
		Number=Number/10;

	}
	if(originalNumber==rev){
		return"PalindromeNumber";
	}
	else{
		return"Not PalindromeNumber";
	}
}
}



