package com.string;
public class String_final {
	public static void main(String[] args) {
		String s1="Sai";
		String s2="Tilak";
		System.out.println(s1+""+s1.hashCode());
		System.out.println(s2+""+s2.hashCode());
		s1="Magic";
		String s3="Sai";
		System.out.println(s3+""+s3.hashCode());
		System.out.println(s1+""+s1.hashCode());
		String a1=new String("Spandana");
		System.out.println(a1+""+a1.hashCode());
		String a2="Tilak";
		System.out.println(a2+""+a2.hashCode());
		String f1="Spandana";
		System.out.println(f1+""+f1.hashCode());
		}
}
