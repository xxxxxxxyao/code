class MyList{
    public int usedsize;
    public int[] elem;

    public int PACACITY=10;


    public MyList(){
        this.usedsize=0;
        this.elem=new int[PACACITY];
    }

    //判满
    public boolean isFull(){
        return  this.usedsize==this.elem.length;
    }


    //在pos位置插入元素
    public void add(int pos,int data){
        if(pos<0 || pos>usedsize){
            System.out.println("插入位置不合理");
        }
        for(int i=usedsize-1;i>=pos;i--){
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=data;
        usedsize++;
    }


    //判断是否包含某个元素
    public boolean contains(int tofind){
        for(int i=0; i<usedsize;i++){
            if(this.elem[i]==tofind){
                return true;
            }
        }
        return false;
    }


    //获取pos位置的元素
    public int getpos(int pos){
        if(pos<0 || pos>usedsize-1){
            System.out.println("pos位置不合理");
        }
        return this.elem[pos];
    }


    //查找值返回下标
    public int search(int tofind){
        for(int i=0;i<usedsize;i++){
            if(this.elem[i]==tofind){
                return i;
            }
        }
        return -1;
    }

    //删除第一次出现的关键字toremove
    public void remove(int toremove) {
        int index=search(toremove);
        if(index==-1){
            System.out.println("没有找到");
        }
        for(int i=index;i<usedsize;i++){
            this.elem[i]=this.elem[i+1];
        }
        this.usedsize--;
    }

    //获取顺序表长度
    public int size(){
        return this.usedsize;
    }

    //清空顺序表
    public void clear(){
        this.usedsize=0;
    }

    public void display(){
        for(int i=0;i<usedsize;i++){
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
}


public class Test1 {
    public static void main(String[] args) {
        MyList my = new MyList();
        my.add(0, 1);
        my.add(0,2);
        my.add(0,3);
        my.add(0,4);
        my.display();
        my.remove(4);
        my.remove(3);
        my.display();
    }
}
