package com.String30august2022;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("enter The Sentence : ");
		String s=sc.nextLine();
		
		isFrequency(s);
	}
	
	static void isFrequency(String s)
	{
	//	char ch[]=s.toCharArray();
		int count[]=new int[128];
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
				count[ch]++;
		}
		
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
				System.out.println((char)i+"============>"+count[i]);
		}
	}

}
