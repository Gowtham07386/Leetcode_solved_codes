import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class leetcode_1_twosum {
    public static int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        Map<Integer ,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int req = target - nums[i];
            if(map.containsKey(req)){
                return new int[]{map.get(req),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
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
        int target =sc.nextInt();
        int[] result = twoSum(numbers,target);
        System.out.print("Index of two sum of target : [ ");
        for(int i=0;i<2;i++){
        System.out.print(result[i]+" ");
        }
        System.out.print("]");
    }
    
}
