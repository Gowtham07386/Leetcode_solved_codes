import java.util.Scanner;

public class leetcode_1752_arr_sort_check {
    public boolean check(int[] nums) {

        int n = nums.length;
        int deviations =0;

        for (int i = 1; i < n; i++) {
            if (nums[i - 1] > nums[i]) {
                deviations++;
            }
        }

      
        if (nums[n - 1] > nums[0]) {
            deviations++;
        }

        return deviations <= 1;

     }
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
        System.out.println("Size of an array");
        int n = sc.nextInt();
        
        int[] numbers = new int[n];
        
        System.out.println("Enter the array elements");
        for(int i =0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        leetcode_1752_arr_sort_check obj = new leetcode_1752_arr_sort_check();
        boolean result = obj.check(numbers);

        System.out.println("Second largest number is : "+result);
}
}
    

