package com.string;
import java.util.Scanner;
public class Uppercase_Alpha {
public static void main(String[] args) {
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter the string");
					String s=sc.next();
					int count=0;
					for(int i=0;i<=(s.length()-1);i++)
					{
						char ch=s.charAt(i);
						if(ch>='A'&& ch<='Z')
						{
							count++;
						}
							System.out.println(count);
						}
					}
				}
