package com.gengbo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created  2017/3/15-17:34
 * Author : gengbo
 */
public class MyApplicationContextAware implements ApplicationContextAware {
    public MyApplicationContextAware() {
        System.out.println("【ApplicationContextAware接口构造器】MyApplicationContextAware");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("【ApplicationContextAware接口】调用MyApplicationContextAware的setApplicationContext方法");
    }
}
