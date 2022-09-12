package com.String30august2022;

import java.util.Scanner;

public class ReverseTheWordSentence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter The Sentence : ");
		String s=sc.nextLine();
		
		reverseWord(s);

	}
	
	static void reverseWord(String s)
	{
		char c[]=s.toCharArray();
		
		String st="";
		for(int i=0;i<c.length;i++)
		{
			
			int f=i;
			
			while(i<c.length && c[i]!=' ')
			{
				i++;
			}
			int l=i-1;
			
			while(l>=f)
			{
				st=st+c[l];
				l--;
			}
			
			if(i<c.length)
				st=st+c[i];
			
		}
		
		System.out.println(st);
	}

}
