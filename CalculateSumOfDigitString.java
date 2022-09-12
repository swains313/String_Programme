package com.String26august2022;

import java.util.Scanner;

public class CalculateSumOfDigitString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter The Name : ");
		String s=sc.nextLine();
		
		
		int sum=0;
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			
			if(ch[i]>='0' && ch[i] <='9')
			{
				
				sum=sum+(ch[i]-48);
			}
		//	System.out.println(ch);
					
		}
		System.out.println(sum);
	}

}
