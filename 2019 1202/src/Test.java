public class Test{

    public static void main(String[] args) {
        String str="helloword";
        //String转byte[]数组
        byte[] data=str.getBytes();
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();

        //byte[] 转String
        System.out.println(new String(data));
    }
    /*public static void main(String[] args) {
       String arr="abcde";
        char[] arr1=arr.toCharArray();
        for (char x:arr1) {
            System.out.print(x+" ");
        }
    }*/
}



/*public class Test {
    public static void main(String[] args) {

        char[] arr={'a','b','c','d'};
        //将整体字符数组变为字符串
        String arr1=new String(arr);
        System.out.println(arr1);
        //将部分字符数组内容变为字符串
        String arr2=new String(arr,1,2);
        System.out.println(arr2);
    }
}*/
