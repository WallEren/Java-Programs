//Remaining days in a year

import java.util.*;

public class Main
{
    static int monthsDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    String date_month_year[] = input.split("/");
	    int date = Integer.valueOf(date_month_year[0]);
	    int month = Integer.valueOf(date_month_year[1]);
	    int year = Integer.valueOf(date_month_year[2]);
	    
	    int totalDaysCompleted = date;
	    for(int index = 0; index < month-1; index++)
	    {
	        totalDaysCompleted+=monthsDays[index];
	    }
	    
	    if(year%400==0 || (year%4==0 && year%100!=0))
	    {
	        if(month > 2)
	        {
	            totalDaysCompleted+=1;
	        }
	        totalDaysCompleted=366-totalDaysCompleted;
	    }
	    else
	        totalDaysCompleted=365-totalDaysCompleted;
	            
	    System.out.println("Remaining days left in the year "+year+" after "+input+" is "+totalDaysCompleted);
	}
}
