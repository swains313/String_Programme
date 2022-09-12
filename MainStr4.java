package com.String26august2022;

import java.util.Scanner;

public class MainStr4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter The letter ");
		String s=sc.next();
		
		String str="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(i%2==0)
			{
				if(ch=='Z')
				{
					ch='A';
					str=str+ch;
				}else
				{
					ch++;
					str=str+ch;
				}
			}else
			{
				if(ch=='A')
				{
					ch='Z';
					str=str+ch;
				}else {
					ch--;
					str=str+ch;
				}
			}
			
		}
		System.out.println(str);

	}

}
