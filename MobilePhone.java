package com.test.vignesh;

public class MobilePhone implements TelePhone {

	//@SuppressWarnings("unused")
	private String mynumber;
	private boolean isRinging;
	private boolean poweron;
	
	public MobilePhone(String mynumber) {
		this.mynumber=mynumber;
	}
	
	@Override
	public void poweron() {
		poweron=true;
		System.out.println("Phone is powered on ");
	}
	@Override
	public void dial(String phonenumber) {
		System.out.println("Now Dialing "+phonenumber+" on Desk phone");
	}
	@Override
	public void answer() {
		if(isRinging &&poweron) {
			System.out.println("Answering the Phone");
			isRinging=false;
		}
		else {
			System.out.println("Either Phone is not correst or phone is off");
		}
	}
	
	@Override
	public boolean callPhone(String phonenumber) {
		if(phonenumber==mynumber &&poweron) {
			isRinging=true;
		}
		else {
			isRinging=false;
		}
		return isRinging;
	}
	
	
	@Override
	public boolean isRinging() {
		return isRinging;
	}
	

}
