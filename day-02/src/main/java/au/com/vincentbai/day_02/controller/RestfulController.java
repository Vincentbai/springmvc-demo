package au.com.vincentbai.day_02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestfulController {

    @RequestMapping(value = "testRestful/{id}", method = RequestMethod.GET)
    public String testGET(@PathVariable("id")Integer id){
        System.out.println("GET -> id:" + id);
        return "success";
    }

    @RequestMapping(value = "testRestful", method = RequestMethod.POST)
    public String testPOST(){
        System.out.println("POST REQUEST SUCCESS!!!");
        return "success";
    }

    @RequestMapping(value="testRestful", method = RequestMethod.PUT)
    public String testPUT(){
        System.out.println("PUT REQUEST SUCCESS!!!");
        return "success";
//        return "redirect:/view/success.jsp";
    }

    @RequestMapping(value="testRestful/{id}", method = RequestMethod.DELETE)
    public String testDELETE(@PathVariable("id")Integer id){
        System.out.println("DELETE REQUEST SUCCESS!!! ID:" + id);
        return "success";
//        return "redirect:/view/success.jsp";
    }

    @RequestMapping(value = "testAJAX_DELETE", method = RequestMethod.DELETE)
    public String testAJAX_DELETE(Integer id){
        System.out.println("testAJAX_DELETE -> id=" + id);
        return "success";
    }


}
