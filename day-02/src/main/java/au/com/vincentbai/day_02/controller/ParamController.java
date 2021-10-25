package au.com.vincentbai.day_02.controller;

import au.com.vincentbai.day_02.bean.Address;
import au.com.vincentbai.day_02.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class ParamController {

    /**
     * 在springMVC獲取客戶端數據的方式：
     * 1. 在處理請求的方法中，加入相對應的形參，保證形參名和傳遞過來的參數名一致，可以自動賦值
     * 2. 如果形參名和傳遞過來的參數名不一致，可以通過 @RequstParam 來指定映射關係
     * 3. defaultValue 可用于分頁和模糊查詢
     *
     * @param name
     * @param password
     * @param age
     * @return
     */
    @RequestMapping(value = "/testParam", method= RequestMethod.POST)
    // @RequestParam(defaultValue) 可以做分頁使用，第一次訪問沒有當前葉，所以可以將 defualtValue設置為 1，之前是用三元運算符解決
    // @RequestParam(defaultValue) 還可以做模糊查詢，儅沒有輸入任何内容時，將 defaultValue = "" 一個空字符串，就相當于查詢所有
    public String testParam(@RequestParam(value="username", required = false, defaultValue = "admin") String name, String password, String age){

        System.out.println("testParam -> username:" + name + ", password: " + password + ", age:" + age);

        return "success";

    }

    /**
     *
     * @RequestHeader 獲取請求頭信息，在用法上和 @RequestParam 一致
     *
     * @param AcceptLanguage
     * @return
     */
    @RequestMapping(value = "/testRequestHeader", method = RequestMethod.POST)
    public String testRequestHeader(@RequestHeader(value = "Accept-Language") String AcceptLanguage){
        System.out.println("testRequestHeader -> AcceptLanguage: " + AcceptLanguage);
        return "success";
    }

    /**
     * @CookieValue 獲取Cookie信息，在使用方法上和 @RequestParam 一樣
     * @param jsessionid
     * @return
     */
    @RequestMapping(value = "/testCookieValue", method=RequestMethod.POST)
    public String testCookieValue(@CookieValue(value="JSESSIONID") String jsessionid){

        System.out.println("testCookieValue -> jsessionid:" + jsessionid);

        return "success";

    }

    /**
     * 可以通過POJO 獲取客戶端數據， 要求POJO中的屬性名和表單元素的name保持一致，并且支持級級聯關係，比如 User 中有個 Address屬性
     *
     * 可以通過設置形參的方式，來獲取 servlet API
     * @param user
     * @return
     */
    @RequestMapping(value = "/testPOJO", method = RequestMethod.POST)
    public String testPOJO(User user, HttpServletRequest req, HttpServletResponse res){

        System.out.println("HttpServletRequest -> username: " + req.getParameter("username"));

        System.out.println("testPOJO -> user: " + user);

        return "success";
    }

    /**
     * SpringMVC 處理請求過程中，有三種方法在作用域中放值，不管使用以下哪種方式，最終都會把Model數據和view數據封裝到一個ModelAndView裏
     * 1. 通過 ModelAndView， 最標准的方式
     * @return
     */
    @RequestMapping(value="/testModelAndView", method = RequestMethod.POST)
    public ModelAndView testModelAndView(){

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("username", "root"); // 往作用域中放值

        modelAndView.setViewName("success"); // 設置視圖名稱，實現頁面跳轉

        return modelAndView;
    }


    /**
     * 2. 通過形參中的 Map 來給作用域中放值
     * @param map
     * @return
     */
    public String testMap(Map<String, Object> map){
        map.put("username", "TestMap");
        return "success";
    }


    /**
     * 3. 通過 Model 來給作用域中放值
     * @param model
     * @return
     */
    public String testModel(Model model){

        model.addAttribute("username","TestModel");

        return "success";

    }



}
