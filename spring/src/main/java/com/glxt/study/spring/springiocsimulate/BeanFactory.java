package com.glxt.study.spring.springiocsimulate;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by LIN NP on 2016/10/28.
 */
public class BeanFactory
{
    // 用于存储bean的单例实体
    private final Map<String, Object> singletonObjects = new ConcurrentHashMap<String, Object>();
    // 用于存储beanDefinition
    private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    // 注册BeanDefinition
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition)
    {
        beanDefinitionMap.put(name, beanDefinition);
    }
    
    // 获取bean，如果不存在则创建
    public Object getBean(String beanName)
    {
        Object bean = getSingleton(beanName);
        if (null == bean)
        {
            try
            {
                bean = doCreateBean(beanName, beanDefinitionMap.get(beanName));
            } catch (Exception e)
            {
                e.printStackTrace();
            }
            singletonObjects.put(beanName,bean);
        }
        return bean;
    }


    private Object doCreateBean(String beanName, BeanDefinition beanDefinition) throws Exception
    {
        Object bean = createBeanInstance(beanDefinition);
        applyPropertyValues(bean, beanDefinition);
        return bean;
    }

    private void applyPropertyValues(Object bean, BeanDefinition beanDefinition) throws Exception
    {
        PropertyValues pvs = beanDefinition.getPropertyValues();
        if (pvs != null)
        {
            for (PropertyValue pv : pvs.getPropertyValues())
            {
                Field field = bean.getClass().getDeclaredField(pv.getName());
                field.setAccessible(true);
                field.set(bean, pv.getValue());
            }
        }
    }

    private Object createBeanInstance(BeanDefinition beanDefinition) throws Exception
    {
        return beanDefinition.getBeanClass().newInstance();
    }

    private Object getSingleton(String beanName)
    {
        return singletonObjects.get(beanName);
    }
}
