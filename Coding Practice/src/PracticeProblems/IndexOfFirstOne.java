package PracticeProblems;

import java.util.Scanner;

public class IndexOfFirstOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		scan.close();
		int result = firstIndex(input);
		System.out.println("the First index is " + result);
	}
	
	private static int firstIndex(String input) {
		int ans = 0,temp = 0,temp2=0,count = 0,noOfZeros=0,lastindex=0;
		int firstindex = input.indexOf("1");
		if(firstindex != -1) {
			for(int i =firstindex;i<input.length();i++) {
				String traversestring = input.substring(i);
				if(input.charAt(i)== '1') {
					temp = traversestring.indexOf(i) + 1;
					String tempstring = traversestring.substring(temp+1);
					temp2 = tempstring.indexOf("1");
					if(temp2 == -1) {
					    noOfZeros = tempstring.length()>0 ? tempstring.length() : Integer.MAX_VALUE ;
					    lastindex = i;
						break;
					}
					noOfZeros = temp + temp2;
					if(count<noOfZeros) {
						count = noOfZeros;
						ans = i;
					}
					i=noOfZeros+i;
				}
			}
		}else {
			return -1;
		}
		
		if(count<noOfZeros) {
			ans = lastindex;
		}
		return ans;
	}

}
