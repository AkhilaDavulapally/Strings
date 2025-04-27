package com.string;
import java.util.*;
public class Sub_string {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		System.out.println(s.substring(2));
		System.out.println(s.substring(1, 5));
	}
}
