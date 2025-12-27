import java.util.Scanner;

public class left_rotation_one {
    public static int[] rotateArrayByOne(int[] nums) {

        int n = nums.length;
        if(n == 0) return nums;
        int temp = nums[0];
        for(int i=1;i<n;i++){
            
            nums[i-1]=nums[i];  
            
        }
       
            nums[n-1] = temp;
        

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
        
        int[] result = rotateArrayByOne(numbers);

        for(int i =0;i<n;i++){
           System.out.print(result[i]+" ");
        }

        
    }
    
}
