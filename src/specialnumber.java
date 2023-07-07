//special numbers in a range eg=19_____1+9=10 and 1*9=9--->sum + product = number(19)

import java.util.Scanner;
public class specialnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the starting of the range");
        int startnum = sc.nextInt();

        System.out.println("enter the ending of the range");
        int endnum = sc.nextInt();

        int sum=0;
        int pro=1;
        int num;

        for(num = startnum;num<=endnum;num++){
            int temp=num;
           if(num<=99){
            sum=num%10+num/10;
            pro=(num%10)*(num/10);
           }
           if(num>10 && sum+pro==temp){
            System.out.println(num);
            System.out.println("the number is special");

           }
        
            sc.close();    


        }
        
    }
    
}
