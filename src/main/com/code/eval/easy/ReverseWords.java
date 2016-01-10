package com.code.eval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReverseWords {
	
	private static String reverseWords(String input){
		StringBuilder out = new StringBuilder();
		String rev = reverse(input);
		int start = 0;
		int end=0;
		for(int i=0; i<input.length(); i++){
			if(rev.charAt(i) == ' '){
				end = i;
				out.append(reverse(rev.substring(start, end)));
				out.append(" ");
				start = end+1;
			}
		}
		out.append(reverse(rev.substring(start, rev.length())));
		return out.toString();
		
	}
	
	
	private static String reverse(String input){
		char[] charArr = input.toCharArray();
		for(int i=0, j=input.length()-1; i<input.length()/2; i++, j--){
			char temp = charArr[i];
			charArr[i] = charArr[j];
			charArr[j] = temp;
		}
		return new String(charArr);
	}
	
	public static void main(String args[]) throws IOException{
		
		 	File file = new File(args[0]);
	        BufferedReader buffer = new BufferedReader(new FileReader(file));
	        String line;
	        while ((line = buffer.readLine()) != null) {
	            line = line.trim();
	            System.out.println(reverseWords(line));
	        }
	        buffer.close();
	}
}
