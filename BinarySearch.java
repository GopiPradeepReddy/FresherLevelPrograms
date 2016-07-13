package com.demo.fresherlevelprograms;

import java.util.Scanner;

public class BinarySearch {
	int n=0,search;
	int arr[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch b=new BinarySearch();
		Scanner s=new Scanner(System.in);
		b.bubbleSort();
		System.out.println("enter the searching element:");
		b.search=s.nextInt();
		b.binary(0,b.n);
	}
	public void bubbleSort(){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array size:");
		n=s.nextInt();
		arr=new int[n];
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
	public void binary(int f,int l){
		int midPoint=(f+l)/2;
		if(arr[midPoint]==search){
			System.out.println("The searching element "+search+" is found at:"+midPoint);
		}
		else if(arr[midPoint]<search){
			int first=midPoint+1;
			binary(first,l);
		}
		else{
			int last=midPoint-1;
			binary(f,last);
		}
	}

}
