
import java.util.*;
public class Main{
    //字符串逆置
   /* public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        char[] arr=str.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){
            char tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
            left++;
            right--;
        }
        String str1=new String(arr);
        System.out.println(str1);
    }*/

   //字符串旋转
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        String[] arr=str.split(";");
        if(arr[0].length() != arr[1].length()){
            System.out.println("false");
            return;
        }
        arr[0]=arr[0]+arr[0];
        System.out.println(arr[0].contains(arr[1]));
    }
}