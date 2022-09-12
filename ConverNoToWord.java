package com.String10september2022;

import java.util.Scanner;

public class ConverNoToWord {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter The Number : ");
		int n=sc.nextInt();
		
		nw(n/10000000,"crore");
		nw(n/100000%100,"lakh");
		nw(n/1000%100,"thousand");
		nw(n/100%10,"hundred");
		nw(n%100,"");

	}

	private static void nw(int x, String st) {
		String one[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven"
				,"tweleve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
		String two[]= {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
		
		if(x<20)
			System.out.print(one[x]);
		else
			System.out.print(two[x/10]+one[x%10]);
		if(x!=0)
			System.out.print(st+" ");
		
	}
	
	

}
