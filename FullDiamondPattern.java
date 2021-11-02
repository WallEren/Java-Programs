/*
Full Diamond Pattern
*/

import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
	    InputStreamReader r = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(r);
	    int rowLimit = Integer.parseInt(br.readLine());
      for(int rowIterator = 1; rowIterator <= (rowLimit*2-1); rowIterator++)  //for rows
      {
          if(rowIterator<=rowLimit)
          {
              for(int index1 = 0; index1 <= rowLimit-rowIterator; index1++)   //for spaces
              {
                  System.out.print(" ");
              }
              for(int index2 = 1; index2 <= (rowIterator*2-1); index2++)  //for pattern
              {
                  System.out.print("*");
              }
          }
          else
          {
              for(int index1 = rowIterator; index1 >= rowLimit; index1--)   //for spaces
              {
                  System.out.print(" ");
              }
              for(int index2 = 1; index2 <= 2*(rowLimit-(rowIterator-rowLimit))-1; index2++)  //for pattern
              {
                  System.out.print("*");
              }
          }
          System.out.println();
      }
	}
}
