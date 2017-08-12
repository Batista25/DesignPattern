/**
 * 
 */
package com.chen.pattern.Observer;

/**
 * @author ChenShi
 * @date   2017��8��13������12:45:31
 */
public class HexaObserver extends Observer {
	
	public HexaObserver(Subject subject ){
		this.subject = subject;
		this.subject.attch(this);
	}

	/* (non-Javadoc)
	 * @see com.chen.pattern.Observer.Observer#update()
	 */
	@Override
	void update() {
		System.out.println("HexaObserver:" + Integer.toHexString(subject.getState()));

	}

}
