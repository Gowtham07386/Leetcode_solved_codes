
//Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.


// Example 1

// Input: nums = [8, 8, 7, 6, 5]

// Output: 7

// Explanation:

// The largest value in nums is 8, the second largest is 7

// Example 2

// Input: nums = [10, 10, 10, 10, 10]

// Output: -1

// Explanation:

// The only value in nums is 10, so there is no second largest value, thus -1 is returned

import java.util.*;

public class Secondlargest_num {
    
    public static int secondLargestElement(int[] nums) {
        int n=nums.length-1;
        int largest = nums[0];
        int sl=-1;
        for(int i=0;i<=n;i++){
           if(nums[i]>largest){
                 sl = largest;
                 largest=nums[i];
           }else if(nums[i]<largest && nums[i]>sl){
            sl=nums[i];
           }
        }
        return sl;
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
        int result = secondLargestElement(numbers);

        System.out.println("Second largest number is : "+result);
    }
}
    

