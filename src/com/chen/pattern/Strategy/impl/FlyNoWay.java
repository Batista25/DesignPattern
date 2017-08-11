/**
 * 
 */
package com.chen.pattern.Strategy.impl;

import com.chen.pattern.Strategy.Fly;

/**
 * @author ChenShi
 * @date   2017年8月11日下午3:05:55
 */
public class FlyNoWay implements Fly {

	/* (non-Javadoc)
	 * @see com.chen.pattern.Strategy.Fly#fly()
	 */
	@Override
	public void fly() {
		System.out.println("不能飞行！！");

	}

}
