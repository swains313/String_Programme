package com.String26august2022;

import java.util.Scanner;

public class ConvertToLowerCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter The sentence");
		String str=sc.nextLine();
		
		char st[]=str.toCharArray();
		
		
		for(int i=0;i<str.length();i++)
		{
			if(st[i]>='A' && st[i]<='Z')
			{
				st[i]=(char)(st[i]+32);
			}
			
		}
		
		for(int j=0;j<st.length;j++)
		{
			System.out.print(st[j]);
		}
		

	}

}
