
//Automorphic number- when a number is squared ,the output's last digit is the same number eg:5^2 = 25

import java.util.Scanner;
public class automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a single digit number ");
        int n = sc.nextInt();
         
        if (n==(n*n)%10){
            System.out.println("The square of the number is :" + n*n);
            System.out.println("The entered number is automorphic");
        }
        else{
             System.out.println("The square of the number is :" + n*n);
            System.out.println("The entered number is not automorphic");
        }

        sc.close();
        

    }
}
