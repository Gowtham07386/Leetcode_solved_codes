import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class leetcode_169_Majority_ele {
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map =new HashMap<>();

        int n =nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

         for (int key : map.keySet()) {
            if (map.get(key) > n / 2) {
                return key;
            }
        }


        return -1;
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
        
        int result = majorityElement(numbers);
        System.out.print("Majority Element :"+result);
    }
}
