/**
 * 
 */
package com.chen.pattern.Strategy.impl;

import com.chen.pattern.Strategy.Fly;

/**
 * @author ChenShi
 * @date   2017��8��11������3:03:40
 */
public class FlyWithWings implements Fly {

	/* (non-Javadoc)
	 * @see com.chen.pattern.Strategy.Fly#fly()
	 */
	@Override
	public void fly() {
		System.out.println("�ó����У�");
		
	}
	
}
