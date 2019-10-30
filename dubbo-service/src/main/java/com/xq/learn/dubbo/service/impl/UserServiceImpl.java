package com.xq.learn.dubbo.service.impl;

import com.xq.learn.dubbo.api.IUserService;
import com.xq.learn.dubbo.model.User;
import java.util.Collections;
import java.util.List;
import org.apache.dubbo.config.annotation.Service;

/**
 * 服务提供者，需要实现指定的接口类，对外提供服务
 * @Service 注解是dubbo下面的service，不是spring的注解，该注解的作用是将当前类纳入spring管理，并
 * 将接口以服务的形式注册到注册中心，供消费者调用
 * Service注解属性：
 * version: 服务暴露的版本号，当接口不兼容时需要指定
 * group：服务分组，当一个接口有多个实现，可以使用group来区分
 * timeout: 服务远程调用超时时间，单位为毫秒
 * retries： 远程调用重试次数，不包括第一次调用
 * loadbalance： 负载均衡策略，默认是random随机调用，可选值：random，roundrobin, leastactive,随机，轮询，最少活跃调用
 * 建议在服务提供者一方多配置consumer方属性，防止只是用服务提供者属性，这对provider是不可控的。
 *
 * @author xiaoqiang
 * @date 2019/10/30 23:50
 */
@Service(version = "1.0", group = "user", timeout = 3000, retries = 3, loadbalance = "roundrobin")
public class UserServiceImpl implements IUserService
{
    @Override
    public User queryByName(String name)
    {
        User user = new User();
        user.setAge(28);
        user.setFaceValue(100);
        user.setName("wenwen");

        return user;
    }

    @Override
    public List<User> list()
    {
        User user = new User();
        user.setAge(28);
        user.setFaceValue(99);
        user.setName("xiaoqiang");

        return Collections.singletonList(user);
    }
}
