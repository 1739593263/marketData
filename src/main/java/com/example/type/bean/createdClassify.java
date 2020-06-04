package com.example.type.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class createdClassify {
    private String[] A = new String[]{"服装","配饰","运动","母婴","家居","建材","办公","食品","美容","数码","汽车用品","包装","机械设备","五金工具","化工橡胶"};
    private String[] Aurl = new String[]{"clothes.svg","accessory.svg","sports.svg","infant.svg","furniture.svg","buildMaterial.svg","office.svg","food.svg","Beauty.svg","electronic.svg","car.svg","wrap.svg","mechanize.svg","metal.svg","chemistry.svg"};

    private String[] B = new String[]{"初级店铺","中级店铺","高级店铺",};
    private String[] Burl = new String[]{"primary.svg","middle.svg","super.svg"};

    private String[] C = new String[]{"公司运营","进口带货"};
    private String[] Curl = new String[]{"company.svg","oversea.svg"};

    public ArrayList<ArrayList> wrap(){
        ArrayList<ArrayList> arrayList = new ArrayList<>();

        // A
        ArrayList a = new ArrayList();
        for(int i=0;i<A.length;i++){
            Map<String, Object> map = new HashMap<>();
            map.put("name",A[i]);
            map.put("url",Aurl[i]);
            a.add(map);
        }

        // B
        ArrayList b = new ArrayList();
        for(int i=0;i<B.length;i++){
            Map<String, Object> map = new HashMap<>();
            map.put("name",B[i]);
            map.put("url",Burl[i]);
            b.add(map);
        }

        // C
        ArrayList c = new ArrayList();
        for(int i=0;i<C.length;i++){
            Map<String, Object> map = new HashMap<>();
            map.put("name",C[i]);
            map.put("url",Curl[i]);
            c.add(map);
        }

        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);
        return arrayList;
    }
}
