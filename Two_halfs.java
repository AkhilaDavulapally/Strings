package com.string;
import java.util.Arrays;
public class Two_halfs {
	   
	    	    public static void main(String[] args) {
	    	        String s = "akhila";
	    	        s = s.toUpperCase(); 

	    	        int mid = s.length() / 2; 

	    	        char[] firstHalf = s.substring(0, mid).toCharArray();
	    	        char[] secondHalf = s.substring(mid).toCharArray();
	    	        Arrays.sort(firstHalf);
	    	        Arrays.sort(secondHalf);
	    	        String result = new String(firstHalf) + new String(secondHalf);

	    	        System.out.println(result); 
	    	    }
	    	}
