package com.glxt.study.spring.instantiatingbeans.factorymethod.staticmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试通过静态工厂方法，生成bean
 * @author LIN NP
 * @version 创建时间：2016年9月14日 上午9:14:37
 */
public class Test
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/glxt/study/spring/instantiatingbeans/factorymethod/staticmethod/car.xml");
		Car car = context.getBean("bmwCar", Car.class);
		System.out.println(car);
		
		Car car2 = context.getBean("audiCar", Car.class);
		System.out.println(car2);
	}
}
