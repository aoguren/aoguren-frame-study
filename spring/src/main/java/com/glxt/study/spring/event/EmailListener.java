package com.glxt.study.spring.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * 2、定义监听器
 * @author LIN NP
 * @version 创建时间：2016年10月8日 上午9:44:08
 */
@Configuration
public class EmailListener implements ApplicationListener<EmailEvent>
{

	public void onApplicationEvent(EmailEvent emailEvent)
	{
		emailEvent.print();  
        System.out.println("the source is:"+emailEvent.getSource());  
        System.out.println("the address is:"+emailEvent.getAddress());  
        System.out.println("the email's context is:"+emailEvent.getText()); 
	}
	
	public static void main(String[] args)
	{
		ApplicationContext ctx = new AnnotationConfigApplicationContext(EmailListener.class);
		EmailEvent event = new EmailEvent("hello","boylmx@163.com","this is a email text!");
		EmailListener emailListener = new EmailListener();
		// 3、发布事件
		ctx.publishEvent(event);
	}
}
