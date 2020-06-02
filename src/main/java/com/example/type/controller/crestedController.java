package com.example.type.controller;

import com.example.type.bean.Create;
import com.example.type.bean.createdClassify;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ResponseBody
@Controller
@RequestMapping("/Created")
@CrossOrigin("http://localhost:8081")
public class crestedController {

    @RequestMapping("/getProduces")
    public Create producesInfo(){
        createdClassify cc = new createdClassify();
        Create create = new Create();
        Map<String, Object> map = new HashMap<>();
        map.put("class",cc.wrap());
        return create.success().saveCreated("produceDatas",map);
    }
}
