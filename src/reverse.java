//Reverse of a number without using loop use only operaters

import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a three digit number");
        int num = sc.nextInt();
        int num1;
        int num2;
        int num3;
        int reverse = 0;
        num1 = num%10;
        num = num/10;
        reverse = reverse*10+num1;
        num2 = num%10;
        num = num/10;
        reverse = reverse*10+num2;
        num3 = num%10;
        reverse = reverse*10+num3;
        System.out.println("The reverse of the number is:" + reverse);

        sc.close();
    
    }
}
