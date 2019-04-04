package org.astrazeneca.parceltracking.util;

public class Constants {
	public static final String selectQuery = "SELECT * FROM PARCEL_TRACKING";
	public static final String insertQuery = "INSERT INTO PARCEL_TRACKING VALUES(?,?,?,?,?)";
	public static final String updateQuery = "UPDATE PARCEL_TRACKING SET TYPE=?,NAME=?,STATUS=?,LOCATION=? WHERE ID=?";
	public static final String deleteQuery = "DELETE FROM PARCEL_TRACKING WHERE NAME =?";
}
