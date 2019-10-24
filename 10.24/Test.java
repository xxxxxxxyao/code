1、编写一个类Calculator，有两个属性num1，num2，这两个数据的值，不能在定义的同时初始化，最后实现加减乘除四种运算. 
/*class Calculator {
    int num1;
    int num2;

    public Calculator(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public int add(){
        return num1+num2;
    }

    public int sub(){
        return num1-num2;
    }

    public int mul(){
        return num1*num2;
    }

    public int div(){
        return num1/num2;
    }
}

 public class Test{
    public static void main(String[] args) {
        Calculator cal=new Calculator(10,20);
        System.out.println(cal.add());
        System.out.println(cal.sub());
        System.out.println(cal.mul());
        System.out.println(cal.div());
    }
        }*/


2.设计一个包含多个构造函数的类，并分别用这些构造函数来进行实例化对象。 
		
		/*
class Student{
    String name;
    int age;

    public Student(){
        this.name="里斯";
        this.age=12;
    }

    public Student(String name){
        this.name=name;
    }

    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void show(){
        System.out.println("name: "+name+" "+"age:"+age);
    }

}



public class Test{
    public static void main(String[] args) {

        Student stu = new Student();
        stu.show();
        Student stu1 = new Student("张三");
        stu1.show();
        Student stu2 = new Student("王五", 17);
        stu2.show();
    }
}
*/

3、实现交换两个变量的值。要求：需要交换实参的值。 
class Change{
    int a;
    int b;

    public Change(int a,int b){
        this.a=a;
        this.b=b;
    }

    public void change(){
        int tmp=a;
        a=b;
        b=tmp;
    }

    public void show(){
        System.out.println("a="+a+" "+"b="+b);
    }
}

public class Test{
    public static void main(String[] args) {
        Change ch=new Change(20,90);
        ch.change();
        ch.show();
    }
}