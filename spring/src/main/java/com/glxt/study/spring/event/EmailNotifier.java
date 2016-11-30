package com.glxt.study.spring.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class EmailNotifier
{
	@EventListener
	public void processEmailEvent(EmailEvent emailEvent)
	{
		emailEvent.print();  
        System.out.println("the source is:"+emailEvent.getSource());  
        System.out.println("the address is:"+emailEvent.getAddress());  
        System.out.println("the email's context is:"+emailEvent.getText()); 
	}
	
	public static void main(String[] args)
	{
		ApplicationContext ctx = new AnnotationConfigApplicationContext(EmailNotifier.class);
		EmailEvent event = new EmailEvent("hello","boylmx@163.com","this is a email text!");
		EmailNotifier emailNotifier = new EmailNotifier();
		// 3、发布事件
		ctx.publishEvent(event);
	}
}
