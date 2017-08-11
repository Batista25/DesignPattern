/**
 * 
 */
package com.chen.pattern.Factory;

/**
 * @author ChenShi
 * @date   2017年8月11日下午5:15:31
 */
public class Square implements Shape {

	/* (non-Javadoc)
	 * @see com.chen.pattern.Factory.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("This is a square！");

	}

}
