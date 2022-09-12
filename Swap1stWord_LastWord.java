package com.String30august2022;

import java.util.Scanner;

public class Swap1stWord_LastWord {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter The Strings : ");
	String st=sc.nextLine();
	
	String s=swapFWL(st);
	
	System.out.println(s);

	}
	
	static String swapFWL(String st)
	{
		char ch[]=st.toCharArray();
		int f=0;
		for(int i=0;i<ch.length;i++)
		{
			if(i==0 && ch[i]!=' ' || ch[i]!=' '&&ch[i-1]==' ')
			{
				f=i;
				System.out.println(f);
			}
			else if(i==ch.length-1 && ch[i]!=' ' || ch[i]!=' ' && ch[i+1]==' ')
			{
				char t=ch[i];
				System.out.println(t);
				ch[i]=ch[f];
				ch[f]=t;
			}
		}return new String(ch);
	}

}
