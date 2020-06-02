package com.example.type.bean;

import java.util.HashMap;
import java.util.Map;

public class Message {
    private Integer code;

    private String status;

    private Map<String, Object> loginData = new HashMap<>();

    public Message add(String key, Object value){
        this.getLoginData().put(key,value);
        return this;
    }

    public static Message success(){
        Message message = new Message();
        message.setCode(100);
        message.setStatus("success");
        return message;
    }

    public static Message error(){
        Message message = new Message();
        message.setCode(200);
        message.setStatus("error");
        return message;
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

    public Map<String, Object> getLoginData() {
        return loginData;
    }

    public void setLoginData(Map<String, Object> loginData) {
        this.loginData = loginData;
    }
}
