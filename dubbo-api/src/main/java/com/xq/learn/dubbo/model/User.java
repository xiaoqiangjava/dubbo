package com.xq.learn.dubbo.model;

import java.io.Serializable;

/**
 * 用户类: dubbo服务提供者和服务消费者都需要引用，远程调用时需要通过网络传输，所以需要实现序列化接口
 * @author xiaoqiang
 * @date 2019/10/30 23:22
 */
public class User implements Serializable
{
    private String name;

    private int age;

    private int faceValue;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getFaceValue()
    {
        return faceValue;
    }

    public void setFaceValue(int faceValue)
    {
        this.faceValue = faceValue;
    }
}
