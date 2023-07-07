//check whether a number is trendy or not...trendy--> a three digit number and middle digit divisble by 3

import java.util.Scanner;


public class trendy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int i = sc.nextInt();

        if( i>129 && i<1000){
        
            i=i/10;
            int x=i%10;
            if(x%3==0){
                System.out.println("The number is trendy");

            }
            else{
                System.out.println("The number is not trendy");
            }
        }
        else{
            System.out.println("The number is not trendy");
        }
        sc.close();

    }
}
