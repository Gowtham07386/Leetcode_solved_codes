import java.util.Scanner;

public class leetcode_75_0s_1s_2s {
    public static int[] sortColors(int[] nums) {
        int n = nums.length;


    //    int  cnt0 =0;
    //    int  cnt1 =0;
    //    int  cnt2 =0;

    //     for(int i=0;i<n;i++){
    //         if(nums[i] == 0){
    //             cnt0++;
    //         }else if(nums[i] == 1){
    //             cnt1++;
    //         }else{
    //             cnt2++;
    //         }
    //     }
    //     for(int i=0;i<cnt0;i++){
    //         nums[i]=0;
    //     }
    //     for(int i=cnt0;i<cnt0+cnt1;i++){
    //         nums[i]=1;
    //     }
    //     for(int i=cnt0+cnt1;i<n;i++){
    //         nums[i]=2;
    //     }



       int  low =0;
       int  mid =0;
       int  high =n-1;

        while(mid <= high){
            if(nums[mid] ==0){
                int temp = nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }else if(nums[mid] ==1){
                mid++;
            }else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
        return nums;
        
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
        
        int[] result = leetcode_75_0s_1s_2s.sortColors(numbers);
        System.out.print("sorted elements : ");
        for(int i=0;i<n;i++){
        System.out.print(+result[i]+" ");
        }
}
    
}
