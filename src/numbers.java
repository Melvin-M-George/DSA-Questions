//In a given range, put zeros before numbers to make it same bits as the higher range 
//print all the numbers in the range.

public class numbers {
    public static void lowHigh(int low, int high) {
        for (int i = low; i <= high; i++) {
            if(Integer.toString(high).length() > Integer.toString(low).length()) {
                int zeros = Integer.toString(high).length() - Integer.toString(i).length();
                String str = "";
                for (int j = 0; j < zeros; j++) {
                    str = str + '0';
                }
                System.out.print(str + i + " ");
            }else {
                System.out.println(i + " ");
            }
        }
        
    }

    public static void main(String[] args) {
        int low = 5, high = 100;
        lowHigh(low, high);
    }
}