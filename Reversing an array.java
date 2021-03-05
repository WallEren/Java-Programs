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
        while(i<j)
        {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        for (i=0;i<n;i++)
        {
            System.out.print(array[i]);
        }
    }
}
