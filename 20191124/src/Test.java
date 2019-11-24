class B{
    public B(){
        func();
    }

    public void func(){
        System.out.println("B.fun()");
    }
}


class D extends B{
    private int num=1;

    @Override
    public void func() {
        System.out.println("D.func()"+num);
    }
}

public class Test{
    public static void main(String[] args) {
        D d=new D();
    }
}





//定义动物类
/*class Animal{
    protected String name;

    public Animal(String name){
        this.name=name;
    }

    public void eat(String food){
        System.out.println(this.name+"animaleat"+food);
    }
}
class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println(this.name+"birdeat"+food);
    }
}

public class Test {

    public static void main(String[] args) {
        Animal animal2 = new Bird("大大");
        animal2.eat("豆子");
    }
}*/

      /*  Bird bird=new Bird("小小");
        feed(bird);
    }

    public static void feed(Animal animal){
        animal.eat("谷子");*/

