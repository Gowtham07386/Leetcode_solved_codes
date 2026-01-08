import java.util.Scanner;

public class leetcode_268_findmissing_num {
    public static int missingNumber(int[] nums) {
        int n = nums.length;

        int total = n * (n+1)/2;
        int asum =0;
        for(int i=0;i<n;i++){
            asum = asum+nums[i];
        }
        int result = total-asum;

        return result;
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
        
        int result = missingNumber(numbers);
        System.out.print("Missing number in array is : "+result);
       
    }
    
}
