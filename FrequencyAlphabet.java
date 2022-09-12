package com.String31august2022;

import java.util.Scanner;

public class FrequencyAlphabet {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter The sentence ");
		String s=sc.nextLine();
		
		int count[]=new int[26];
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch>='A' && ch<='Z')
				count[ch-65]++;
			else if(ch>='a' && ch<='z' )
				count[ch-97]++;
		}
		
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
				System.out.println((char)(i+65) +" present int "+count[i]);
		}

	}

}
