package com.glxt.study.spring.springiocsimulate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LIN NP on 2016/10/28.
 */
public class PropertyValues
{
    private List<PropertyValue> propertyValues;

    public PropertyValues()
    {
        this.propertyValues = new ArrayList<PropertyValue>();
    }

    public void addPropertyValue(PropertyValue pv)
    {
        propertyValues.add(pv);
    }

    public List<PropertyValue> getPropertyValues()
    {
        return propertyValues;
    }
}
