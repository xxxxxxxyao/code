/*
class student{
    public String name;
    public int age;

    public student(String name,int age){
        this.age=age;
        this.name=name;
    }

    public void show(){
        System.out.println(this.age+" "+this.name);
    }
}

class Under extends student{
    public String degree;

    public Under(String name,int age,String degree){
        super(name,age);
        this.degree=degree;
    }

    public void show(){
        System.out.println(this.age+this.degree+this.name);
    }
}

public class Test {
    public static void main(String[] args) {
        student stu = new student("xixi", 12);
        stu.show();
        Under stu2=new Under("cici",13,"111");
        stu2.show();
    }
}*/


abstract class Shape{
    abstract double area();
}

class Square extends Shape{
    public int x;
    public int y;

    public Square(int x,int y){
        this.x=x;
        this.y=y;
    }
    public double area(){
        return x*y;
    }

    public void sun(){
        System.out.println("sss");
    }
}
class Circle extends Shape{
    public int x;
    public int y;

    public Circle(int x){
        this.x=x;
    }
    public double area(){
        return 3.14*x*x;
    }
}


public class Test{
    public static void main(String[] args) {
        Square sh=new Square(2,3);
        double s=sh.area();
        sh.sun();
        System.out.println(s);
        Circle sh2=new Circle(2);
        double h=sh2.area();
        System.out.println(h);
    }
}

