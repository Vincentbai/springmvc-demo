package au.com.vincentbai.day_02.controller;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("mvc") // 相當於一個命名空間，歸納總結某些請求路徑
public class TestController {
    /**
     * @RequestMapping 設置請求映射，把請求和控制層中方法設置映射方法
     *
     * 1. value
     *
     * 2. method: RequestMethod.GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE
     *              GET: 查詢  POST： 添加 PUT： 更： DELETE： 刪除
     *
     *              請求方法不一致，會報 HTTP STATUS 405 錯誤
     *
     * 3. params: 用來設置請求參數，請求中必須包含或者不包含某個參數
     *               params = {"username", "username!=Vincent", "!age"}
     *               條件加的越多，範圍越小
     *
     * 4. headers: 請求頭，也是一個約束條件，所發送的請求的請求頭一定要和headers中設置的信息一致
     *
     * @return
     */

    // "test" 和 ”/test“ 作用是一樣的，/表示的是項目下路徑
    @RequestMapping(value = "/test", method = RequestMethod.GET, params = {"username", "username!=Vincent", "!age"})
    public String testGET(){
        System.out.println("TestGET -> Success");
        return "success";
    }

    @RequestMapping(value = "/test", method=RequestMethod.POST)
    public String testPOST(){
        System.out.println("TestPOST -> Success");
        return "success";
    }

    /**
     * @RequestMapping 支持 ant 路徑風格
     *
     * 1. ? ：表示文件名中的一個字符
     * 2. * ：表示文件名中的任意字符
     * 3. **：匹配多層路徑
     *
     * @return
     */
    @RequestMapping(value="/*/ant??/**/testAnt")
    public String testAnt(){
        return "success";
    }

    /**
     * @PathVariable 在鏈接中設置佔位符 PathVarible 路徑變量
     *
     * 以前： localhost:8080/springMVC02/test?id=10001&username=vincent
     * 現在： localhost:8080/springMVC02/testPathVariable/10001/vincent
     *
     * @return
     */
    @RequestMapping("/testPathVariable/{id}/{username}")
    public String testPathVariable(@PathVariable("id")Integer id, @PathVariable("username")String username){

        System.out.println("id: " + id + " , username:" + username);

        return "success";
    }

}
