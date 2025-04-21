package com.string;
import java.util.*;
public class Case_check_string {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Read the question carefully");
		System.out.println("***Sun rises in the east***");
		System.out.println("Enter whether it is true or false");
		String ans=sc.next();
		if(ans.equalsIgnoreCase("true"))
		{
			System.out.println("It is correct");
		}
		else
		{
			System.out.println("It is not correct");
		}
	}
}
