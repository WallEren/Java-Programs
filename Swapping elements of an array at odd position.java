import java.util.Scanner;
public class Main{

     public static void main(String []args)
     {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n ; i++)
        {
            array[i] = sc.nextInt();
        }
        int i;
        int j = n-1;
        int temp;
        i = 0;
        if(n%2!=0)
        {
            j = n-1;
        }
        else
        {
            j = n-2;
        }
        while(i<j)
        {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i=i+2;
            j=j-2;
        }
        for (i=0;i<n;i++)
        {
            System.out.print(array[i]);
        }
    }
}
