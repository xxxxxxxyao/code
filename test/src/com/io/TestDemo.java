package com.io;

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID=1L;
    private String name;
    private int age;
    private String sex;

    //被transient修饰的变量，不能被序列化
    transient private int stuId;
    //static修饰的变量不能被序列化
    private static int count=111;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    @Override
    public String toString() {
        return "Serializable{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", stuId=" + stuId +
                ", count=" + count +
                '}';
    }
}

public class TestDemo{
    public static void main(String[] args) throws Exception{
        serializePerson();
        Person person=deserializePerson();
        System.out.println(person);
    }


    //序列化操作
    public static void serializePerson() throws IOException{
        Person person=new Person();
        person.setName("dudu");
        person.setAge(12);
        person.setSex("女");
        person.setStuId(199);

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("E:\\icons\\person.txt")));
        oos.writeObject(person);
        System.out.println("person序列化成功！");
        oos.close();
    }


    //反序列化操作
    public static Person deserializePerson() throws Exception{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("E:\\icons\\person.txt")));
        Person person=(Person)ois.readObject();
        System.out.println("person对象反序列化成功！");
        ois.close();
        return person;
    }
}
