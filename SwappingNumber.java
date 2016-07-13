package com.demo.fresherlevelprograms;

import java.util.Scanner;

public class SwappingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a,b values:");
		int a=s.nextInt();
		int b=s.nextInt();
		/*    a=a^b;
		b=a^b;
		a=a^b;  */
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+"  b="+b);
	}

}
