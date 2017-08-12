/**
 * 
 */
package com.chen.pattern.Singleton;

/**
 * @author ChenShi
 * @date   2017年8月12日下午11:01:22
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton1 singleton1 = Singleton1.getSingleton1();
		Singleton2 singleton2 = Singleton2.getSingleton2();
		Singleton3 singleton3 = Singleton3.getSingleton3();
		singleton1.getName();
		singleton2.getName();
		singleton3.getName();

	}

}
