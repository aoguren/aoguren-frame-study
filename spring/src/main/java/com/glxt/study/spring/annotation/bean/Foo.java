package com.glxt.study.spring.annotation.bean;
public class Foo {
	public Foo()
	{
		System.out.println("Foo Constructor");
	}
    public void init() {
    	System.out.println("init");
    }
}