import java.net.PasswordAuthentication;
class UserError extends Exception{
    public UserError(String message){
        super(message);
    }
}

class PasswordError extends Exception{
    public PasswordError(String message){
        super(message);
    }
}


public class Test {

    /*public static void main(String[] args) {
        try{
            login("admin","123456");
        }catch( UserError userError){
            userError.printStackTrace();
        }catch(PasswordError passwordError ){
            passwordError.printStackTrace();
        }
    }

    public static void login(String username,String password)throws UserError,PasswordError{
        if(!Test.username.equals(username)){
            throw new  UserError("用户名错误");
        }
        if(!Test.password.equals(password)){
            throw new  PasswordError("密码错误");
        }
        System.out.println("登录成功");
    }*/

   /* public static void main(String[] args) {
        System.out.println(divide(10,0));
    }

    public static int divide(int x,int y)throws  ArithmeticException{
        if(y==0){
            throw new ArithmeticException("抛出除 0 异常");
        }
        return x/y;
    }*/
  /*  public static int func() {
        try {
            int a = 10/0;
            return 88;
        }catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("算术异常");
            return 8;
        }finally {
            //return 9;
        }
    }
    public static void main(String[] args) {
            int ret = func();
            System.out.println(ret);
            System.out.println("after");
    }*/
}
