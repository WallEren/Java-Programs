/*
Frequently occuring character in a string
*/

import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String word = br.readLine();
	    int max = Integer.MIN_VALUE;
	    char maxCharacter = ' ';
	    for(int index1 = 0; index1 < word.length(); index1++)
	    {
	        int characterCount = 0;
	        for(int index2 = 0; index2 < word.length(); index2++)
    	    {
    	        if(word.charAt(index1)==word.charAt(index2))
    	        {
    	            characterCount++;
    	        }
    	    }
    	    if(max < characterCount)
    	    {
    	        max = characterCount;
    	        maxCharacter = word.charAt(index1);
    	    }
    	    else if(max == characterCount)
    	    {
    	        if(maxCharacter < word.charAt(index1))
    	        {
    	            maxCharacter = word.charAt(index1);
    	        }
    	    }
	    }
		System.out.println(maxCharacter);
	}
}
