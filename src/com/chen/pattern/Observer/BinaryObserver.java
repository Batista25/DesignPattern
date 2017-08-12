/**
 * 
 */
package com.chen.pattern.Observer;

/**
 * @author ChenShi
 * @date   2017年8月13日上午12:37:19
 */
public class BinaryObserver extends Observer {
	
	

	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attch(this);
	}

	/* (non-Javadoc)
	 * @see com.chen.pattern.Observer.Observer#update()
	 */
	@Override
	void update() {
		System.out.println("BinaryObserver:" + Integer.toBinaryString(subject.getState()));

	}

}
