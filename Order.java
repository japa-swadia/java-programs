import java.util.*;
import java.io.*;

//to check if a pattern occurs in the same order in a string

public class Order {
	
	public static boolean checkPatternOrder(String str, String pattern)
	{
		int j=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == pattern.charAt(j))
			{
				j++;
			}
			if(j==pattern.length())
			{
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcnainzzzajijijgallrffderityoqwe";
		String p = "nagarro";
		if(checkPatternOrder(s,p))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}
