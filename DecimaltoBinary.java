//Decimal to Binary

import java.util.Scanner;
class DecimaltoBinary
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        int temp = decimal;
        String binary = "";
        while(temp>0)
        {
            binary = temp%2+binary;
            temp/=2;
        }
        System.out.println(binary);
    }
}
