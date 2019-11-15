import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr={1,1,2};
        int a=show(arr);
        System.out.println(a);
    }

    public static int show(int[] nums){
        if(nums.length<0){
            return 0;
        }
       //双指针法
        int slow=0;
        int fast=1;
        while(fast<nums.length){
            if(nums[slow]==nums[fast]){
                fast++;
            }else{
                slow++;
                nums[slow]=nums[fast];
                fast++;
            }
        }
        return slow+1;
    }
}
