package com.gengbo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public MyBeanFactoryPostProcessor() {
        super();
        System.out.println("【BeanFactoryPostProcessor接口构造器】MyBeanFactoryPostProcessor");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
            throws BeansException {
        System.out
                .println("【BeanFactoryPostProcessor接口】调用postProcessBeanFactory方法");
        BeanDefinition bd = arg0.getBeanDefinition("person-1");
        bd.getPropertyValues().addPropertyValue("phone", "110");
    }

}