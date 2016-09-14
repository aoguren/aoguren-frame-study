package com.glxt.study.spring.instantiatingbeans.factorymethod.nonstaticmethod;

import java.util.HashMap;
import java.util.Map;

public class CarFactory
{
	private Map<Integer, Car>	map	= new HashMap<Integer, Car>();

	public void setMap(Map<Integer, Car> map)
	{
		this.map = map;
	}

	public CarFactory()
	{
	}

	public Car getCar(int id)
	{
		return map.get(id);
	}
}
