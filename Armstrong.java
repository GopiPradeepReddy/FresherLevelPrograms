package com.demo.fresherlevelprograms;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter value:");
		int n=s.nextInt();
		int temp=n;
		int sum=0;
		while(n>0){
			int rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(temp==sum){
			System.out.println(temp+" is armstrong number");
		}
		else{
			System.out.println(temp +" is not armstrong number");
		}
	}

}
