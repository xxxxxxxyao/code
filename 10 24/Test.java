public class Test{

    public  static int weeks(int day){
        if(day%7==0){
            return day/7;
        }else
            return day/7+1;
    }

    public  static int  last(int day) {
        if (day % 7 == 0) {
            return 0;
        } else
            return 7 - (day % 7);
    }

    public static void main(String[] args) {
        int day=46;
        int a=weeks(day);
        System.out.println("周数为第"+a+"周");
        int b=last(day);
        System.out.println("剩余天数为："+b);
    }
}