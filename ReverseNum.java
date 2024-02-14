package git;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long num,temp;
		int rev=0, rem;
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number to be Reversed : ");
		num = obj.nextLong();
		temp=num;
		
		while(num>0)
		{
			rem = (int) (num % 10);
			rev = rev *10 +rem;
			num = num / 10;
		}
		System.out.println(temp+" Reverse number is "+ rev);

	}

}
