package com.string;
import java.util.Scanner;
public class Lower_case_string {
public static void main(String[] args) {
							Scanner sc=new Scanner(System.in);
							System.out.println("Enter the name");
							String name =sc.nextLine();
							String Lower_name="";
							for(int i=0;i<=(name.length()-1);i++)
							{
								char ch=name.charAt(i);
								if(ch>='A'&& ch<='Z')
								{
									ch=(char)(ch+32);
									Lower_name=Lower_name+ch;
								}
								else
								{
									Lower_name=Lower_name+ch;
								}
							}
							System.out.println(Lower_name);
						}
}

