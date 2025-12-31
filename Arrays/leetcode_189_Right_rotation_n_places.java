import java.util.Scanner;

public class leetcode_189_Right_rotation_n_places {
    public static int[] rotateArray(int[] nums, int k) {
        int n =nums.length;

        k = k % n;   

        int[] temp= new int[k];

        for(int i=0;i<k;i++){
            temp[i]=nums[n-k+i];
        }

        for(int i=n-k-1;i>=0;i--){
            nums[i+k]=nums[i];
        }

        for(int i=0;i<k;i++){
            nums[i]=temp[i];
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
        System.out.println("Enter the k array elements rotate right");
        int k=sc.nextInt();
        
        int[] result = rotateArray(numbers,k);

        for(int i =0;i<n;i++){
           System.out.print(result[i]+" ");
        }

        
    }
    
}

    
