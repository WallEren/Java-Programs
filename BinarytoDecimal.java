//Binary to Decimal

import java.util.Scanner;
class BinarytoDecimal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String binary = sc.nextLine();
        int decimal = 0;
        int power = 0;
        for(int index = binary.length()-1; index >= 0; index--)
        {
            if(binary.charAt(index) == '1')
            {
                decimal = decimal + (int)Math.pow(2, power);
            }
            power++;
        }
        System.out.println(decimal);
    }
}
