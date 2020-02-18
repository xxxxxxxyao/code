//判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        String s="asd";
        String s2="addfg";
        boolean b=canConstruct(s,s2);
        System.out.println(b);
    }
   public static boolean canConstruct(String ransomNote, String magazine) {
        char[] c1=ransomNote.toCharArray();
        char[] c2=magazine.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        int i=0;
        int j=0;
        while(i<c1.length && j<c2.length){
            if(c1[i] == c2[j]){
                i++;
                j++;
            }else{
                if(c2[j]>c1[i]){
                    return false;
                }
                j++;
            }
        }
        if(i==c1.length){
            return true;
        }else{
            return false;
        }
    }
}