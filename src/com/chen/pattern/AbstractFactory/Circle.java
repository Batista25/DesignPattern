/**
 * 
 */
package com.chen.pattern.AbstractFactory;

/**
 * @author ChenShi
 * @date   2017年8月11日下午5:16:22
 */
public class Circle implements Shape {

	/* (non-Javadoc)
	 * @see com.chen.pattern.Factory.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("This is a circle1");

	}

}
