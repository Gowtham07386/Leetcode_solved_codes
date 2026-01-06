import java.util.Scanner;
class a11{
    public int maxArea(int[] height){
        int left =0, right = height.length-1;
        int maxArea =0;
        while (left<right) {
            int currentArea = Math.min(height[left],height[right])*(right-left);
            maxArea = Math.max(maxArea,currentArea);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
            
        }
        return maxArea;
    }
}
public class leetcode_11_maxArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a11 obj = new a11();
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the array Elements");
        int[] height = new int[n];
        
        for(int i=0;i<n;i++){
            height[i] = sc.nextInt();
        }
        int result = obj.maxArea(height);
        System.out.println("Maximum Area: " + result);
    
        
        
    }
    
}
