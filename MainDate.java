package com.String10september2022;

import java.util.Scanner;

public class MainDate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		
		System.out.println("enter The First Date (DD MM YYYY) ");
		int d1=sc.nextInt();
		int m1=sc.nextInt();
		int y1=sc.nextInt();
		
		Date dt1=new Date(d1,m1,y1);
		
		System.out.println("enter The Second Date (DD MM YYYY) ");
		int d2=sc.nextInt();
		int m2=sc.nextInt();
		int y2=sc.nextInt();
		
		Date dt2=new Date(d2,m2,y2);
		
		
		System.out.println("first Date : "+dt1);
		System.out.println("second Date : "+dt2);
		
		System.out.println("number Of days betweeen these two days : ");
		System.out.println(dt2.noOfDays()-dt1.noOfDays());
		
		System.out.println(dt1+" day name " +dt1.getDayName());
		System.out.println(dt2+" day name "+dt2.getDayName());
	}

}
