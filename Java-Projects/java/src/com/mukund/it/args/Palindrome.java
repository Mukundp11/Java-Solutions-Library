package com.mukund.it.args;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(args[0]);
		int k=num;
		if(num>1) {
			int b=(num%10)*100;
			 num=(num/10);
			int c=(num%10)*10;
			 num=num/10;
			 num=b+c+num;
			if (num==k) 
				System.out.println("pallindrome");
				else 
					System.out.println("not a palindrome");
				}
		if(num==1) {System.out.println("palindrome");}
		else if(num==0) { System.out.println("not a palindrome");}
		else if (num<0 && num==0) {
			System.out.println("-1");}
		else if(num<0) {System.out.println("number is negative kindly provide posotive");}
		else if(num/100==0)
			{System.out.println("-2");}
		else if(num==-2)System.out.println("can check operation for 3 number only");
		
		
		

	}

}
