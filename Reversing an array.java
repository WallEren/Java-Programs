import java.util.Scanner;
public class Main{

     public static void main(String []args)
     {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] array = new int[arrSize];
        for (int index = 0; index < arrSize ; index++)
        {
            array[index] = sc.nextInt();
        }
        int startIndex;
        int endIndex = arrSize-1;
        int temp;
        startIndex = 0;
        while(startIndex<endIndex)
        {
            temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
        for(int index = 0; index < arrSize ; index++)
        {
            System.out.print(array[index]+" ");
        }
    }
}
