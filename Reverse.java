import java.io.*;
import java.util.*;

//1. reverse words in a string
//2. reverse vowels in a string

public class Reverse {
	
	public String reverseVowels(String s) {
        
		char[] str = s.toCharArray();
		for(int i=0, j=s.length()-1;i<s.length()&& j>=0;i++,j--)
        {
           // if(s.charAt(i))
        }
        return s;
    }


	public static String reverseWord(String s)
	{
		String r = " ";
		for(int i=s.length()-1;i>=0;i--)
		{
			r = r + s.substring(i, i+1);
		}
		return r;
	}
	
	public static List<String> reverseString(String s)
	{
		List<String> result = new ArrayList<String>();
		String[] words = s.split(" ");
		
		for(String w : words)
		{
			result.add(reverseWord(w));
		}
		
		return result;
	}
	
	public static String reverseString2(String s)
	{
		StringBuilder result = new StringBuilder();
		String[] words = s.split(" ");
		for(String w : words)
		{
			result.append(reverseWord(w));
		}
		
		return result.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "REST does not impose any restriction on the format of a resource representation. A client can ask for JSON representation where as another client may ask for XML representation of same resource to the server and so on. It is responsibility of the REST server to pass the client the resource in the format that client understands.";
		List<String> reverselist = reverseString(str);
		System.out.println(reverselist.toString());
		String reversed = reverseString2(str);
		System.out.println(reversed);

	}

}
