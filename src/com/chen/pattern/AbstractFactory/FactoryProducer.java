/**
 * 
 */
package com.chen.pattern.AbstractFactory;

/**
 * @author ChenShi
 * @date   2017年8月11日下午6:58:51
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("shape")) {
			return new ShapeFactory();
		} else if(choice.equalsIgnoreCase("color")){
			return new ColorFactory();
		}
		return null;
	}
}
