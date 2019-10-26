//17.	打印出九九乘法表
/*public class Test {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        for(i=1;i<=9;i++){
            for(j=1;j<=i;j++){
                System.out.printf("%d*%d=%2d   ",j,i,i*j);
            }
            System.out.println();
        }
    }
}*/




import java.util.Scanner;

//22.	求出10的N次方的值，N为用户输入的
/*
public class Test{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入N的值：");
        int N=scanner.nextInt();
        System.out.println(Math.pow(10,N));
    }
}*/





//20.	1~10之间的整数相加，得到累加值大于20的当前数.
/*
public class Test{
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
              sum=sum+i;
              if(sum>=20){
                  System.out.println(i);
                  break;
              }
        }
    }
}*/







//21.	求出1000以内所有能被9整除的数之和，每行显示5个数

public class Test{
    public static void main(String[] args) {
        find();
    }


    public static void find(){
        for (int i = 1; i <1000 ; i++) {
            if((i%9)==0){
                System.out.print(i + " ");
                if((i%5)==0){
                    System.out.println();
                }
            }
        }
    }
}













