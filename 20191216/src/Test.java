/*
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;

class Book implements Comparable{
    public String name;
    public int price;

    public Book(String name,int price){
        this.name=name;
        this.price=price;
    }

    public int compareTo(Object b){
        Book book=(Book)b;
        return (int)(this.price-book.price);
    }
}

public class Test{
    public static void main(String[] args) {
        List<Book> it=new LinkedList<Book>();
        it.add(new Book("java",12));
        it.add(new Book("hui",14));
        Iterator<Book> iterator=it.iterator();
        Book book1=new Book("java",12);
        while(iterator.hasNext()){
            Book book=iterator.next();
            if(book1.price==book.price)
            System.out.println(book.name);
        }

    }
}*/


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
        Duck cat=new Duck("小");
        walk(cat);
    }
}