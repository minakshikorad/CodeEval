package com.code.eval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UniqueElements {

	private static void printUniqueElements(String b[]) {
		int a[] = new int[b.length];
		for(int i=0; i<a.length; i++){
			a[i] = Integer.parseInt(b[i]);
		}
		
		List<Integer> outList = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (!outList.contains(a[i])) {
				outList.add(a[i]);
			}
		}
		for(int i=0; i<outList.size()-1; i++){
			System.out.print(outList.get(i));
			System.out.print(",");
		}
		System.out.print(outList.get(outList.size()-1));
		System.out.println();
	}
	
	
	public static void main(String args[]) throws IOException{
		File file = new File(args[0]);
		BufferedReader buf = new BufferedReader(new FileReader(file));
		String line;
		while((line = buf.readLine()) != null){
			line = line.trim();
			printUniqueElements(line.split(","));
		}
		buf.close();
	}
}
