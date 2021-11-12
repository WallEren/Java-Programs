/*
Farthest element from 0 in an array
*/

import java.util.*;

public class Main
{
    static int solve(int N, int[] A)
    {
        int max = Integer.MIN_VALUE;
        int num = 0;
        for(int i = 0; i < N; i++)
        {
            int dif = Math.abs(0-A[i]);
            if(max<dif)
            {
                num = A[i];
                max = dif;
            }
            else if(max==dif)
            {
                if(A[i]<num)
                {
                    num = A[i];
                }
            }
        }
        return num;
    }
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int A[] = new int[N];
	    for(int i = 0; i < N; i++)
	    {
	        A[i] = sc.nextInt();
	    }
	    int output = solve(N, A);
		System.out.println(output);
	}
}
