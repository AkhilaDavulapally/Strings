package com.string;
import java.util.*;
public class Find_Length {
	public static void main(String[] args) {
		String s="SaiRam";
		String First_half="";
		String Second_half="";
		int size=s.length();
		int half=(size/2)-1;
		for(int i=0;i<=size-1;i++)
		{
			char ch=s.charAt(i);
			if(i<=half)
			{
				First_half=First_half+ch;
			}
			else
			{
				Second_half=Second_half+ch;
			}
		}
	}

}
