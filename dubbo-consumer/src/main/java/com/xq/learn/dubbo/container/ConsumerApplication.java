package com.xq.learn.dubbo.container;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author xiaoqiang
 * @date 2019/10/31 0:19
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.xq.learn.dubbo")
public class ConsumerApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
