package com.glxt.study.spring.springiocsimulate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by LIN NP on 2016/10/28.
 */
public class BeanFactoryTest
{

    @Test
    public void testIoc()
    {
        // 1. 创建beanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2. 注册bean
        BeanDefinition bd = new BeanDefinition();
        bd.setBeanClassName("com.glxt.study.spring.springiocsimulate.Hello");

        BeanDefinitionHolder bdh = new BeanDefinitionHolder("hello", bd);
        beanFactory.registerBeanDefinition("hello", bdh.getBeanDefinition());

        // 3. 获取bean
        Hello hello = (Hello) beanFactory.getBean("hello");
        assertEquals("hello", hello.sayHello());
    }

    @Test
    public void testIoCProperty() {
        // 1. 创建beanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2. 注册bean
        BeanDefinition bd = new BeanDefinition();
        bd.setBeanClassName("com.glxt.study.spring.springiocsimulate.Hello");

        // 注入Property
        PropertyValues pvs = new PropertyValues();
        pvs.addPropertyValue(new PropertyValue("msg", "Hello IoC Property!"));
        bd.setPropertyValues(pvs);

        BeanDefinitionHolder bdh = new BeanDefinitionHolder("helloWorld", bd);
        beanFactory.registerBeanDefinition(bdh.getBeanName(), bdh.getBeanDefinition());

        // 3. 获取bean
        Hello hello = (Hello) beanFactory.getBean("helloWorld");
        assertEquals("Hello IoC Property!", hello.sayHello());
    }

}
