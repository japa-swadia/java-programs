import java.io.*;
import java.util.*;
//to check if given strings are anagrams of each other

public class Solution3 {
	 static boolean isAnagram(String A, String B) {
	      char[] charA = A.toLowerCase().toCharArray();
	      char[] charB = B.toLowerCase().toCharArray();
	      Arrays.sort(charA);
	      Arrays.sort(charB);
	      
	      return Arrays.equals(charA, charB);
	   }
	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        boolean ret=isAnagram(A,B);
	        if(ret)System.out.println("Anagrams");
	        else System.out.println("Not Anagrams");
	        
	    }

}
