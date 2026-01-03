import java.util.*;
public class longsubArray_pos_neg {

 public int longestSubarray_PosNegs(int[] nums, int k) {

       int n = nums.length;
       int left =0;
       int right = 0;
       int sum = nums[0];

       int maxlen =0;

while(right < n)
    {
       while(left<=right && sum > k){
        sum = sum - nums[left];
        left++;


       }
       if(sum == k){
        maxlen = Math.max(maxlen , right - left +1);
       }
       right++;
       if(right <n){
        sum += nums[right];
       }
       }


        return maxlen;
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
        int k = sc.nextInt();
        
        longsubArray_pos_neg obj = new longsubArray_pos_neg();

        int result = obj.longestSubarray_PosNegs(numbers, k);

        System.out.println("Longest subarray length = " + result);
        
        
    }
    
}
