package com.example.type.controller;

import com.example.type.bean.Create;
import com.example.type.bean.Produce;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin("http://localhost:8081")
@RequestMapping("check")
public class checkController {

    @RequestMapping("/surUpload")
    @ResponseBody
    public void StoW(@RequestParam("UploadDatas") String list){
        Create create = new Create();

        Map<String, Object> hashMap = new HashMap<>();
        list = list.substring(1,list.length()-1);
        System.out.println(list);
        String[] eles = list.split(",");
        for (String ele: eles){
            String[] s = ele.split(":");
            hashMap.put(s[0],s[1]);
            System.out.println(s[0]+":"+s[1]+"\n");
        }
//        return create.success().saveCreated("dataFromSur",hashMap);
    }

    @RequestMapping("/showData")
    @ResponseBody
    public Create ShowData(){
        Create create = new Create();

//        Map<String, Object> hashMap = new HashMap<>();
        ArrayList<Object> arrayList = new ArrayList<>();
        for(int i=0;i<5;i++){
            Produce produce = new Produce();
            produce.setId(i+1);
            produce.setName("name"+i);
            produce.setAttributeA("A_attribute"+i);
            produce.setAttributeB("B_attribute"+i);
            produce.setAttributeC("C_attribute"+i);
            arrayList.add(produce);
//            hashMap.put("P"+i,produce);
        }
        return create.success().saveCreated("CreatedData",arrayList);
    }
}
