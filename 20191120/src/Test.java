/*class Shape{
    public void draw(){
        //啥都不干
    }
}

class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("⚪");
    }
}

class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("♦");
    }
}

public class Test {
    public static void main(String[] args) {
        Shape shape1=new Cycle();
        Shape shape2=new Rect();
        shape1.draw();
        shape2.draw();
    }
}*/

/*
interface Ishape{
    void draw();
}

class Cycle implements Ishape{
    @Override
    public void draw(){
        System.out.println("⚪");
    }
}

public class Test{
    public static void main(String[] args) {
        Ishape shape=new Cycle();
        shape.draw();
    }
}*/
/*
class Animal{
    protected  String name;

    public Animal(String name){
        this.name=name;
    }
}


interface  Iflying{
    void fly();
}

interface  Irunning{
    void run();
}

interface  Iswimming{
    void swim();
}


class Cat extends Animal implements Irunning{
    public Cat(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name+"running");
    }
}

class Fish extends Animal implements Iswimming{
    public Fish(String name){
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name+"swimming");
    }
}

class Duck extends Animal implements Irunning,Iflying,Iswimming{
    public Duck(String name){
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name+"swimming");
    }
    @Override
    public void run() {
        System.out.println(this.name+"running");
    }
    @Override
    public void fly() {
        System.out.println(this.name+"flying");
    }
}


public class Test{

    public static void walk(Irunning running){
        System.out.println("散步");
        running.run();
    }

    public static void main(String[] args) {
        Cat cat=new Cat("小猫");
        walk(cat);
    }
}*/



