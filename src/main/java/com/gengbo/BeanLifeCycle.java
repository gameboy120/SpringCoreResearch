package com.gengbo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.misc.Signal;

import java.util.concurrent.TimeUnit;

public class BeanLifeCycle {

    public static void main(String[] args) {

        System.out.println("现在开始初始化容器");
        
        ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("容器初始化成功");    
        //得到Preson，并使用
        Person person = factory.getBean("person-1",Person.class);
        System.out.println(person);
        
        System.out.println("现在开始关闭容器！");
        ((ClassPathXmlApplicationContext)factory).registerShutdownHook();

        Signal.handle(new Signal("USR2"), signal -> {
            System.out.println("killed usr2");
            Runtime.getRuntime().exit(0);
        });
        while (true) {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}