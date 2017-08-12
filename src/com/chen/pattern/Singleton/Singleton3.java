/**
 * 
 */
package com.chen.pattern.Singleton;

/**
 * @author ChenShi
 * @date   2017年8月12日下午11:01:52
 */
public class Singleton3 {
	private static Singleton3 singleton3;
	
	private Singleton3 () {}
	
	public static synchronized Singleton3 getSingleton3() {
		if (singleton3 == null) {
			singleton3 = new Singleton3();
		} 
		return singleton3;
	}
	
	public void getName() {
		System.out.println("单例模式3——懒汉汉模式，synchronized影响性能！");
	}
	
}
