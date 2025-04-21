package com.string;
import java.util.Scanner;
public class All_possible_substring {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String s =sc.next();
	for(int i=0;i<=s.length()-1;i++)
	{
	 String temp="";
	 for(int j=i;j<=s.length()-1;j++)
	   {
		 char ch=s.charAt(j);
		 temp=temp+ch;
		 System.out.println(temp);
		}
	}
}
}
