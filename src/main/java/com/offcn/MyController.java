package com.offcn;

import com.offcn.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class MyController {
    @GetMapping("/indexPage")
    public String indexPage(Model model){
      //  new ModelAndView();
        model.addAttribute("message","hello-thymeleaf");
        System.out.println("============进入了控制层");
        User user = new User();
        user.setId("11111");
        user.setName("lcuy");
        user.setAge(18);
        model.addAttribute("user",user);

        Map map = new HashMap();
        map.put("src1","1.jpg");
        map.put("src2","2.jpg");
        model.addAttribute("src",map);

        User user1 = new User();
        user1.setId("2222");
        user1.setName("lcuy");
        user1.setAge(18);
        User user3 = new User();
        user3.setId("3333");
        user3.setName("lcuy");
        user3.setAge(18);

        List list = new ArrayList();
        list.add(user1);
        list.add(user);
        list.add(user3);
        model.addAttribute("list",list);

        //日期
        Date date = new Date();
        model.addAttribute("date",date);
        double num = 1113.14159267;
        model.addAttribute("price",num);
        String str = "fdsa家乐福的骄傲了看法第三" +
                "范德萨发" +
                "割发代首给分的苏菲的世界拉开距离空间离开过分类的范德萨范德萨 " +
                "时间固定三发第三个范德萨";
        model.addAttribute("str",str);
        return "index";
    }
}
