//有一个猜数字游戏，系统随机生成一个数用户来猜，每人有10次机会。当用户猜完之后统计用户得分情况（猜对一次给1分，猜错不得分）
        //每一个档次的分数所给出的提示不同。（要求当用户连续输入三次错误的时候直接退出并给出评价）
import java.util.*;
/*public class Test {
    public static void game(){
        Random ran=new Random();
        int count=1;
        int grade=0;
        int fail=0;
        while(count<=10){
            int num=ran.nextInt(10);
            Scanner scanner=new Scanner(System.in);
            System.out.print("请猜一个数（0-10）：");
            int in=scanner.nextInt();
            if(in==num){
                System.out.println("猜对啦！");
                grade++;
            }else{
                fail++;
                grade=grade;
              if(fail==3){
                  break;
              }
            }
            count++;
        }
        if(grade>=0 && grade<2){
            System.out.println("继续加油叭！");
        }
        if(grade>=2){
            System.out.println("你太棒啦！");
        }
    }


    public static void main(String[] args) {
        System.out.println("******************");
        System.out.println("****1.开始游戏****");
        System.out.println("****2.退出游戏****");
        System.out.println("******************");
        System.out.print("请选择：");
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        switch(input){
            case 1:
                game();
                break;
            case 2:
                break;
            default:
                break;

        }
    }
}*/

//18.求出1000以内所有能被4和5整除并且不能被3整除的数之和
/*
public class Test{
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        for(i=0; i<1000;i++){
            if((i%4)==0 && (i%5)==0 && (i%3)!= 0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
*/

//16.要求用户输入一个数，使用do-while将它反转过去！
/*public class Test{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入一个数：");
        int input=scanner.nextInt();
        do{
            System.out.print(input%10);
            input=input/10;
        }while(input!=0);
    }
}*/




//15.用while循环方式做一个图形！直角三角形！
/*public class Test{
    public static void main(String[] args) {
        int row=0;
        while(row<5){
            int col=0;
            while(row>=col){
                System.out.print("*"+" ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}*/













































