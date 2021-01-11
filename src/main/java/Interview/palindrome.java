package Interview;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		System.out.println("palindrome program");
		Scanner sc=new Scanner(System.in);
		int rem,no,rev,sum=0;
		System.out.println("Enter number");
	    no=sc.nextInt();
		int temp=no;
		while(no>0)
		{
			rem=no%10;
			sum=(sum*10)+rem;
			no=no/10;

						
		}
		if(temp==sum)
		{
			System.out.println(sum+"Given number is palindrome");
		}else
		{
			System.out.println(sum+"number is not palindrome");
		}
		
	}		
}
