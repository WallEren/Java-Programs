/*
nth LCM term of 2 numbers
*/

import java.util.*;
public class Main
{
    static long gcd(long firstNum, long secondNum)
    {
        if (firstNum == 0)
            return secondNum;
        return gcd(secondNum % firstNum, firstNum);
    }
    
    static long lcm(long firstNum, long secondNum)
    {
        return (firstNum / gcd(firstNum, secondNum)) * secondNum;
    }
    
    static long solve(long firstNum, long secondNum, long nthTerm) 
    {
       long lcm = lcm(firstNum, secondNum);
       return lcm*nthTerm;
    }
    
    public static void main(String[] args)
    {
	    Scanner sc=new Scanner(System.in);
	    int testCases = sc.nextInt();
	    for(int index = 0; index < testCases; index++)
	    {
	        long firstNum = sc.nextInt();
	        long secondNum = sc.nextInt();
	        long nthTerm = sc.nextInt();
	        long output = solve(firstNum, secondNum, nthTerm);
	        System.out.println(output);
	    }
	}
}
