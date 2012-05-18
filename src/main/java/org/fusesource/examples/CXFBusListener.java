/*
 * Copyright 2012 FuseSource
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.fusesource.examples;

import org.apache.cxf.Bus;
import org.apache.cxf.feature.LoggingFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CXFBusListener {
	
	private final static Logger LOG = LoggerFactory.getLogger(CXFBusListener.class);
	
	public void busRegistered(Bus bus) {
		LOG.info("Adding LoggingFeature interceptor on bus: " + bus);
		LoggingFeature lf = new LoggingFeature();
		// initialise the feature on the bus, which will add the interceptors
		lf.initialize(bus);
		LOG.info("Successfully added LoggingFeature interceptor on bus: " + bus);
	}

}
