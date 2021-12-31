/*
Java Time Delay Program
Link: https://onlinegdb.com/nF8kGMpyY
*/

import java.util.concurrent.TimeUnit;
public class Main
{
    static void delay() throws InterruptedException
    {
        TimeUnit.SECONDS.sleep(1);
    }
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Java time delay program...");
		delay();
		System.out.println("Countdown from 10 to 1...");
		delay();
		System.out.print("Ready... ");
		delay();
		System.out.print("Steady... ");
		delay();
		System.out.print("Go... \n");
		delay();
		System.out.println("Ten");
		delay();
		System.out.println("Nine");
		delay();
		System.out.println("Eight");
		delay();
		System.out.println("Seven");
		delay();
		System.out.println("Six");
		delay();
		System.out.println("Five");
		delay();
		System.out.println("Four");
		delay();
		System.out.println("Three");
		delay();
		System.out.println("Two");
		delay();
		System.out.println("One");
	}
}
