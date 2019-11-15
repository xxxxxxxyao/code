//final 修饰成员变量

class Myclass{
    private final int x;
    private final int y;

    public Myclass(){
        x=0;
        y=0;
    }

    public Myclass(int x,int y){
        this.x=x;
        this.y=y;
    }
}


class Test{
    public static void main(String[] args) {
        Myclass my1 = new Myclass();
        Myclass my2 = new Myclass(3, 4);
    }
}
