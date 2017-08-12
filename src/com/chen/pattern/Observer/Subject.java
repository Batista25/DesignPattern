/**
 * 
 */
package com.chen.pattern.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ChenShi
 * @date   2017年8月13日上午12:27:08
 */
public class Subject {
	private List<Observer> observers = new ArrayList<>();
	
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	/**
	 * 
	 */
	private void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
		
	}

	public void attch(Observer observer) {
		observers.add(observer);
	}

}
