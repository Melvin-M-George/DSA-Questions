//Write a program to add one to the number represented as array. eg: {1,2,3}--->{1,2,4}


import java.util.Arrays;
import java.util.Scanner;

public class AddOneToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = addOne(arr);
        System.out.println("Result: " + Arrays.toString(result));
    }

    public static int[] addOne(int[] arr) {
        int n = arr.length;
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            arr[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry != 0) {
            int[] result = new int[n + 1];
            result[0] = carry;
            System.arraycopy(arr, 0, result, 1, n);
            return result;
        }

        return arr;
    }
}