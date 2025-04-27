package com.string;
import java.util.Scanner;
public class Upper_case_string {
public static void main(String[] args) {
						Scanner sc=new Scanner(System.in);
						System.out.println("Enter the name");
						String name =sc.nextLine();
						String Upper_name="";
						for(int i=0;i<=(name.length()-1);i++)
						{
							char ch=name.charAt(i);
							if(ch>='a'&& ch<='z')
							{
								ch=(char)(ch-32);
								Upper_name=Upper_name+ch;
							}
							else
							{
								Upper_name=Upper_name+ch;
							}
						}
						System.out.println(Upper_name);
					}
}
