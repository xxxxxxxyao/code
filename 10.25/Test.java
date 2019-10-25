//2.	已知圆的半径radius= 1.5，求其面积
/*public class Test {
    public static void main(String[] args) {
        double radius=1.5;
        double b=area(radius);
        System.out.println(b);
    }


    public static double area(double rid){
        return (3.14*rid*rid);
    }
}*/

import java.util.Scanner;

//3.	判断用户输入的数是否是偶数并且画出他们的流程图
/*
public class Test{
    public static void main(String[] args) {
        System.out.print("请输入要判断的数：");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        judge(num);
    }

    public static void judge(int num){
        if(num%2==0){
            System.out.println(num+"是偶数");
        }else {
            System.out.println(num + "不是偶数");
        }
    }
}*/
//4.	实现计算器功能，用户输入两个数，并且当用户 按1时：求出两个数的和 按2时：求出两个数的差 按3时：求出两个数的积 按4时：求出两个数的商 否则，求出两个数的余

public class Test{
    public static void main(String[] args) {
        int num=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入两个数：");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        System.out.print("请输入选项：");
        int i=scanner.nextInt();
        switch(i){
            case 1:
                System.out.println(num1+num2);
                 break;
            case 2:
                System.out.println(num=num1-num2);
                 break;
            case 3:
                System.out.println(num=num1*num2);
                break;
            case 4:
                System.out.println(num=num1/num2);
                break;
            default:
                System.out.println(num1%num2);
                break;
        }
    }
}
