package org.astrazeneca.parceltracking.controller;

import java.util.List;

import org.astrazeneca.parceltracking.model.ParcelTracking;
import org.astrazeneca.parceltracking.service.ParcelTrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/parceltracking")
@CrossOrigin(origins = "http://localhost:4200")
public class ParcelTrackingController {
	
	@Autowired
    private final ParcelTrackingService parcelTrackingService;
    
    @PostMapping(path = "/add")
    public ResponseEntity<?> addParcel(@RequestBody ParcelTracking parcel) {
    	try {
			parcelTrackingService.addParcel(parcel);
		} catch (Exception e) {
			return new ResponseEntity<Void>( HttpStatus.CONFLICT);
		}
    	
        return new ResponseEntity<String>("Added", HttpStatus.OK);
    }
    
    @PutMapping(path = "/update/")
	public ResponseEntity<String> updateParcel(@RequestBody ParcelTracking parcel) {
    	try {
			parcelTrackingService.updateParcel(parcel);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.OK);
		}
    	return new ResponseEntity<String>("Changed", HttpStatus.OK);
	}
	
    @GetMapping(value = "/delete/{name}")
	public ResponseEntity<String> deleteParcel(@PathVariable("name") String parcelName) {
    	try {
    		parcelTrackingService.deleteParcel(parcelName);
    	}catch(Exception e) {
    		return new ResponseEntity<String>(e.getMessage(), HttpStatus.OK);
    	}
    	return new ResponseEntity<String>("Parcel Deleted Successfully",HttpStatus.OK);
	}
	
    @GetMapping(value="/search/{name}")
	public ResponseEntity<?> searchParcel(@PathVariable("name") String parcelName) {
    	ParcelTracking parcel = null;
		try {
			parcel = parcelTrackingService.searchParcel(parcelName);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.OK);
		}
    	return new ResponseEntity<ParcelTracking>(parcel, HttpStatus.OK);
	}
	
    @GetMapping(value="/status/{name}")
	public ResponseEntity<?> getStatusParcel(@PathVariable("name") String parcelName) {
    	ParcelTracking parcel = null;
		try {
			parcel = parcelTrackingService.getStatusParcel(parcelName);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.OK);
		}
    	return new ResponseEntity<ParcelTracking>(parcel, HttpStatus.OK);
	}
	   
    @GetMapping(value="/getAll",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllParcel(){
    	 List<ParcelTracking> list = null;
    	try {
    		 list = parcelTrackingService.getAllParcel();
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.OK);
		}
    	return new ResponseEntity<List<ParcelTracking>>(list, HttpStatus.OK);
    }
	
    public ParcelTrackingController(ParcelTrackingService parcelTrackingService) {
        this.parcelTrackingService = parcelTrackingService;
    }
}