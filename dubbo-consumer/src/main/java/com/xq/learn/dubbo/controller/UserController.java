package com.xq.learn.dubbo.controller;

import com.xq.learn.dubbo.api.IUserService;
import com.xq.learn.dubbo.model.User;
import java.util.List;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务消费者，远程调用服务提供者接口，是用Reference注入依赖，属性信息跟provider中service注解一致
 * @author xiaoqiang
 * @date 2019/10/31 0:13
 */
@RestController
@RequestMapping("/v1.0/user")
public class UserController
{
    @Reference(version = "1.0", group = "user", loadbalance = "random", timeout = 3000, retries = 3)
    private IUserService userService;

    @RequestMapping(value = "get", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User get(@RequestParam("name") String name)
    {
        return userService.queryByName(name);
    }

    @RequestMapping(value = "list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<User> list()
    {
        return userService.list();
    }
}
