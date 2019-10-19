public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        max(arr);
        min(arr);
        average(arr);
        fun1(arr);
    }
       //找数组中的最大值
    public static void max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
        //找数组中的最小值
    public static void min(int[] arr){
        int min=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
         //求数组中的元素平均值
    public static void average(int[] arr){
        int sum=0;
        int a=0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }
        a=sum/(arr.length);
        System.out.println(a);
    }

         //打印数组的逆置
    public static void fun1(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left != right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
          for(int i=0;i<arr.length;i++) {
              System.out.print(arr[i]+" ");
          }
    }
}





    //自己实现字符串的输出
   /* public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(toString(arr));
    }

    public static String toString(int[] arr){
        String ret="[";
        for(int i=0;i<arr.length;i++){
              ret=ret+arr[i];
              if(i!=arr.length-1){
                  ret=ret+",";
              }
        }
        ret=ret+"]";
        return ret;
    }*/

