package com.glxt.study.spring.annotation.bean;
public class Bar {
	public Bar()
	{
		System.out.println("Bar Constructor");
	}
    public void cleanup() {
    	System.out.println("clean");
    }
}