package com.demo.fresherlevelprograms;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array size:");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array elements:");
		for(int i=0;i<n;i++){
			int number=s.nextInt();
			arr[i]=number;
		}
		System.out.println("before sorting the elements:");
		for(int i=0;i<n;i++){
			System.out.print(" "+arr[i]+" ");
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("");
		System.out.println("after sorting the elements:");
		for(int i=0;i<n;i++){
			System.out.print(" "+arr[i]+" ");
		}
	}

}
