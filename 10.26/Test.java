//6.	任意输出五个数，判断里边有无重复的数
/*
import java.util.Arrays;
import java.util.Random;
public class Test {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random random = new Random();
        for (int i = 0; i <5 ; i++) {
            arr[i]=random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        judge(arr);
    }

    public static  void judge(int[] arr){
          for(int i=0;i<4;i++){
              for(int j=i+1;j<5;j++) {
                  if (arr[i] == arr[j]) {
                      System.out.println("有重复的元素");
                      return;
                  }
              }
          }
        System.out.println("没有重复元素");
    }
}
*/



//10.	求出100以内所有偶数的和
/*public class Test{
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i <= 100 ; i+=2) {
            sum=sum+i;
        }
        System.out.println("sum="+sum);
    }
}*/



//14.	求出1!+2!+...+n!是多少？（使用while来做）
/*public class Test{
    public static void main(String[] args) {
        int n=6;
        int a=show(n);
        System.out.println(a);
    }

    public static int show(int n){
        int i=1;
        int j=1;
        int num=1;
        int sum=0;
        while(i<=n){
            while(j<=i){
                num=num*j;
                j++;
            }
            sum=sum+num;
            i++;
        }
        return sum;
    }
}*/

