/**
 * 
 */
package com.chen.pattern.Observer;

/**
 * @author ChenShi
 * @date   2017年8月13日上午12:41:34
 */
public class OctalObserver extends Observer {
	

	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attch(this);
	}

	/* (non-Javadoc)
	 * @see com.chen.pattern.Observer.Observer#update()
	 */
	@Override
	void update() {
		System.out.println("OctalObserver；" + Integer.toOctalString(subject.getState()));

	}

}
