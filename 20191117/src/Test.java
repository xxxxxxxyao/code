public class Test {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,};
        int i=remove(arr);
        System.out.println(i);
    }


    public static  int remove(int[] arr){
        if(arr.length<0){
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
