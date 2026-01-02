import java.util.*;
public class longest_subArray {

    public int longestSubarray(int[] nums, int k) {

        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxlen = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            // Case 1: subarray from index 0
            if (sum == k) {
                maxlen = Math.max(maxlen, i + 1);
            }

            long rem = sum - k;

            // Case 2: subarray found using prefix sum
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxlen = Math.max(maxlen, len);
            }

            // Store first occurrence of prefix sum
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
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
        
        longest_subArray obj = new longest_subArray();

        int result = obj.longestSubarray(numbers, k);

        System.out.println("Longest subarray length = " + result);
        }
}


