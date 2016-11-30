package com.glxt.study.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * 1、定义事件
 * @author LIN NP
 * @version 创建时间：2016年10月8日 上午9:43:31
 */
public class EmailEvent extends ApplicationEvent
{
	private String address;
	private String text;
	
	public EmailEvent(Object source)
	{
		super(source);
	}
	
	public EmailEvent(Object source, String address, String text)
	{
		super(source);
		this.address = address;
		this.text = text;
	}
	
	public void print()
	{  
        System.out.println("hello spring event!");  
    }

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getText()
	{
		return text;
	}

	public void setText(String text)
	{
		this.text = text;
	} 

}
