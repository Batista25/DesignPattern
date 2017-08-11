/**
 * 
 */
package com.chen.pattern.Strategy;

/**
 * @author ChenShi
 * @date   2017年8月11日上午10:48:46
 */
public class Strategy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Duck duck = new LittleDuck();
		duck.display();
		duck.quack();
		duck.fly();
		System.out.println("*****************");
		Duck duck1 = new BigDuck();
		duck1.display();
		duck1.quack();
		duck1.fly();

	}
	
	

}
