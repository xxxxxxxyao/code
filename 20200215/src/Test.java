
import java.util.*;

/*public class Test{
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();

        c.add("i");
        c.add("love");
        c.add("you");
        c.add("lala");
        System.out.println(c.size());
    }

    /*public static void main(String[] args) {
        Map<String,String> m=new HashMap<>();
        m.put("0","java");
        m.put("1","c");
        for(Map.Entry<String,String> e: m.entrySet()){
            System.out.println(e);
        }
    }
}*/


//模拟实现List,下列代码只能放整型
class MyArrayList{

    public MyArrayList(int capacity){
        array=new int[capacity];
        size=0;
        this.capacity=capacity;
    }

    int[] array;
    int capacity;   //空间总大小
    int size;       //空间存储有效元素个数


    void add(int e){
        array[size++]=e;
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return 0==size;
    }
}

//改造上述代码,可以存放任意类型
class MyArrayList2{

    public MyArrayList2(int capacity){
        array=new Object[capacity];
        size=0;
        this.capacity=capacity;
    }

    Object[] array;
    int capacity;   //空间总大小
    int size;       //空间存储有效元素个数


    void add(Object e){
        array[size++]=e;
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return 0==size;
    }
}


//泛型类,实际类型为E，具体是什么类型实例化的时候才知道
class MyArrayList3<E>{       //可以进行类型检测

    public MyArrayList3(int capacity){
        array=(E[])new Object[capacity];
        size=0;
        this.capacity=capacity;
    }

    E[] array;
    int capacity;   //空间总大小
    int size;       //空间存储有效元素个数


    void add(E e){
        array[size++]=e;
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return 0 == size;
    }
}


public class Test{
    public static void main(String[] args) {
        MyArrayList3<String> li=new MyArrayList3<>(10);
        MyArrayList3<Short> li2=new MyArrayList3<>(10);
        System.out.println(li.getClass());
        System.out.println(li2.getClass());
    }
}