/**
 * 
 */
package com.chen.pattern.Factory;

/**
 * @author ChenShi
 * @date   2017��8��11������5:23:25
 */
public class Factory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape circle = shapeFactory.getShape("circle");
		circle.draw();
		shapeFactory.getShape("rectangle").draw();
		shapeFactory.getShape("square").draw();

	}

}
