package org.astrazeneca.parceltracking.exception;

public class ParcelTrackingException extends Exception{
	
	public ParcelTrackingException(String s) {
		super(s);
	}

	@Override
	public String toString() {
		return "ParcelTrackingException []";
	}
	
}
