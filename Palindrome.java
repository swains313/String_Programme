package com.String31august2022;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter The Number : ");
		String st=sc.nextLine();
		
		isPalindrome(st);

	}
	
	static void isPalindrome(String st)
	{
		
		
		char ch[]=st.toCharArray();
		String str="";
		
		for(int i=0;i<=ch.length/2;i++)
		{
		
			char t=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=t;
		}
		str=new String(ch);
		
		if(str.equals(st))
		System.out.println(st+" is palindrome  ");
		else
			System.out.println(st+" is not a palindrome");
		
	}

}
