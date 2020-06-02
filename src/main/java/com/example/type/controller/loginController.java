package com.example.type.controller;

import com.example.type.bean.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin("http://localhost:8081")
@RequestMapping("login")
public class loginController {

    @RequestMapping("/data")
    @ResponseBody
    public boolean login(@RequestParam("username")String user,
                         @RequestParam("password")String pwd){
        if("123".equals(user)&&"123".equals(pwd)){
            System.out.println("success");
            return true;
        }
        else{
            System.out.println("failure");
            return false;
        }
    }

    @RequestMapping("/action")
    @ResponseBody
    public Message action(@RequestParam("username")String user,
                          @RequestParam("password")String pwd){
        Message message = new Message();
        Map<String, Object> map = new HashMap<>();
        map.put("user",user);
        map.put("pwd",pwd);
        if(user.startsWith("A")&&"123".equals(pwd)){
            return message.success().add("data",map).add("pro","survey");
        }else if (user.startsWith("B")&&"123".equals(pwd)){
            return message.success().add("data",map).add("pro","warehouse");
        }else if (user.startsWith("C")&&"123".equals(pwd)){
            return message.success().add("data",map).add("pro","business");
        }else if (user.startsWith("D")&&"123".equals(pwd)){
            return message.success().add("data",map).add("pro","admin");
        }else{
            Map<String, Object> errors = new HashMap<>();
            if(!user.startsWith("A")&&
                    !user.startsWith("B")&&
                    !user.startsWith("C")&&
                    !user.startsWith("D"))  errors.put("ue","wrong username");
            if(!"123".equals(pwd))  errors.put("pe","wrong password");
            return message.error().add("error",errors);
        }
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "hhhhhasdasdas";
    }
}
