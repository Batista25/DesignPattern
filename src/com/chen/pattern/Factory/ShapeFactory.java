/**
 * 
 */
package com.chen.pattern.Factory;

/**
 * @author ChenShi
 * @date   2017��8��11������5:17:45
 */
public class ShapeFactory {
	//ʹ��getShape ������ȡָ����״���͵Ķ���
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

}
