package org.astrazeneca.parceltracking.service;

import java.util.List;

import org.astrazeneca.parceltracking.exception.ParcelTrackingException;
import org.astrazeneca.parceltracking.model.ParcelTracking;
import org.astrazeneca.parceltracking.repository.ParcelTrackingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

@Service
public class EmployeeServiceImpl implements ParcelTrackingService {

	@Autowired
    private final ParcelTrackingRepository parcelTrackingRepository;

    public void addParcel(ParcelTracking parcel) throws ParcelTrackingException {
    	parcelTrackingRepository.addParcel(parcel);
    }
	public void updateParcel(ParcelTracking parcel) throws ParcelTrackingException {
		 parcelTrackingRepository.updateParcel(parcel);
	}
	public void deleteParcel(String parcelName) throws ParcelTrackingException {
		 parcelTrackingRepository.deleteParcel(parcelName);
	}
	public ParcelTracking searchParcel(String parcelName) throws ParcelTrackingException {
		return parcelTrackingRepository.searchParcel(parcelName);
	}
	public ParcelTracking getStatusParcel(String parcelName) throws ParcelTrackingException {
		return parcelTrackingRepository.getStatusParcel(parcelName);
	}
	
	public List<ParcelTracking> getAllParcel() {
		return parcelTrackingRepository.getAllParcel();
	}
	
	public EmployeeServiceImpl(final ParcelTrackingRepository repository) {
        this.parcelTrackingRepository = repository;
    }
}