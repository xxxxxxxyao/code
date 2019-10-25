//5.	任意输入三个数，然后按从大到小的顺序输出
/*
import java.util.Scanner;
public class Test{
    public static void main(String[] args) {
        int[] arr=new int[3];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            System.out.print("请输入第"+i+"个数：");
            arr[i]=scanner.nextInt();
        }
        show(arr);
    }
    public static void show(int[] arr){
        if(arr[0]<arr[1]) {
            int tmp=arr[0];
            arr[0]=arr[1];
            arr[1]=tmp;
        }if(arr[0]<arr[2]) {
            int tmp=arr[0];
            arr[0]=arr[2];
            arr[2]=tmp;
        }if (arr[1] < arr[2]) {
            int tmp=arr[1];
            arr[1]=arr[2];
            arr[2]=tmp;
        }
        for (int i = 0; i <3 ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}*/

//7.	用if…else if语句判断闰年问题
/*
import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入年份：");
        int year=scanner.nextInt();
        judgeYear(year);
    }

    public static void judgeYear(int year){
        if((year%4)==0 && (year%100)!=0 ||  (year%400)==0){
            System.out.println(year+"是闰年");
        }else{
            System.out.println(year+"不是闰年");
        }
    }

}*/

//12.	输出100以内能被7整除的前5个数

/*public class Test{
    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i <= 100; i++) {
            if(count<5){
                if((i%7)==0){
                    System.out.println(i);
                    count++;
                }else{
                    continue;
                }
            }
        }
    }
}*/


import java.util.Scanner;

//26.	用户输入一个数，判断这个数是否是素数
public class Test{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要判断的数：");
        int num=scanner.nextInt();
        prime(num);
    }

    public static void prime(int num){
        int i=0;
        for(i=2;i<num;i++){
            if((num%i)==0){
                System.out.println("不是素数");
                break;
            }
        }
        if(num==i){
            System.out.println("是素数");
        }
    }
}














