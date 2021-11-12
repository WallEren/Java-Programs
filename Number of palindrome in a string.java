/*
Number of palindrome in a string
*/

import java.io.*;
public class Main
{
    static int getPalindromeCount(String words[])
    {
        int palindromeCount = 0;
        for(int index = 0; index < words.length; index++)
        {
            String temp = words[index];
            boolean isPalindrome = false;
            int start = 0;
            int end = temp.length()-1;
            while(start<end)
            {
                if(temp.charAt(start++)!=temp.charAt(end--))
                {
                    isPalindrome = false;
                    break;
                }
                else
                {
                    isPalindrome = true;
                }
            }
            if(isPalindrome)
            {
                palindromeCount++;
            }
        }
        return palindromeCount;
    }
	public static void main(String[] args) throws IOException
	{
	    InputStreamReader r = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(r);
	    String sentence = br.readLine();
	    String words[] = sentence.split(" ");
	    System.out.println(getPalindromeCount(words));
	}
}
