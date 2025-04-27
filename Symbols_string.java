package com.string;
import java.util.Scanner;
public class Symbols_string  {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string");
			String s=sc.next();
			for(int i=0;i<=(s.length()-1);i++)
			{
				char ch=s.charAt(i);
			
			    if(!(ch>='A'&& ch<='Z')||(ch>='a'&&ch<='z')||(ch>='0' && ch<='0'))
				{
					System.out.println(ch+"");
				}
			}
		}
}
