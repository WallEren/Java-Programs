//Date Validity Checker

import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    String date_month_year = sc.nextLine();
	    String[] arr = date_month_year.split("/");
	    int date = Integer.valueOf(arr[0]);
	    int month = Integer.valueOf(arr[1]);
	    int year = Integer.valueOf(arr[2]);
	    boolean isValid = false;
	    if(year>1 && year<9999)
	    {
	        if( ((year%100!=0&&year%4==0)||year%400==0) && (month==2 && date>=1 && date<=29) )
	        {
	            isValid = true;
	        }
	        else if( (month==1||month==3||month==5||month==7||month==8||month==10||month==12) && (date>=1 && date<=31) )
	        {
	            isValid = true;
	        }
	        else if( (month == 2) && (date>=1 && date<=28) )
	        {
	            isValid = true;
	        }
	        else if( (month==4||month==6||month==9||month==11) && (date>=1 && date<=30) )
	        {
	            isValid = true;
	        }
	    }
	    System.out.println(isValid==true?"Valid":"Invalid");
	}
}
