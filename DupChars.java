import java.io.*;
import java.util.*;

//1. remove duplicate elements from array
//2. check if array contain duplicates such that difference of their indices are at most (given) k

public class DupChars {
	
	public static boolean containsNearbyDuplicate(int[] nums, int k)
	{
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		
		for(int i=0;i<nums.length;i++)
		{
			if(hmap.containsKey(nums[i]) && (i-hmap.get(nums[i]))<=k)
			{
				return true;
			}
			else
			{
				hmap.put(nums[i], i);
			}
		}
		return false;
		
		
	}
	
	public static void removeDups(int[] arr)
	{
		Set<Integer> hset = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(!hset.contains(arr[i]))
			{
				hset.add(arr[i]);
			}
		}
		
		Iterator iter = hset.iterator();
		while(iter.hasNext())
		{
			System.out.println(" "+iter.next());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,2,4,4,5,5,6,7,7,8,8,9,9,9,9,0};
		removeDups(numbers);
		
		int[] numbers2 = {2,6,5,4,1,4};
		boolean answer = containsNearbyDuplicate(numbers2, 3);
		if(answer)
			System.out.println("yes");
		else
			System.out.println("no");

	}

}
