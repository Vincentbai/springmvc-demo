package au.com.vincentbai.day_03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestCharsetFilter {

    @RequestMapping(value="testCharset", method= RequestMethod.POST)
    public String testCharset(String username){
        System.out.println("testCharset -> username:" + username);
        return "success";
    }
}
