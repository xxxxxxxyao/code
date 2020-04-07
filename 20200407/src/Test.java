
//1.末尾为0的个数


import java.util.*;

public class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=n;i>=5;i--){
            int tmp=i;
            while(tmp%5==0){
                count++;
                tmp=tmp/5;
            }
        }

        System.out.println(count);
    }

}


//2.数字逆置

class Main2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        ArrayList<Integer> l=new ArrayList<>();

        while(n!=0){
            l.add(n%10);
            n=n/10;
        }

        while(l.size()!=0){
            System.out.print(l.remove(0));
        }
    }
}