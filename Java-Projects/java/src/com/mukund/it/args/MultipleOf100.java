package com.mukund.it.args;

public class MultipleOf100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(args[0]);
		int b=0;
		if(num<=0) {
			System.out.println("-1");
			
		}
		if(num>0 && num<=100) {
			b=num+100;
			num=b-num;
			System.out.println("multiple of given number:"+num);
		}
		if(num>100) {
			b=num%100;
			num=num+100-b;
			System.out.println("multiple of 100 is:"+num);
		}

	}

}
