/*
				RioDBPlugin

Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.
 
*/

/*
 * 	Defines a steam event Field 
 * 
 */

package org.riodb.plugin;

public class RioDBStreamEventField {
	
	// name of the field
	private String name;
	// is field numeric or string
	private boolean isNumber;

	// constructor
	public RioDBStreamEventField(String name, boolean isNumber) {
		this.name = name;
		this.isNumber = isNumber;
	}

	// get field name
	public String getName() {
		return name;
	}

	// Check if field is numeric or not
	public boolean isNumeric() {
		return isNumber;
	}
}
