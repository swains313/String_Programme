package com.String26august2022;

import java.util.Scanner;

public class CountAllTheCharacter {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	System.out.println("enter The Sentence :");
	String st=sc.nextLine();
	
	int uc=0,lc=0,dc=0,sp=0;
	
	
	for(int i=0;i<st.length();i++)
	{
		char ch=st.charAt(i);
		
		if(ch>='A' && ch<='Z')
			uc++;
		else if(ch>='a' && ch<='z')
			lc++;
		else if(ch>'0' && ch<='9')
			dc++;
		else
			sp++;
		
	}
	System.out.println("the Uppper Present In Word               "+uc);
	System.out.println("the Lower case  Present In Word          "+lc);
	System.out.println("the Digit Present In Word                "+dc);
	System.out.println("the Special Character Present In Word    "+sp);
	
	}

}
