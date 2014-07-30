/**
 *  Filename: WiFiReading.java (in org.repin.base.core.measure)
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
package org.redpin.base.core.measure;

import org.redpin.base.core.Types;

/**
 * Describes a WiFi reading
 * 
 * @author Philipp Bolliger (philipp@bolliger.name)
 * @author Simon Tobler (simon.p.tobler@gmx.ch)
 * @author Pascal Brogle (broglep@student.ethz.ch)
 * @version 0.2
 */
public class WiFiReading {

	

	/** The unique id of the AP. This is the same thing as the AP's MAC address * */
	protected String bssid = "";

	/** The human readable network address (e.g. 'default' or 'eth') * */
	protected String ssid = "";

	/** The observed signal strength * */
	protected int rssi = 0;

	/** Denotes whether encryption in enabled for the AP or not * */
	protected boolean wepEnabled = false;

	/** Denotes whether the AP in in infrastructure or peer-to-peer mode * */
	protected boolean isInfrastructure = true;

	/* **************** Getter and Setter Methods **************** */

	/**
	 * @return the bssid
	 */
	public String getBssid() {
		return bssid;
	}

	/**
	 * @param bssid
	 *            the bssid to set
	 */
	public void setBssid(String bssid) {
		this.bssid = bssid;
	}

	/**
	 * @return the ssid
	 */
	public String getSsid() {
		return ssid;
	}

	/**
	 * @param ssid
	 *            the ssid to set
	 */
	public void setSsid(String ssid) {
		this.ssid = ssid;
	}

	/**
	 * @return the rssi
	 */
	public int getRssi() {
		return rssi;
	}

	/**
	 * @param rssi
	 *            the rssi to set
	 */
	public void setRssi(int rssi) {
		this.rssi = rssi;
	}

	/**
	 * @return the wepEnabled
	 */
	public boolean isWepEnabled() {
		return wepEnabled;
	}

	/**
	 * @param wepEnabled
	 *            the wepEnabled to set
	 */
	public void setWepEnabled(boolean wepEnabled) {
		this.wepEnabled = wepEnabled;
	}

	/**
	 * @return the isInfrastructure
	 */
	public boolean isInfrastructure() {
		return isInfrastructure;
	}

	/**
	 * @param isInfrastructure
	 *            the isInfrastructure to set
	 */
	public void setInfrastructure(boolean isInfrastructure) {
		this.isInfrastructure = isInfrastructure;
	}

	/* **************** Methods for Reading **************** */

	public String getType() {
		return Types.WIFI;
	}
	
	/*
	 * removed due to conflicts: what is id needed for?
	 *
	public String getId() {
		return bssid;
	}
	*/
	

	public int getNormalizedSignalStrength() {
		// TODO test and rewrite (taken from placelab)
		// return an int 0-100 depending on the signal strength, or -1 if
		// unsupported
		// linear heuristic based on histogram of logs at IRS
		// -45 => 100, -60 => 67, -75 => 33, -90 => 0
		// int retval = (100*(90 + rssi)) / 45;

		// JWS changed this since supporting particlefilters is easier this way
		// will affect the colouring on XMapDemo - more yellows and less
		// reds/greens
		int retval = rssi + 100;
		if (retval < 0)
			retval = 0;
		if (retval > 100)
			retval = 100;
		return retval;
	}

	public String getHumanReadableName() {
		return ssid + " (" + bssid + ")";
	}

	public String toString() {
		return super.toString() + ": " + Types.BSSID + "=" + bssid + "|" + Types.SSID
				+ "=" + ssid + "|" + Types.RSSI + "=" + rssi + "|" + Types.WEP
				+ "=" + wepEnabled + "|" + Types.INFR + "=" + isInfrastructure;
	}

}
