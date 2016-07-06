import java.io.*;
import java.util.*;

//find max sum in a contiguous subarray in an array


public class MaxSumSubarray {
	
	public static int findMaxSum(int[] a)
	{
		int current_sum = a[0];
		int max_sum = a[0];
		
		for(int i=1;i<a.length;i++)
		{
			current_sum = Math.max(current_sum+a[i], a[i]);
			max_sum = Math.max(max_sum, current_sum);
		}
		
		return max_sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {-1,-2,3,0,-5,4,0,1,-7};
		int max = findMaxSum(n);
		System.out.println(max);

	}

}
