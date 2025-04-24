package com.string;
public class Palindrome_string {

		public static void main(String[] args) {
			String s="ITI";
			String reverse="";
			for(int i=(s.length()-1);i>=0;i--)
			{
				char ch=s.charAt(i);
				reverse=reverse+ch;
			}
			if(s.equals(reverse))
			{
				System.out.println("It is palindrome");
			}
			else
			{
				System.out.println("It is not a palindrome");
			}
		}
}
