/**
 * 
 */
package com.chen.pattern.Strategy;

/**
 * @author ChenShi
 * @date   2017年8月11日下午3:31:31
 */
public class SmallQuack implements Quack {

	/* (non-Javadoc)
	 * @see com.chen.pattern.Strategy.Quack#quack()
	 */
	@Override
	public void quack() {
		System.out.println("小声嘎#嘎#嘎#");

	}

}
