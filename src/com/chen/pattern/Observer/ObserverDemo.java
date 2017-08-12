/**
 * 
 */
package com.chen.pattern.Observer;

/**
 * @author ChenShi
 * @date   2017年8月13日上午12:25:31
 */
public class ObserverDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subject subject  = new Subject();
		OctalObserver observer = new OctalObserver(subject);
		BinaryObserver binaryObserver = new BinaryObserver(subject);
		HexaObserver hexaObserver = new HexaObserver(subject);
		subject.setState(10);
		subject.setState(29);

	}

}
