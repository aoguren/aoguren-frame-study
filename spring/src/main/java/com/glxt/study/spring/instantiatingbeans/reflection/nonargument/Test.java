package com.glxt.study.spring.instantiatingbeans.reflection.nonargument;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 测试通过反射调用无参构造函数，生成bean
 * @author LIN NP
 * @version 创建时间：2016年9月14日 上午9:14:37
 */
public class Test
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/glxt/study/spring/instantiatingbeans/reflection/nonargument/car.xml");
		Car car = context.getBean("car", Car.class);
		System.out.println(car);
	}
}
