/**
 * 
 */
package com.chen.pattern.Strategy;

import com.chen.pattern.Strategy.impl.FlyWithWings;

/**
 * @author ChenShi
 * @date   2017��8��11������3:13:23
 */
public class BigDuck extends Duck {
	
	public BigDuck(){
		super();
		super.setFly(new FlyWithWings());
		super.setQuack(new BigQuick());
	}

	/* (non-Javadoc)
	 * @see com.chen.pattern.Strategy.Duck#display()
	 */
	@Override
	public void display() {
		System.out.println("��Ѽ�ӣ�����");

	}

}
