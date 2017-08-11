/**
 * 
 */
package com.chen.pattern.AbstractFactory;

/**
 * @author ChenShi
 * @date   2017年8月11日下午5:17:45
 */
public class ShapeFactory extends AbstractFactory{
	//使用getShape 方法获取指定形状类型的队形
	public Shape getShape(String shapeType) {
		if (shapeType ==null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("circle")) {
			return new Circle();
		}else if (shapeType.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}else if (shapeType.equalsIgnoreCase("square")) {
			return new Square();
		}
		return null;		
	}

	/* (non-Javadoc)
	 * @see com.chen.pattern.AbstractFactory.AbstractFactory#getColor(java.lang.String)
	 */
	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
