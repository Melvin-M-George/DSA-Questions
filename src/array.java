//segregate the 0s in the left side and 1s in the right side of an array


import java.util.Arrays;

public class array {
   public static int[] segregate0and1(int n, int arr[]) {
        
        int left = 0, right = n - 1;

        while(left < right) {
            if(arr[left] == 0) {
                left++;
            }else if(arr[right] == 1) {
                right--;
            }else {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,0,1,0};
        System.out.println(Arrays.toString(segregate0and1(5 , arr)));
    }
}
        