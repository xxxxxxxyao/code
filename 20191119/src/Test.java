/*
class Animal{
    public String name;

    public Animal(String name){
        this.name=name;
    }

    public void eat(){
        System.out.println(this.name+"Animal eat:()");
    }
}

class Cat extends Animal{
    public String sex;

    public Cat(String name,String sex){
        super(name);
        this.sex=sex;
    }

    @Override
    public void eat() {
        System.out.println(this.name+this.sex+"Cat eat:()");
    }
}

public class Test {
    public static void main(String[] args) {
        Cat cat= new Cat("花花", "女");
        cat.eat();
    }
}
*/


class Test{
    public static void main(String[] args) {
        char a=10;
        char b=20;
        add(a,b);

        float a2=10.5f;
        float b2=12.5f;
        add(a2,b2);

    }

    public static void add(int x,int y){
        System.out.println(x+y);
    }

    public static void add(double x,double y){
        System.out.println(x+y);
    }
}