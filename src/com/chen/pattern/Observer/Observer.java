/**
 * 
 */
package com.chen.pattern.Observer;

/**
 * @author ChenShi
 * @date   2017年8月13日上午12:32:20
 */
public abstract class Observer {
	protected Subject subject;
	
	abstract void update();
}
