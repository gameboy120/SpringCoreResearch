package com.gengbo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * Created  2017/3/15-18:29
 * Author : gengbo
 */
public class MyBeanFactoryAware implements BeanFactoryAware {
    public MyBeanFactoryAware() {
        System.out.println("【MyBeanFactoryAware接口构造器】");
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("【MyBeanFactoryAware接口】");
    }
}
