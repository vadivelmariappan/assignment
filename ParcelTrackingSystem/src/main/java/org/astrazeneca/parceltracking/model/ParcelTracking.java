package org.astrazeneca.parceltracking.model;

import java.util.Date;

public class ParcelTracking {

	private Long parcelId;
    private String parcelName;
    private String parcelStatus;
    private String parcelType;
    private String parcelLocation;
    
	public ParcelTracking() {
		
	}
	 
    public ParcelTracking(Long parcelId, String parcelName, String parcelStatus, String parcelType,
			String parcelLocation) {
		this.parcelId = parcelId;
		this.parcelName = parcelName;
		this.parcelStatus = parcelStatus;
		this.parcelType = parcelType;
		this.parcelLocation = parcelLocation;
	}

	public Long getParcelId() {
		return parcelId;
	}

	public void setParcelId(long i) {
		this.parcelId = i;
	}

	public String getParcelName() {
		return parcelName;
	}

	public void setParcelName(String parcelName) {
		this.parcelName = parcelName;
	}

	public String getParcelStatus() {
		return parcelStatus;
	}

	public void setParcelStatus(String parcelStatus) {
		this.parcelStatus = parcelStatus;
	}

	public String getParcelType() {
		return parcelType;
	}

	public void setParcelType(String parcelType) {
		this.parcelType = parcelType;
	}

	public String getParcelLocation() {
		return parcelLocation;
	}

	public void setParcelLocation(String parcelLocation) {
		this.parcelLocation = parcelLocation;
	}

	@Override
	public String toString() {
		return "ParcelTracking [parcelId=" + parcelId + ", parcelName=" + parcelName + ", parcelStatus=" + parcelStatus
				+ ", parcelType=" + parcelType + ", parcelLocation=" + parcelLocation
				+  "]";
	}
  }

