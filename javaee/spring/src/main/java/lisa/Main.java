package lisa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applications.xml");
        //获取到bean容器中的对象
       /* Duck duck1=(Duck)context.getBean("duck1");
        System.out.println(duck1);
        Duck duck2=(Duck)context.getBean("duck2");
        System.out.println(duck2);
        DuckShop shop=(DuckShop) context.getBean("duckShop");
        System.out.println(shop);
        Person p1=(Person) context.getBean("p1");
       System.out.println(p1);*/
    }
}
