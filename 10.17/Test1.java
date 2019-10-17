public class Test1 {
    public static int fun(int n){     //非递归方法
        int sum=0;
        int a=1;
        int b=1;
        if(n==1 || n==2){
            return 1;
        }
        for(int i=3;i<=n;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        return sum;
    }
    public static void main(String[] args) {
         int a=fun(7);
        System.out.println(a);
    }
    /*public static int fun(int n){          //递归方法
       if(n==1 || n==2){
           return 1;
       }else{
           return fun(n-1)+fun(n-2);
       }
    }

    public static void main(String[] args) {
       int b= fun(7);
        System.out.println(b);
    }*/
}
