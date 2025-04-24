package com.string;
import java.util.Scanner;
public class Palindrome_substring {
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
								
								String rev="";
								for(int k=0;k<=temp.length()-1;k++)
								{
									char ch1=temp.charAt(k);
									rev=ch1+rev;
								}
								if(rev.equals(temp))
								{
									System.out.println(temp);
								}
									
								}
}
}
