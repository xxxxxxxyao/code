public class Test {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            int s=a/b;
            System.out.println(s);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("异常");
        }finally{
            System.out.println("finally");
        }
    }
}
