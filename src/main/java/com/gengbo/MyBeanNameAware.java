package com.gengbo;

import org.springframework.beans.factory.BeanNameAware;

/**
 * Created  2017/3/15-18:28
 * Author : gengbo
 */
public class MyBeanNameAware implements BeanNameAware {
    public MyBeanNameAware() {
        System.out.println("【MyBeanNameAware构造器】");
    }

    public void setBeanName(String name) {
        System.out.println("【MyBeanNameAware接口】");
    }
}
