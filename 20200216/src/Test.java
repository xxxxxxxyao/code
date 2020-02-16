import java.util.*;


//杨辉三角
public class Test {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> L=new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>();

            for(int j=0;j<=i;j++){
                if(j==0 || i==j){
                    row.add(1);
                }else{
                    row.add(0);
                }
            }
            L.add(row);
        }

        //设置其他位置
        for(int i=2;i<numRows;i++){
            List<Integer> cur=L.get(i);
            List<Integer> pre=L.get(i-1);

            for(int j=1;j<i;j++){
                cur.set(j,pre.get(j)+pre.get(j-1));
            }
        }
        return L;
    }
}
