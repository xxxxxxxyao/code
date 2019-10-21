import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] newarr=copy(arr);
        System.out.println(Arrays.toString(newarr));
    }

    public static int[] copy(int[] arr){
        int[] ret=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            ret[i]=arr[i];
        }
        return ret;
    }
}
   /* public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] newarr=Arrays.copyOf(arr,arr.length);
        System.out.println("newarr="+Arrays.toString(newarr));

        arr[0]=10;
        System.out.println("newarr="+Arrays.toString(arr));
        System.out.println("newarr="+Arrays.toString(newarr));
    }
}*/
   /* public static void main(String[] args) {     //数组打印
        int[] arr={1,2,3,4,5,6};
        System.out.println(myToString(arr));
    }


    public static String myToString(int[] arr){
        String ret="[";
        for(int i=0;i<arr.length;i++){
            ret=ret+arr[i];
            if(i!=arr.length-1){
                ret+=",";
            }
        }
        ret+="]";
        return ret;
    }
}*/
   /* public static void main(String[] args) {
        int[] array1={1,2,3,4,5};
        String arr= Arrays.toString(array1);
        System.out.println(arr);
    }
}*/
