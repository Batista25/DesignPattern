/**
 * 
 */
package com.chen.pattern.Strategy;

import com.chen.pattern.Strategy.impl.FlyNoWay;

/**
 * @author ChenShi
 * @date   2017年8月11日下午3:09:28
 */
public class LittleDuck extends Duck {

	public LittleDuck() {
		super();
		super.setFly(new FlyNoWay());
		super.setQuack(new SmallQuack());
	}
	
	/* (non-Javadoc)
	 * @see com.chen.pattern.Strategy.Duck#display()
	 */
	@Override
	public void display() {
		System.out.println("小鸭子！！！");

	}

}
