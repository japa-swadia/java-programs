import java.io.*;
import java.util.*;

public class isPermutation {
	
	public static boolean checkPermutation(String s, String t)
	{
		if(s.length()!=t.length())
		{
			return false;
		}
		
		Map<Character, Integer> hmap1 = new HashMap<Character, Integer>();
		Map<Character, Integer> hmap2 = new HashMap<Character, Integer>();
		
		for(int i = 0;i<s.length()&&i<t.length();i++)
		{
			char c = s.charAt(i);
			char d = t.charAt(i);
			
			if(hmap1.containsKey(c) && hmap2.containsKey(d))
			{
				hmap1.put(c, hmap1.get(c)+1);
				hmap2.put(d, hmap1.get(d)+1);
			}
			else
			{
				hmap1.put(c, 1);
				hmap2.put(d, 1);
			}
		}
		if(hmap1.equals(hmap2))
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "gods";
		String b = "doga";
		
		if(checkPermutation(a,b))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	
				
				

	}

}
