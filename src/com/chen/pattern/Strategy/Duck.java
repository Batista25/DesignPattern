/**
 * 
 */
package com.chen.pattern.Strategy;

/**
 * @author ChenShi
 * @date   2017��8��11������2:44:15
 */
public abstract class Duck {
	private Fly fly;
	private Quack quack;
	public abstract void display();
	
	public void quack(){
		quack.quack();
	}
	
	public void setQuack(Quack quack) {
		this.quack = quack;
	}
	
	
	public void fly() {
		fly.fly();
	}
	
	public void setFly(Fly fly) {
		this.fly = fly;
	}
}
