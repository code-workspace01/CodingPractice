package LeetCodeProblems;

import java.util.Scanner;

//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
// 
//
//Example 1:
//
//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
//Example 2:
//
//Input: nums1 = [1], m = 1, nums2 = [], n = 0
//Output: [1]
//Explanation: The arrays we are merging are [1] and [].
//The result of the merge is [1].
//Example 3:
//
//Input: nums1 = [0], m = 0, nums2 = [1], n = 1
//Output: [1]
//Explanation: The arrays we are merging are [] and [1].
//The result of the merge is [1].
//Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

public class mergeSortedArray {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the first Array");
		int m = scan.nextInt();
		System.out.println("Enter the size of the Second Array");
		int n = scan.nextInt();
		int nums1[] = new int[m+n];
		int nums2[] = new int[n];
		int i=0;
		for(;i<m;i++) {
			nums1[i] = scan.nextInt();
		}
		for(int j=0;j<n;i++,j++) {
			nums1[i] = 0;
		}
		for(int j=0;j<n;j++) {
			nums2[j] = scan.nextInt();
		}
		merge(nums1,m,nums2,n);
		
	}
	
	private static void merge(int[] nums1, int m, int[] nums2, int n) {
		System.out.println("Elements of First Array");
		for(int i=0;i<nums1.length;i++) {
			System.out.print(nums1[i] + " ");
		}
		System.out.println();
		System.out.println("Elements of Second Array");
		for(int i=0;i<nums2.length;i++) {
			System.out.print(nums2[i] + " ");
		}
		System.out.println();
		for(int i=m,j=n,k=nums1.length; i< nums1.length ; ){
          
        }
		System.out.println("Final Elements of First Array");
		for(int i=0;i<nums1.length;i++) {
			System.out.print(nums1[i] + " ");
		}
	}
}
