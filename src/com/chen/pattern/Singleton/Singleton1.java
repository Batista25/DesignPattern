/**
 * 
 */
package com.chen.pattern.Singleton;

/**
 * @author ChenShi
 * @date   2017��8��12������11:01:52
 */
public class Singleton1 {
	private static Singleton1 singleton1 = new Singleton1();
	private Singleton1 () {
		
	}
	public static Singleton1 getSingleton1() {
		return singleton1;
	}
	public void getName() {
		System.out.println("����ģʽ1��������ģʽ");
	}
	
}
