package com.mukund.it.args;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=Integer.parseInt(args[0]);
		if(x>9 &&x<100) {
		int a=x/10;
		int b=x%10;
		System.out.println(a+b);}
		if(x<0) {
			System.out.println("-3");
		}
		else if(x>99){
			System.out.println("-2");
			
		}
		if(x>0 && x<9) {
			System.out.println("-1");
			
		}
		

	}

}
