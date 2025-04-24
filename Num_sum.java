package com.string;
import java.util.Scanner;
public class Num_sum {
public static void main(String[] args) {
						Scanner sc=new Scanner(System.in);
						System.out.println("Enter the string");
						String s=sc.next();
						int sum=0;
						for(int i=0;i<=(s.length()-1);i++)
						{
							String temp="";
							int count=0;
							for(int j=i;j<=(s.length()-1);j++)
							{
							char ch=s.charAt(j);
							if(ch>='0'&& ch<='9')
							{
								temp=temp+ch;
								count++;
							}
							else
							{
								count++;
								break;
							}
							}
							if(!(temp.equals("")))
							{
								int n=Integer.parseInt(temp);
								sum=sum+n;
							}
							 i=i+(count-1);
						}
								System.out.println("The sum of the number present inside"+s+"is"+sum);
							}
}

						
