package com.String26august2022;

import java.util.Scanner;

public class MainStr2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter The Sentence : ");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]+" ");
		}
		
		
		System.out.println("enter the Size Of An Array : ");
		int n=sc.nextInt();
		
		char cha[]=new char[n];
		
		for(int i=0;i<cha.length;i++)
		{
			cha[i]=sc.next().charAt(0);
		}
		System.out.println("---------------------------------");
		System.out.println(cha);
		
		
		
		
		

	}

}
