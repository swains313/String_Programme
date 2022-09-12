package com.String31august2022;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
	

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter The Sentence : ");
		String s=sc.nextLine();
		
		boolean is=panagram(s);
		
		if(is)
			System.out.println("is panagram");
		else
			System.out.println("not a panagram ");

	}
	
	static boolean panagram(String s)
	{
		
		if(s.length()<26)
			return false;
		
		int count[]=new int[26];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
				count[ch-65]++;
			else if(ch>='a'&& ch<='z')
				count[ch-97]++;
			
		}
		
	
		
		for(int i=0;i<count.length;i++)
		{
			if(count[i]==0)
				return false;
		}return true;
	}

}
