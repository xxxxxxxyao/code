//顺序表

class MyList{
    public int usedsize;
    public int[] elem;

    public final int CAPACITY=10;

    public MyList(){
        this.usedsize=0;
        this.elem=new int[CAPACITY];
    }

    public boolean isfull(){
        return this.usedsize==this.elem.length;
    }

    public void add(int pos,int data){
        if(pos<0 || pos>usedsize){
            System.out.println("插入位置异常");
        }
        for(int i=usedsize-1;i>=pos;i--){
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=data;
        usedsize++;
    }


    public boolean contains(int tofind){
        for(int i=0;i<usedsize;i++){
            if(this.elem[i]==tofind){
                return true;
            }
        }
        return false;
    }


    public int search(int tofind){
        for (int i = 0; i <usedsize ; i++) {
            if(this.elem[i]==tofind){
                return i;
            }
        }
        return -1;
    }


    public int getpos(int pos){
        if(pos<0 || pos>usedsize-1){
            return -1;
        }
        return this.elem[pos];
    }


    public void remove(int remove){
        int index=search(remove);
        if(index==-1){
            System.out.println("无该元素");
        }
        for(int i=index;i<usedsize-1;i++){
            this.elem[i]=this.elem[i+1];
        }
        usedsize--;
    }


    public int size(){
        return this.usedsize;
    }

    public void clear(){
        this.usedsize=0;
    }

    public void display(){
        for(int i=0; i<usedsize;i++){
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
}

public class Test {
    public static void main(String[] args) {
        MyList my=new MyList();
        my.add(0,1);
        my.add(0,2);
        my.add(0,3);
        my.add(0,4);
        my.display();
        System.out.println("---------");
        my.remove(4);
        my.remove(3);
        my.display();
        System.out.println("---------");
        my.clear();
        my.display();
    }
}
