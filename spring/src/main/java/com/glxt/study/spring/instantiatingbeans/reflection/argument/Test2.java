package com.glxt.study.spring.instantiatingbeans.reflection.argument;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试通过反射调用有参构造函数，生成bean
 * @author LIN NP
 * @version 创建时间：2016年9月14日 上午9:14:37
 */
public class Test2
{
	public static void main(String[] args)
	{
		System.out.println();
		testMethod();
//		System.out.println(car);
	}
	public static void testMethod()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/glxt/study/spring/instantiatingbeans/reflection/argument/car2.xml");
		Car car = context.getBean("car", Car.class);
	}
}
