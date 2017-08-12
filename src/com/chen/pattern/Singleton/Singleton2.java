/**
 * 
 */
package com.chen.pattern.Singleton;

/**
 * @author ChenShi
 * @date   2017年8月12日下午11:01:52
 */
public class Singleton2 {
	private static class SingletonHolder {
		private static final Singleton2 INSTANCE = new Singleton2();
	}
	
	private Singleton2 () {	}
	
	public static Singleton2 getSingleton2() {
		return SingletonHolder.INSTANCE;
	}
	
	public void getName() {
		System.out.println("单例模式2——懒汉模式，静态内部类");
	}
	
}
