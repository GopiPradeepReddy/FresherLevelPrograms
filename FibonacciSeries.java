package com.demo.fresherlevelprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a,b values:");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("enter c value:");
		int n=s.nextInt();
		int c=0;
		System.out.print(a+" "+b+" " );
		for(int i=0;i<n;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" " );
		}
		
	}

}
