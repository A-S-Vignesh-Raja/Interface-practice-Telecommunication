package com.test.vignesh;

public class Deskphone implements TelePhone{

	private String mynumber;
	private boolean isRinging;
	
	public Deskphone(String mynumber) {
		this.mynumber=mynumber;
	}
	
	@Override
	public void poweron() {
		System.out.println("Desk phone is always powered on ");
	}
	@Override
	public void dial(String phonenumber) {
		System.out.println("Now Dialing "+phonenumber+" on Desk phone");
	}
	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answering the Phone");
			isRinging=false;
		}
		else {
			System.out.println("Phone is not Ringing");
		}
	}
	
	@Override
	public boolean callPhone(String phonenumber) {
		if(phonenumber==mynumber) {
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
