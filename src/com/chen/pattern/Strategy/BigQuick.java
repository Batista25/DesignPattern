/**
 * 
 */
package com.chen.pattern.Strategy;

/**
 * @author ChenShi
 * @date   2017年8月11日下午3:30:32
 */
public class BigQuick implements Quack {

	/* (non-Javadoc)
	 * @see com.chen.pattern.Strategy.Quack#quack()
	 */
	@Override
	public void quack() {
		System.out.println("大声嘎嘎叫~~~~~");

	}

}
