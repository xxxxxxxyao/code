
//次数出现超过数组一半的数

import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.println(1.0/2);
    }

       /* Scanner sc=new Scanner(System.in);
        ArrayList<Integer> li=new ArrayList<>();

        while(sc.hasNextInt()) {
            li.add(sc.nextInt());

        }

        int len=li.size();
        int[] arr=new int[len];
        for(int i=0;i<arr.length;i++){
            arr[i]=li.get(i);
        }


        Arrays.sort(arr);
        int d=fun(arr);
        System.out.println(d);

    }


    public static int fun(int[] arr){
        int s=(arr.length)/2;
        int f=arr[s-1];
        int d=arr[s];
        int count=0;
        int count1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==f){
                count++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==d){
                count1++;
            }
        }
        if(count>=(arr.length)/2){
            return f;
        }
        if(count1>=(arr.length)/2){
            return d;
        }
        return -1;
    }
    */
}
