/**
 * 
 */
package com.chen.pattern.Singleton;

/**
 * @author ChenShi
 * @date   2017��8��12������11:01:52
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
		System.out.println("����ģʽ2��������ģʽ����̬�ڲ���");
	}
	
}
