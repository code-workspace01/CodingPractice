package PracticeProblems;

import java.util.Comparator;
import java.util.List;



public class Color {
	
	void display(int i) {
		System.out.println("one");
	}
	
	void display(long l) {
		System.out.println("two");
	}
	
	
	public static void main(String[] args) {
		new Color().display(0B1010_0101_1001_0110);
	}
}
