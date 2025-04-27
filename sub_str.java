package com.string;
import java.util.Arrays;
public class sub_str 
{
	public static void main(String[] args) 
	{
		String s="SaiTilak";
		s=s.toLowerCase();
		char[] charArray=s.toCharArray();
		Arrays.sort(charArray);

		for (int j = 0; j < charArray.length; j++) 
		{
            if (charArray[j] == 's' || charArray[j] == 't')
            {
                charArray[j] = (char) (charArray[j] - 32); 
            }
		}
		System.out.println(charArray);
	}
}
	
	
