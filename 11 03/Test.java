//缸子里一共有50升水。现有15升。每次能挑5升。要挑几次才能挑满
/*public class Test {
    public static void main(String[] args) {
        int i=50;      //缸子里的水
        int now=15;      //现有水
        int ret=i-now;
        for(int time=0;;time++){
            if((ret-5*time)==0){
                System.out.println("需要挑"+time+"次");
                break;
            }
        }
    }
}*/


/*11.使用do-while实现：输出摄氏温度与华氏温度的对照表，要求它从摄氏温度0度到250度，每隔20度为一项，对照表中的条目不超过10条。
        转换关系：华氏温度 = 摄氏温度 * 9 / 5.0 + 32
        提示：	1、循环操作：计算摄氏温度，并输出对照条目
                2、循环条件：条目<=10 && 摄氏温度 <= 250*/
/*public class Test{
    public static void main(String[] args) {
        double h = 0;
        double s = 0;
        int count=1;
        do {
            h =(s*9/5.0)+32;
            System.out.println("摄氏度："+s+"-----"+"华氏度："+h);
            s=s+20;
            count++;
        }while(count<=10 && s<=250);
    }
}*/


//23.循环打印出26个英文字母，并按照通用排列表排列（提示a是97，显示出来4行，每行显示6到7个）
/*public class Test{
    public static void main(String[] args) {
        int count=0;
        for(char i='a';i<='z';i++){
            System.out.print(i+" ");
            count++;
            if((count%7)==0){
                System.out.println();
            }
        }
    }
}*/















