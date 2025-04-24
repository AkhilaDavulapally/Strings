package com.string;
import java.util.*;
public class Reverse_string {
	public static void main(String[] args) {
		String s="Magic";
		String reverse="";
		for(int i=(s.length()-1);i>=0;i--)
		{
			char ch=s.charAt(i);
			reverse=reverse+ch;
		}
		System.out.println(reverse);
		}
	}
