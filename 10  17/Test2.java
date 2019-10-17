public class Test2 {
    public static int forgJump(int n){
        if(n==1){
            return 1;
        }if(n==2){
            return 2;
        }
            return forgJump(n-1)+forgJump(n-2);
    }
    public static void main(String[] args) {
        int a=forgJump(3);
        System.out.println(a);
    }
}
