/**
 * 
 */
package com.chen.pattern.Observer;

/**
 * @author ChenShi
 * @date   2017��8��13������12:32:20
 */
public abstract class Observer {
	protected Subject subject;
	
	abstract void update();
}
