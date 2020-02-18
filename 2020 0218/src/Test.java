import java.util.Stack;
//栈的应用

//括号的匹配代码
public class Test {
        public boolean isValid(String s) {
            Stack<Character> ss=new Stack();
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);

                //左括号
                if(ch=='(' || ch == '[' || ch=='{'){
                    ss.push(ch);
                }else{
                    //遇到右括号
                    if(ss.empty()){
                        return false;
                    }

                    char chleft=ss.peek();
                    if(chleft=='(' && ch==')' ||
                            chleft=='{' && ch=='}' ||
                            chleft=='[' &&ch==']'){
                        ss.pop();
                    }else{
                        return false;
                    }
                }
            }

            if(!ss.empty()){
                return false;
            }

            return true;
        }
}


