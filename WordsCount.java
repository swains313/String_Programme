package com.String26august2022;

import java.util.Scanner;

public class WordsCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter The Sentence : ");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
	
		if(ch[0]!=32)
		{
			int sum=1;
			
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]==32)
					sum++;
			}
			System.out.println(sum);
		}
		else
		{
			int sum=0;
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]==32)
					sum++;
			}
			System.out.println(sum);
		}
		
		
	}


}
