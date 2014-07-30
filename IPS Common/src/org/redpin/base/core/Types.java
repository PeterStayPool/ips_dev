/**
 *  Filename: Types.java (in org.repin.base.core)
 *  This file is part of the Redpin project.
 * 
 *  Redpin is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published
 *  by the Free Software Foundation, either version 3 of the License, or
 *  any later version.
 *
 *  Redpin is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with Redpin. If not, see <http://www.gnu.org/licenses/>.
 *
 *  (c) Copyright ETH Zurich, Pascal Brogle, Philipp Bolliger, 2010, ALL RIGHTS RESERVED.
 * 
 *  www.redpin.org
 */
package org.redpin.base.core;

/**
 * Maintains List of classes and factory methods for generic types.
 *  .. TAKEN FROM placlab
 * 
 */
// It is imperative that somewhere in each jar the appropriate
// TwoDCoordinate or FixedTwoDCoordinate file is packaged together
// This should only be a problem on the phones
public class Types {
	public static final String TYPE = "TYPE";
	public static final String WIFI = "WIFI";
	public static final String BLUETOOTH = "BT";
	public static final String GPS = "GPS";
	public static final String GSM = "GSM";
	public static final String EMPTY_WIFI = "EMPTY_WIFI";
	public static final String EMPTY_BT = "EMPTY_BT";
	public static final String EMPTY_GSM = "EMPTY_GSM";
	public static final String UNKNOWN = "unknown";
	public static final String TIME = "TIME";
	public static final String ID = "ID";
	public static final String HUMANREADABLENAME = "NAME";
	public static final String LATITUDE = "LAT";
	public static final String LONGITUDE = "LON";
	public static final String ELEVATION = "ELV";
	public static final String NEIGHBORHOOD = "NBRS";

	// WIFI
	public static final String BSSID = "BSSID";
	public static final String SSID = "SSID";
	public static final String RSSI = "RSSI";
	public static final String WEP = "WEP";
	public static final String INFR = "INFR";

	// BLUETOOTH
	public static final String FRIENDLY_NAME = "FRIENDLYNAME";
	public static final String BLUETOOTH_ADDRESS = "BLUETOOTHADDRESS";
	public static final String MAJOR_DEVICE_CLASS = "MAJORDEVICECLASS";
	public static final String MINOR_DEVICE_CLASS = "MINORDEVICECLASS";
	public static final String SERVICE_CLASSES_LIST = "SERVICECLASSESLIST";
	public static final String SERVICE_CLASSES = "SERVICECLASSES";

	// GSM
	public static final String CELLID = "CELLID";
	public static final String AREAID = "AREAID";
	public static final String MCC = "MCC";
	public static final String MNC = "MNC";
	public static final String SIGNAL = "SIGNAL";
	public static final String PERCENTAGE = "PERCENTAGE";

	// some gps stuff
	public static final String ANTENNAHEIGHT = "ANTHEIGHT";
	public static final String COURSEOVERGROUND = "COG";
	public static final String DATEOFFIX = "DATE";
	public static final String DIFFERENTIALGPSDATAAGE = "DGPSAGE";
	public static final String DIFFERENTIALREFERENCESTATIONID = "DGPSID";
	public static final String GEOIDALHEIGHT = "GEOHEIGHT";
	public static final String GPSQUALITY = "QUALITY";
	public static final String HORIZONTALDILUTIONOFPRECISION = "HDOP";
	public static final String LATITUDEHEMISPHERE = "LATHEMI";
	public static final String LONGITUDEHEMISPHERE = "LONHEMI";
	public static final String MAGNETICVARIATION = "VAR";
	public static final String MAGNETICVARIATIONDIRECTION = "VARDIR";
	public static final String MODE = "MODE";
	public static final String NUMOFSATELLITES = "NUMSAT";
	public static final String STATUS = "STATUS";
	public static final String TIMEOFFIX = "TIMEOFFIX";
	public static final String SPEEDOVERGROUND = "SOG";
	public static final String NETWORK_NAME = "NETWORKNAME";

	public static final int NETSTUMBLER_RSSI_ADJUSTMENT = 149;

}
