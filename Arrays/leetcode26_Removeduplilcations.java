
class a26{
    public int removeDuplications(int[] nums){
        int n = nums.length;
        if(nums.length == 0) return 0;

        int i =1;
        for(int j =1;j<n;j++){
            if(nums[j] != nums[i-1]){
                nums[i] = nums[j];
                i++;
            }

        }
        return i;

    }
}
public class leetcode26_Removeduplilcations {
    public static void main(String[] args) {
        a26 obj = new a26();
        int[] nums ={0,0,1,1,2,2,3,4,4,4};
        int result = obj.removeDuplications(nums);

        System.out.print(result+" , [ ");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");

        
    }
    System.out.print("]");
    
    
}
}