package com.example.swaggerdemo.swagger.entity;

/**
 * @author: create by ggaly
 * @version: v1.0
 * @description: com.example.swaggerdemo.swagger.entity
 * @date:2019/4/20
 **/
public class SysUser {
    private Long id;
    private String name;
    private String mobile;
    private String address;
    private String idCard;

    public static SysUser getInstance(){
        return new SysUser();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}
