/*24.	使用for循环求出第一个数+第二个数=第三个数 依此类推的 要求循环的次数是用户界面输入的（初始定义第一个数为1，第二个数为1）
        然后打印出这个数列（斐波那契数）*/

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入循环次数：");
        int n=scanner.nextInt();
        int f1=1;
        int f2=1;
        int sum=0;
        System.out.print(f1+" ");
        System.out.print(f2+" ");
        for(int i=1;i<=n;i++){
            sum=f1+f2;
            f1=f2;
            f2=sum;
            System.out.print(sum+" ");
        }
    }
}
