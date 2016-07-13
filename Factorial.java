package com.demo.fresherlevelprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter value:");
		int n=s.nextInt();
		int m=n;
		int sum=1;
		while(n>0){
			sum=sum*n;
			--n;
		}
		System.out.println("factorial of "+m+" is:"+sum);
	}
}
