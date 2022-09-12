package com.String31august2022;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	System.out.println("enter The String ");
	String s=sc.next();
	
	reverseWord(s);
				

	}
	
	static void reverseWord(String s)
	{
		String temp=s;
		
		char ch[]=s.toCharArray();
		
		s="";
		
		for(int i=0;i<ch.length;i++)
		{
			int f=i;
			
			while(i<ch.length && ch[i]!=' ')
			{
				i++;
			}
			
			int l=i-1;
			
			while(l>=f)
			{
				s=s+ch[l];
				l--;	
			}
		}
		System.out.println(temp);
		System.out.println(s);
		if(temp.equals(s))
			System.out.println(temp+" is Palindrome Number ");
		else
			System.out.println(temp+" is Not A Palindromenumber ");
	}

}
