/**
 * 
 */
package com.chen.pattern.AbstractFactory;

/**
 * @author ChenShi
 * @date   2017年8月11日下午6:52:19
 */
public class Blue implements Color {

	/* (non-Javadoc)
	 * @see com.chen.pattern.AbstractFactory.Color#fill()
	 */
	@Override
	public void fill() {
		System.out.println("填充蓝色");

	}

}
