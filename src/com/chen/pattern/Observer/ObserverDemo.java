/**
 * 
 */
package com.chen.pattern.Observer;

/**
 * @author ChenShi
 * @date   2017��8��13������12:25:31
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
