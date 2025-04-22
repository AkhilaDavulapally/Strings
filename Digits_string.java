package com.string;
import java.util.Scanner;
public class Digits_string {
public static void main(String[] args) {
						Scanner sc=new Scanner(System.in);
						System.out.println("Enter the string");
						String s=sc.next();
						int count=0;
						for(int i=0;i<=(s.length()-1);i++)
						{
							char ch=s.charAt(i);
							if(ch>='0'&& ch<='9')
							{
								count++;
							}
								System.out.println(count);
							}
						}
					}
