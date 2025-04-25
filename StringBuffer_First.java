package com.string;
public class StringBuffer_First {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("SaiRam");
		StringBuffer s2=new StringBuffer("SaiRam");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}
