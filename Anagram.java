package com.String31august2022;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter Two String : ");
		String st1=sc.nextLine();
		String st2=sc.nextLine();
		
		boolean is =isAnagram(st1,st2);
		if(is)
			System.out.println("["+st1+"  ==  "+ st2+"] is a anagram");
		else
			System.out.println("["+st1+"  !=  "+ st2+"] is not a anagram");
	}
	
	static boolean isAnagram(String s1,String s2)
	{
		int c1[]=countFrequency(s1);
		int c2[]=countFrequency(s2);
		
		for(int i=0;i<26;i++)
		{
			if(c1[i]!=c2[i])
				return false;
		}return true;
	}
	
	static int[] countFrequency(String st)
	{
		 int count[]=new int[26];
		 
		 for(int i=0;i<st.length();i++)
		 {
			 char ch=st.charAt(i);
			 if(ch>='A' && ch<='Z')
				 count[ch-65]++;
			 else if(ch>='a' && ch<='z')
				 count[ch-97]++;
		 }return count;
	}

}
