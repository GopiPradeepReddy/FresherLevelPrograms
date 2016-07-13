package com.demo.fresherlevelprograms;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=1;k<=10;i++){
			
			for(int j=1;j<=i;j++){
				
				System.out.print(k);
				++k;
				System.out.print(" ");
			}
			System.out.println("");
		}
		/*int i=1;
		do{
			System.out.print(i+" ");
			
			System.out.println("");
			i++;
		}while(i<=10);*/
	}

}
