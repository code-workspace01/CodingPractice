package PracticeProblems;

import java.util.Scanner;

public class NumbertoAlphabet {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		StringBuffer stringBuffer = new StringBuffer("");
		while(input > 0) {
			int temp = input%26;
			if(temp>0) {
				stringBuffer.insert(0, (char)(temp + 'A' - 1));
			}else {
				stringBuffer.insert(0, (char)('A'));
			}
			input /= 26;
		}
		
		System.out.println(stringBuffer);
		
	}

}
