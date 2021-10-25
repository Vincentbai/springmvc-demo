package au.com.vincentbai.day_01.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    /**
     * 假設： localhost:8080/springMVC01/hello
     */
    @RequestMapping(value = "hello")
    public String hello(){
        System.out.println("hello -> Success");
        return "success"; // 返回視圖名稱
    }

    @RequestMapping("test")
    public String test(){
        System.out.println("test -> Success");
        return "success";
    }

    @RequestMapping("login")
    public String login(String username, String password){
        System.out.println("login -> username: " + username + " ; password: " + password);
        return "success";
    }


}
