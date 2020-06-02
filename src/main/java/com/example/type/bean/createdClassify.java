package com.example.type.bean;

import java.util.ArrayList;

public class createdClassify {
    private String[] A = new String[]{"服装","配饰","运动","母婴","家居","建材","办公","食品","美容","数码","汽车用品","包装","机械设备","五金工具","化工橡胶"};
    private String[] B = new String[]{"初级店铺","中级店铺","高级店铺",};
    private String[] C = new String[]{"公司运营","进口带货"};

    public ArrayList<String[]> wrap(){
        ArrayList<String[]> arrayList = new ArrayList<>();
        arrayList.add(A);
        arrayList.add(B);
        arrayList.add(C);
        return arrayList;
    }
}
