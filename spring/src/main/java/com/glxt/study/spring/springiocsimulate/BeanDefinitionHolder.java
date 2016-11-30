package com.glxt.study.spring.springiocsimulate;

/**
 * Created by LIN NP on 2016/10/28.
 */
public class BeanDefinitionHolder
{
    private String beanName;
    private BeanDefinition beanDefinition;

    public BeanDefinitionHolder(String beanName, BeanDefinition beanDefinition)
    {
        this.beanName = beanName;
        this.beanDefinition = beanDefinition;
    }


    public String getBeanName()
    {
        return beanName;
    }

    public BeanDefinition getBeanDefinition()
    {
        return beanDefinition;
    }
}
