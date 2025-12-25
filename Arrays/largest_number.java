import java.util.*;

public class largest_number {
    
    public static int largest(int[] nums) {
        int n=nums.length-1;
        int largest = nums[0];
       
        for(int i=0;i<=n;i++){
           if(nums[i]>largest){
                 largest=nums[i];
           }
        }
        return largest;
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
        int result = largest(numbers);

        System.out.println("largest number is : "+result);
    }
}
    


    
