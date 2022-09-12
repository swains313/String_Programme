package com.String26august2022;

import java.util.Scanner;

public class MiscelinousSpecialCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter The sentence ");
		String str=sc.nextLine();
		
		int sp=0,nsp=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			System.out.println(ch);
			if(ch>='A' && ch<= 'z' || ch>='a' && ch>='z'||ch>'0' && ch<='9')
				nsp++;
			else
				sp++;
		}
		System.out.println("the Special Character In The String : "+sp);

	}

}
