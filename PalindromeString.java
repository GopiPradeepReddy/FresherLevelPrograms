package com.demo.fresherlevelprograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string:");
		String original=s.next();
		String reverse="";
		for(int i=original.length()-1;i>=0;i--){
			reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse)){
			System.out.println("given string is palindrome");
		}
		else{
			System.out.println("given string is not palindrome");
		}
		
	}

}
