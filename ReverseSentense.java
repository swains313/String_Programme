package com.String30august2022;

import java.util.Scanner;

public class ReverseSentense {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter The Sentence  : ");
		String st=sc.nextLine();
		
		String str=reverseSentence(st);
		
		System.out.println(str);
	}
	
	static String reverseSentence(String st)
	{
		
		char ch[]=st.toCharArray();
		st="";
		
		for(int i=ch.length-1;i>=0;i--)
		{
			int l=i;
			while(i>=0 && ch[i]!=' ')
			{
				i--;
			}
			
			int f=i+1;
			
			while(f<=l)
			{
				st=st+ch[f];
				f++;
			}
			
			if(i>=0)
			st=st+ch[i];
		}return st;
		
	}

}
