package com.string;
import java.util.Scanner;
public class Check_substring {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Gmail id");
			String mail=sc.next();
			if(mail.contains("@gmail.com"))
			{
				System.out.println("It is gmail id");
			}
			else
			{
				System.out.println("It is not gmail id");
			}
		}
}
