package com.demo.fresherlevelprograms;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value:");
		int n=s.nextInt();
		System.out.println("enter the value:");
		int m=s.nextInt();
		System.out.println("the prime numbers between "+n+" to "+m+":");
		for(int i=n;i<=m;i++){
			int count=0;
			for(int j=1;j<=m;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==2){
				System.out.println(i);
			}
		}
	}

}
