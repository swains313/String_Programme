package com.String25august2022;

public class String1 {

	public static void main(String[] args) {
		
		String firstNmae="tony stark";
		String lastName="cptain america ";
		
		String fullName=firstNmae+ "@"+lastName;
		
		System.out.println(fullName.length());
		
		for(int i=0;i<fullName.length();i++)
		{
			System.out.print(fullName.charAt(i));
		}
		
		System.out.println(firstNmae.equals(lastName));
		
		
		System.out.println(firstNmae.compareTo(lastName));
		
		System.out.println(firstNmae.substring(5                                                  ));
		
		
	

	}

}
