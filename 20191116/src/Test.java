public class Test {
    public static void main(String[] args) {
        int[]  arr={1,1,2,3,3,3,4,4};
        int i=fun(arr);
        System.out.println(i);
    }

    public static int fun(int[] arr){
        if(arr==null){
            return 0;
        }

        int fast=1;
        int slow=0;
        while(fast<arr.length){
            if(arr[slow]==arr[fast]){
                fast++;
            }else{
                slow++;
                arr[slow]=arr[fast];
                fast++;
            }
        }
        return slow+1;
    }
}
