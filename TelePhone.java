/**
 * 
 */
package com.test.vignesh;

/**
 * @author a.s.vignesh raja
 *
 */
public interface TelePhone {

	//lets create the methods we want
	void poweron();
	void dial(String phonenumber);
	void answer();
	boolean callPhone(String phonenumber);
	boolean isRinging();
	
}
