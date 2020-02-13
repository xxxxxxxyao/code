package com.school.Main;
import com.school.User.User;
import com.school.operation.Teleoperation;

public class Main {
    public static void main(String[] args) {
        User user=new User();
        user.setTelenumber("123456789");
        user.setName("baibai");
        user.setAddress("hushengdun");
        user.setCode(19902);
        user.setEmail("2238498589@qq.com");
        Teleoperation.insert(user);
    }
}
