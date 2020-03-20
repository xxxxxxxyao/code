
import java.util.Arrays;

//自己实现优先级队列
//构建堆用向下调整，插入堆之后进行调整用向上调整
class MyPriority{
    private int[] array;
    int size=0;    //表示有效元素的个数


    public MyPriority(){
        array=new int[11];   //默认大小

    }


    public MyPriority(int capacity){
        if(capacity<1){
            capacity=11;
        }

        array=new int[capacity];
    }

    public MyPriority(int[] arr){
        array=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            array[i]=arr[i];
        }

        size=array.length;
        //将array中的元素进行调整，先找其倒数第一个非叶子节点
        //前提是不知道左右子树是大顶堆还是小顶堆
        int lastleaf=(arr.length-2)>>1;
        for(int root=lastleaf;root>=0;root--){
            shiftdown(root);
        }
    }


    //向下调整(左右子树已经是小堆的前提下用的向下调整)
    //调整之前一定要保证parent的左右子树已经满足小堆的性质
    private void shiftdown(int parent){
        //如果要检测parent是否满足小堆性质，只需要使用parent与其孩子进行比较


        //使用parent标记parent的较小的孩子
        //默认情况下先让其标记左孩子，因为孩子可能有左没有右
        int child=parent*2+1;
        int size=array.length;
        while(child<size) {

            //找parent中较小的孩子
            if (child+1<size && array[child + 1] < array[child]) {
                child = child + 1;
            }


            //检测双亲是否比较小的孩子大
            if (array[parent] > array[child]) {
                //孩子小于双亲，不满足小堆的性质
                //将parent和child进行交换
                swap(parent, child);

                //parent较大的元的向下移动可能会导致子树不满足堆的性质
                parent = child;
                child = parent * 2 + 1;

            } else {
                return;
            }
        }
    }


    private void shiftup(int child){
        int parent=(child-1)>>1;
        while(child!=0){
            if(array[child]<array[parent]){
                swap(child,parent);

                child=parent;
                parent=(child-1)>>1;
            }else{
                return;
            }
        }
    }

    private void swap(int parent,int child){
        int tmp=array[parent];
        array[parent]=array[child];
        array[child]=tmp;
    }


    //查看堆顶元素
    public int peek(){
        //标准库中，如果优先级队列是空，无法获取堆顶元素，因此返回null
        return array[0];
    }


    public boolean offer(int x){
        //1.先将元素尾插到数组中
        //2.检测是否破坏了堆的性质（将新插入的孩子和双亲进行比较）

        if(size>=array.length){
            grow();
        }
        array[size++]=x;
        shiftup(size-1);
        return true;

    }

    //扩容
    private void grow() {
            int oldcapacity = array.length;

            int newcapacity = oldcapacity + ((oldcapacity < 64) ? (oldcapacity + 2) : (oldcapacity >> 1));
            array = Arrays.copyOf(array, newcapacity);
    }

    public int poll(){
        //删除最小的元素
        int ret=array[0];
        swap(0,size-1);
        size--;
        shiftdown(0);
        return ret;
    }

    public int size(){
        return size;
    }

    public void clear(){
        size=0;
    }

    public boolean isEmpty(){
        return size==0;
    }



    public static void main(String[] args) {
        //int array[]={5,3,7,1,4,6,8,0,2};

        MyPriority my=new MyPriority(3);
        my.offer(9);
        my.offer(4);
        my.offer(1);
        my.offer(6);
        System.out.println(my.peek());
        System.out.println(my.size());

    }
}