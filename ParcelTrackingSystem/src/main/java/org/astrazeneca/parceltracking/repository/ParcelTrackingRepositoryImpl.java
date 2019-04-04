package org.astrazeneca.parceltracking.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.astrazeneca.parceltracking.exception.ParcelTrackingException;
import org.astrazeneca.parceltracking.model.ParcelTracking;
import org.astrazeneca.parceltracking.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ParcelTrackingRepositoryImpl implements ParcelTrackingRepository{
	
	@Autowired
	JdbcTemplate template;  
	
	public void addParcel(ParcelTracking parcel) throws ParcelTrackingException {
		Optional<ParcelTracking> parcelTrackking = Optional.ofNullable(parcel);
		if(parcelTrackking.isPresent()) {
			Long parcelId = parcel.getParcelId();
			String parcelName = parcel.getParcelName();
			String parcelType = parcel.getParcelType();
			String parcelStatus = parcel.getParcelStatus();
			String parcelLocation = parcel.getParcelLocation();
			
			if(null != parcelId && null != parcelName && null != parcelType && null != parcelStatus && null != parcelLocation) {
				template.update(Constants.insertQuery, parcelId, parcelType,parcelName, parcelStatus,parcelLocation );
			}
				
			else throw new ParcelTrackingException("exception while adding parcel");
		}
    }
	
	public void updateParcel(ParcelTracking parcel) throws ParcelTrackingException {
		Optional<ParcelTracking> parcelTrackking = Optional.ofNullable(parcel);
		if(parcelTrackking.isPresent()) {
			Long parcelId = parcel.getParcelId();
			String parcelName = parcel.getParcelName();
			String parcelType = parcel.getParcelType();
			String parcelStatus = parcel.getParcelStatus();
			String parcelLocation = parcel.getParcelLocation();
			if(null != parcelId && null != parcelName && null != parcelType && null != parcelStatus && null != parcelLocation)
				template.update(Constants.updateQuery,
	                new Object[] {
	                		parcelType,parcelName,parcelStatus,parcelLocation,parcelId 
	                        });
			else throw new ParcelTrackingException("exception while updating parcel");
			
		}
		
	}
	public void deleteParcel(String parcelName) throws ParcelTrackingException {
		if(null != parcelName) {
			template.update(Constants.deleteQuery,parcelName);
		}
		else throw new ParcelTrackingException("exception while deleting");
	}
	public ParcelTracking searchParcel(String parcelName) throws ParcelTrackingException {
		ParcelTracking parcel = null;
		List<ParcelTracking> getAllParcel = getAllParcel();
		if(null != getAllParcel && getAllParcel.size() > 0) {
			for(ParcelTracking p : getAllParcel) {
				if(p.getParcelName().equals(parcelName)) {
					parcel = p;
					break;
				}
			}
		}
		else throw new ParcelTrackingException("Parcel not found"); 
		return parcel;
	}
	public  ParcelTracking getStatusParcel(String parcelName) throws ParcelTrackingException {
		return searchParcel(parcelName);
	}
	
	public List<ParcelTracking> getAllParcel() {
		return template.query(Constants.selectQuery,new RowMapper<ParcelTracking>(){    
	        public ParcelTracking mapRow(ResultSet rs, int row) throws SQLException {    
	        	ParcelTracking parcel=new ParcelTracking();
	        	parcel.setParcelId(rs.getInt(1));
	        	parcel.setParcelType(rs.getString(2));
	        	parcel.setParcelName(rs.getString(3));
	        	parcel.setParcelStatus(rs.getString(4));
	        	parcel.setParcelLocation((rs.getString(5)));
	            return parcel;    
	        }    
	    });  
	}
}
