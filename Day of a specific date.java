/*
Day of a specific date
*/

import java.util.*;

public class Main
{
    static int monthsDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String weekDays[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday"};
    
    static boolean isLeapYear(int year)
    {
        if(year%400==0 || (year%4==0 && year%100!=0))
            return true;
        else
            return false;
    }
    
    static int getOddDays(int year)
    {
        int oddDays = 0;
        int shortedYear = year%400;
        int remYear = -1;
        if(shortedYear>=300)
        {
            remYear = shortedYear%300;
            oddDays += 1;
        }
        else if(shortedYear>=200)
        {
            remYear = shortedYear%200;
            oddDays += 3;
        }
        else if(shortedYear>=100)
        {
            remYear = shortedYear%100;
            oddDays += 5;
        }
        
        if(remYear == 0)
        {
            return oddDays;
        }
        else
        {
            if(!(remYear >=1 && remYear <= 99))
            {
                remYear = shortedYear;
            }
        }
        
        int yr = year - remYear;
        
        for(int index = yr+1; index <= year; index++)
        {
            if(isLeapYear(index))
                oddDays += 2;
            else
                oddDays += 1;
        }
        return oddDays;
    }
	
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    String date_month_year[] = input.split("/");
	    int date = Integer.valueOf(date_month_year[0]);
	    int month = Integer.valueOf(date_month_year[1]);
	    int year = Integer.valueOf(date_month_year[2]);
	    
	    int oddDaysInYears = getOddDays(year-1);
	    int totalOddDays = date + oddDaysInYears;
	    for(int index = 0; index < month-1; index++)
	    {
	        totalOddDays+=monthsDays[index];
	    }
	    if(isLeapYear(year))
	    {
	        if(month == 2 && date == 29)
	        {
	            totalOddDays+=1;
	        }
	        else if(month > 2)
	        {
	            totalOddDays+=1;
	        }
	    }
	    totalOddDays = totalOddDays%7;        
	    System.out.println("The day of the given date "+input+" is "+ weekDays[totalOddDays]);
	}
}
