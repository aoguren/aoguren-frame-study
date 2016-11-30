package com.glxt.study.spring.annotation.propertysource;

public class Car
{
	private String name;
	private double price;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return "The car's name: "+ name +", and the price is " + price;
	}
}
