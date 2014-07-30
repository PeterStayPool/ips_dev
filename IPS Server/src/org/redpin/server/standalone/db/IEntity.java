/**
 *  Filename: IEntity.java (in org.redpin.server.standalone.db)
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
package org.redpin.server.standalone.db;

import java.io.Serializable;

/**
 * Generic interface for a database entity
 * 
 * @author Pascal Brogle (broglep@student.ethz.ch)
 *
 * @param <ID> Primary key type
 */
public interface IEntity<ID extends Serializable> {
	/**
	 * gets the primary key
	 * 
	 * @return primary key 
	 */
	public ID getId();
	
	/**
	 * sets the primary key
	 * 
	 * @param id primary key
	 */
	public void setId(ID id);
}
