package com.String29august2022;

import java.util.Scanner;

public class ConvertLastLettterCapital {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter The String Word : ");
		String s=sc.nextLine();
		
		lastLetterCap(s);
		

	}
	
	static void lastLetterCap(String s)
	{
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(i==ch.length-1 && ch[i]!=' ' || ch[i]!=' '&& ch[i+1]==' ')
			{
				if(ch[i]>='a' && ch[i]<='z')
				{
					ch[i]=(char)(ch[i]-32);
				}
			}else if(ch[i]>='A'&& ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
		}s=new String(ch);
		System.out.println(s);
	}

}
