package com.glxt.study.spring.annotation.scope;
public class Bar {
	public Bar()
	{
		System.out.println("\t" + toString());
	}
    public void cleanup() {
    	System.out.println("clean");
    }
}