package com.sravan.palindromeDemo;

import java.util.Scanner;

public class Palindrome {

	public String reserseString(String original) {
		String reverse=""; 
		int length = original.length();
		// reverse String and save String in the reverse variable
		for ( int i = length - 1; i >= 0; i-- )
			reverse = reverse + original.charAt(i);
		return reverse;
	}

	public void checkPalindrome(String original,String reverse) {

		int i,end;
		
		int begin  = 0;
		end    = original.length() - 1;
		
		// Comparing the two strings by character by character and
		for (i = 0; i <= end; i++) {
			
			if (original.charAt(i) == reverse.charAt(i)) {
				begin++;
				
				
			}
			else {
				break;
			}
		}
		
		if (begin == end+1) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		} 	
	}

	public static void main(String[] args) {
		// First we will read the string from the user
		String original;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string to check if it is a palindrone");
		original=in.nextLine();
		
		
		Palindrome palindrome= new Palindrome();
		
		//second we will reverse the string 
		
		String reverse=palindrome.reserseString(original);
		
		
		// check if string is palindrome or not 
		
		palindrome.checkPalindrome(original, reverse);
		
		// cleaning memory leaks
		in.close();
		

	}

}
