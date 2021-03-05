import java.util.Scanner;
public class Main{

     public static void main(String []args)
     {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min;
        int secondmin;
        int[] array = new int[n];
        for (int i = 0; i < n ; i++)
        {
            array[i] = sc.nextInt();
        }
        min = array[0];
        for (int i = 0; i < n ; i++)
        {
            if (array[i]<min)
            {
                min=array[i];
            }
        }
        System.out.println(min);
        secondmin = array[0];
        for (int i = 0; i < n ; i++)
        {
            if (array[i]<min && array[i]!=min)
            {
                min=array[i];
            }
        }
        System.out.println(secondmin);
     }
}
