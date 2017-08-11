/**
 * 
 */
package com.chen.pattern.Strategy.impl;

import com.chen.pattern.Strategy.Fly;

/**
 * @author ChenShi
 * @date   2017年8月11日下午3:03:40
 */
public class FlyWithWings implements Fly {

	/* (non-Javadoc)
	 * @see com.chen.pattern.Strategy.Fly#fly()
	 */
	@Override
	public void fly() {
		System.out.println("用翅膀飞行！");
		
	}
	
}
