package PracticeProblems;

import java.util.Scanner;

public class ReverseWordWise {
	public static void main(String args[]) {
		Scanner scan  = new Scanner(System.in);
		String input  = scan.nextLine();
		System.out.println(PrintReverseword(input));
		
	}
	
	
	public static String PrintReverseword(String input) {
		// Write your code here
      String ans = "";
	  int currentwordend = input.length()-1;
	  int i=input.length()-1;
	  for(;i>0;i--){
		  if(input.charAt(i) == ' '){
			   int currentwordstart = i + 1;
			   String reverseword = "";
			   for(int j =currentwordstart; j<= currentwordend;j++){
				   reverseword = reverseword + input.charAt(j);
			   }
			   ans = ans + reverseword + " " ;
			   currentwordend = i-1;
		  }
	  }
	  String reverseword = "";
	  for(int k=0;k<=currentwordend;k++) {
		  reverseword = reverseword + input.charAt(k);
	  }
	  ans = ans + reverseword;
	  
	  return ans;
	}
}
