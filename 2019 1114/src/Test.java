class Animal{
   public  String name;

   static {
       System.out.println("Animal static");
   }

    {
        System.out.println("Animal instantiation");
    }

    public Animal(String name){
        this.name=name;
    }

    public void eat(){
        System.out.println(this.name+"eat");
    }
}

class Bird extends Animal{
    static {
        System.out.println("Bird static");
    }
    {
        System.out.println("Bird instantiation");
    }
    public Bird(String name) {
        super(name);
    }

        public void fly(){
            System.out.println(this.name+"fly");
        }
}

public class Test{
    public static void main(String[] args) {
        Bird bird=new Bird("小小");
        bird.eat();
        bird.fly();
    }
}


