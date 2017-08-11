/**
 * 
 */
package com.chen.pattern.AbstractFactory;

/**
 * @author ChenShi
 * @date   2017年8月11日下午6:56:15
 */
public class ColorFactory extends AbstractFactory {

	/* (non-Javadoc)
	 * @see com.chen.pattern.AbstractFactory.AbstractFactory#getShape(java.lang.String)
	 */
	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.chen.pattern.AbstractFactory.AbstractFactory#getColor(java.lang.String)
	 */
	@Override
	Color getColor(String color) {
		if (color ==null) {
			return null;
		}
		if (color.equalsIgnoreCase("red")) {
			return new Red();
		}else if (color.equalsIgnoreCase("green")) {
			return new Green();
		}else if (color.equalsIgnoreCase("blue")) {
			return new Blue();
		}
		return null;
	}

}
