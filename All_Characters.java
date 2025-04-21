package com.string;
import java.util.Scanner;
public class All_Characters {
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the string");
				String s=sc.next();
				for(int i=0;i<=(s.length()-1);i++)
				{
					if(i%2==0)
					{
						System.out.println(s.charAt(i));
					}
				}
			}
}
