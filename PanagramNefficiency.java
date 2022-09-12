package com.String31august2022;

import java.util.Scanner;

public class PanagramNefficiency {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the sentence : ");
		String s=sc.nextLine();
		
		boolean s1=isPanagram(s);
		if(s1)
			System.out.println("panagram ");
		else
			System.out.println("not a panagram ");
	}
	
	static boolean isPanagram(String s)
	{
		if(s.length()<26)
			return false;
		s=s.toLowerCase();
		
		for(char ch='a' ; ch<='z';ch++)
		{
			if(s.indexOf(ch)==-1)
				return false;
		}return true;
	}

}
