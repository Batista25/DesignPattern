/**
 * 
 */
package com.chen.pattern.AbstractFactory;

/**
 * @author ChenShi
 * @date   2017年8月11日下午6:38:32
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		Shape circle = shapeFactory.getShape("circle");
		circle.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		Color color = colorFactory.getColor("red");
		color.fill();
		
	}

}
