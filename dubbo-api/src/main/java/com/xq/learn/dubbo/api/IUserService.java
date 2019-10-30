package com.xq.learn.dubbo.api;

import com.xq.learn.dubbo.model.User;
import java.util.List;

/**
 * 用户公共接口类，供服务消费者和服务提供者引用
 * @author xiaoqiang
 * @date 2019/10/30 23:21
 */
public interface IUserService
{
    /**
     * 通过名称查询用户信息
     * @param name 名称
     * @return user用户信息
     */
    User queryByName(String name);

    /**
     * 查询用户列表
     * @return list 用户列表
     */
    List<User> list();
}
