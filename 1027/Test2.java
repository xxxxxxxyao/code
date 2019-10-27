 /*class Test2 {
    public int a;
    public static int count;
}

 class Main{
     public static void main(String[] args) {
         Test2  t1=new Test2();
         t1.a++;
         Test2.count++;
         System.out.println(t1.a);
         System.out.println(Test2.count);
         System.out.println("=============");
         Test2 t2=new Test2();
         t2.a++;
         Test2.count++;
         System.out.println(t2.a);
         System.out.println(Test2.count);
     }
}
*/

 class Test2{
     public int a;
     public static int count;

     public static void change(){
         count=100;
         //a=10;      error   不可以访问非静态数据成员
     }
 }

 class  Main{
     public static void main(String[] args) {
         Test2.change();
         System.out.println(Test2.count);

         Test2 t2=new Test2();
         System.out.println(t2.count);
     }
 }