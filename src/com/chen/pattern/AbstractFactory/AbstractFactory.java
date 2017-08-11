/**
 * 
 */
package com.chen.pattern.AbstractFactory;


/**
 * @author ChenShi
 * @date   2017��8��11������6:45:07
 */
public abstract class AbstractFactory {
	abstract Shape getShape(String shape);
	abstract Color getColor(String color);
}
