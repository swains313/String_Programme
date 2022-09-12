package com.String26august2022;

import java.util.Scanner;

public class VowelsConsonant {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("enter The Sentence :");
		String st=sc.nextLine();
		
		int vc=0,cc=0;
		
		
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			
			if(ch>='A' && ch<='Z')
			{
				if(ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' )
					vc++;
				else
					cc++;
			}
			
			if(ch>='a'&& ch<='z')
			{
				if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
					vc++;
				else
					cc++;
			}
			
			
			
		}
		System.out.println("the Consonant Present In Word               "+cc);
		System.out.println("the Vowels  Present In Word          "+vc);
		
	

	}

}
