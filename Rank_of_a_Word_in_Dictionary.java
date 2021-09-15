//Rank of a word in dictionary with and without repetition
//For formula refer this video: https://www.youtube.com/watch?v=-MpL0X3AHAs

import java.util.*;

class Rank_of_a_Word_in_Dictionary
{
    static int getfactorial(int number)
    {
        int fact = 1;
        if(number <= 1)
            return 1;
        for(int index = 1; index <= number; index++)
        {
            fact = fact*index;
        }
        return fact;
    }
    static int getsmallerRankThanMe(String word, int position)
    {
        int smallerRankThanMe = 0;
        for(int index = position+1; index < word.length(); index++)
        {
            if(word.charAt(position) > word.charAt(index))
            {
                smallerRankThanMe++;
            }
        }
        return smallerRankThanMe;
    }
    static long getrepetitionFactorialValue(String word, int position)
    {
        ArrayList<Character> occured = new ArrayList<>();
        long totalValue = 1;
        while(position < word.length())
        {
            int count = 0;
            if(!occured.contains(word.charAt(position)))
            {
                occured.add(word.charAt(position));
                for(int index = position; index < word.length(); index++)
                {
                    if(word.charAt(position) == word.charAt(index))
                    {
                        count++;
                    }
                }
            }
            totalValue = totalValue * getfactorial(count);
            position++;
        }
        return totalValue;
    }
    static int getRow(String word)
    {
        int row = 0;
        int length = word.length()-1;
        for(int index = 0; index < word.length(); index++)
        {
            row = row + (int)((getfactorial(length--)*getsmallerRankThanMe(word, index)/getrepetitionFactorialValue(word, index)));
        }
        return row+1;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        String word = input.toLowerCase();
        int row = getRow(word);
        System.out.println(row);
    }
}
