//定义动物类
class Animal{
    public String name;

    public Animal(String name){
        this.name=name;
    }

    public void eat(){
        System.out.println(this.name+"Animal:eat");
    }
}

//定义猫的类
class Cat{
    public String name;

    public Cat(String name){
        this.name=name;
    }

    public void eat(){
        System.out.println(this.name+"Cat:eat");
    }
}


//定义鸟的类
class Bird{
    public String name;

    public Bird(String name){
        this.name=name;
    }

    public void eat(){
        System.out.println(this.name+"Bird:eat");
    }

    public void fly(){
        System.out.println(this.name+"Bird:fly");
    }
}


