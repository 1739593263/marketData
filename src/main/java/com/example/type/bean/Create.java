package com.example.type.bean;

import org.springframework.validation.annotation.Validated;

import java.util.HashMap;
import java.util.Map;

public class Create {
    private Integer code;
    private String status;
    private Map<String, Object> created = new HashMap<>();

    public Create saveCreated(String key, Object value){
        this.getCreated().put(key,value);
        return this;
    }

    public static Create success(){
        Create create = new Create();
        create.setCode(100);
        create.setStatus("success");
        return create;
    }

    public static Create fail(){
        Create create = new Create();
        create.setCode(200);
        create.setStatus("fail");
        return create;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String, Object> getCreated() {
        return created;
    }

    public void setCreated(Map<String, Object> created) {
        this.created = created;
    }
}
