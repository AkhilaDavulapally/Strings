package com.string;
import java.util.*;
public class StringBuffer_reverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String s=sc.next();
	StringBuffer s1=new StringBuffer(s);
	System.out.println(s1.reverse());
	System.out.println(s1);
}
}
