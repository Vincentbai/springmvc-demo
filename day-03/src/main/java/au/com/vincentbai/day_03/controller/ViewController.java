package au.com.vincentbai.day_03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    /**
     *
     * View 的类型
     * 1. InternalResourceView 转发视图
     * 2. JstlView extends InternalResourceView 支持视图中的JSTL 转发视图
     * 3. RedirectView：重定向视图
     *
     * View 的作用：处理模型数据，实现页面跳转（转发，重定向）
     *
     * @return
     */
    @RequestMapping("/testView")
    public String testView(){

        return "success";

    }

    @RequestMapping("/testRedirectView")
    public String testRedirectView(){
        return "redirect:/index.jsp";
    }

}
