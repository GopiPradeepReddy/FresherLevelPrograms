package com.demo.fresherlevelprograms;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter value:");
		int n=s.nextInt();
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
			if(count==3){
				break;
			}
		}
		if(count==2){
			System.out.println(n+" is prime");
		}
		else{
			System.out.println(n+" is not prime");
		}
	}

}
