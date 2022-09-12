package com.String29august2022;

import java.util.Scanner;

public class ConvertStringToLowerCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter A String word : ");
		String st=sc.nextLine();
		
		char ch[]=st.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<= 'Z')
				ch[i]=(char)(ch[i]+32);
		}
//		for(int i=0;i<ch.length;i++)
//		{
//			System.out.print(ch[i]);
//		}
		
		st=new String(ch); //CONVERTED ARRAY TO STRING
		System.out.println(st);

		

	}

}
