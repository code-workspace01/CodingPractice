package PracticeProblems;

import java.util.Scanner;

public class AllSubString {
	
	public static void main(String args[]) {
		Scanner scan  = new Scanner(System.in);
		String input  = scan.next();
		PrintSubstring(input);
	}
	
	public static void PrintSubstring(String str) {
		for(int start = 0;start < str.length();start++) {
			for(int end=start;end < str.length();end++)
			{
				System.out.println(str.substring(start, end+1));
			}
		}
	}

}
