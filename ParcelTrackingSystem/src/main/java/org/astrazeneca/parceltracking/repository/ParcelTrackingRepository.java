package org.astrazeneca.parceltracking.repository;

import java.util.List;

import org.astrazeneca.parceltracking.exception.ParcelTrackingException;
import org.astrazeneca.parceltracking.model.ParcelTracking;

public interface ParcelTrackingRepository  {
	public void addParcel(ParcelTracking parcel) throws ParcelTrackingException;
	public void updateParcel(ParcelTracking parcel) throws ParcelTrackingException;
	public void deleteParcel(String parcelName) throws ParcelTrackingException;
	public ParcelTracking searchParcel(String parcelName) throws ParcelTrackingException;
	public ParcelTracking getStatusParcel(String parcelName) throws ParcelTrackingException;
	public List<ParcelTracking> getAllParcel();
	
}
