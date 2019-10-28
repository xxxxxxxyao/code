/*25.	打印出这样的效果图：
        *
      * * *
    * * * * *
  * * * * * * **/

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
      String[][] arr={{" "," "," ","*"," "," "," "},
              {" "," ","*","*","*"," "," "},
              {" ","*","*","*","*","*"," "},
              {"*","*","*","*","*","*","*"}};
       show(arr);

    }
    public static void show(String[][] arr){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(" "+arr[row][col]);
            }
            System.out.println();
        }
    }
}