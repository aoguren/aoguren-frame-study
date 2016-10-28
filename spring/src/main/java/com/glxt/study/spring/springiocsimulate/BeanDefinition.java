package com.glxt.study.spring.springiocsimulate;

/**
 * Created by LIN NP on 2016/10/28.
 */
public class BeanDefinition
{
    private PropertyValues propertyValues;
    private String beanClassName;
    private Class beanClass;

    public PropertyValues getPropertyValues()
    {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues)
    {
        this.propertyValues = propertyValues;
    }

    public String getBeanClassName()
    {
        return beanClassName;
    }

    public void setBeanClassName(String beanClassName)
    {
        this.beanClassName = beanClassName;
        // 根据类名设置类
        try
        {
            this.beanClass = Class.forName(beanClassName);
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public Class getBeanClass()
    {
        return beanClass;
    }


}
