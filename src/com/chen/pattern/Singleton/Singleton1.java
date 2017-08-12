/**
 * 
 */
package com.chen.pattern.Singleton;

/**
 * @author ChenShi
 * @date   2017年8月12日下午11:01:52
 */
public class Singleton1 {
	private static Singleton1 singleton1 = new Singleton1();
	private Singleton1 () {
		
	}
	public static Singleton1 getSingleton1() {
		return singleton1;
	}
	public void getName() {
		System.out.println("单例模式1——饿汉模式");
	}
	
}
