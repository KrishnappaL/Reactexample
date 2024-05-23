package javaexampl;

import java.util.Scanner;

class Zoho3 {
    public static String firstPalindrome(String[] words)
     {
        
        for(String input :words)
        {
          if(isPalindrome(input))
            return input;
        }

        return "";

    }
    public static boolean isPalindrome(String s)
     {
        int start = 0, end = s.length() - 1;
        while (start < end) 
        {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
     }
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 //String s=sc.next();
    	// System.out.println(isPalindrome(s));
    	 String[] s1= {"quqquq","1001"} ;
    	 for(int i=0;i<s1.length;i++) {
    	 System.out.println(firstPalindrome(s1));
    	 }
     }

    }
