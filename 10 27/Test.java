class  MyArrayList {             //顺序表
    public int usedSize;
    public int[] elem;

    public final int CAPACITY = 10;

    public MyArrayList() {
        this.usedSize = 0;
        this.elem = new int[CAPACITY];
    }

    private boolean isFull() {
        return this.usedSize == this.elem.length;
    }


    //在pos位置新增元素
    public void add(int pos, int data) {
        if (pos < 0 || pos > usedSize) {
            System.out.println("插入位置不合理");
        }
        for (int i = this.usedSize - 1; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    //判断是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < usedSize - 1; i++) {
            if (elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }


    //获取pos位置的元素
    public int getPos(int pos) {
        if (pos > usedSize - 1) {
            return -1;
        }
        return this.elem[pos];
    }

    //查找值
    public int search(int tofind) {
        if (isFull()) {
            return -1;
        }
        for (int i = 0; i < usedSize ; i++) {
            if (this.elem[i] == tofind) {
                return i;
            }
        }
        return -1;
    }

    //删除第一次出现的关键字toremove
    public void remove(int toremove) {
        int index = search(toremove);
        if (index == -1) {
            System.out.println("没有要删除的数字");
        }
        for (int i = index; i < usedSize; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.usedSize--;
    }

    //获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    //清空顺序表
    public void clear() {
        this.usedSize = 0;
    }

    //打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(elem[i] + " ");
        }
        System.out.println();
    }
}

 public    class Test {
        public static void main(String[] args) {
            MyArrayList myArrayList = new MyArrayList();
            myArrayList.add(0, 1);
            myArrayList.add(0, 2);
            myArrayList.add(0, 3);
            myArrayList.add(1, 4);
            myArrayList.add(0, 5);
            myArrayList.display();//5 3 4 2 1
            myArrayList.remove(5);
            myArrayList.display();
            myArrayList.remove(1);
            myArrayList.display();
            myArrayList.remove(4);
            myArrayList.display();
            System.out.println("==============");
            myArrayList.clear();
            myArrayList.display();
        }
    }
