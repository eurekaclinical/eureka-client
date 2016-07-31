package org.eurekaclinical.eureka.client.comm;

/*
 * #%L
 * Eureka Common
 * %%
 * Copyright (C) 2012 - 2015 Emory University
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Andrew Post
 */
public class Statistics {
	private Integer numberOfKeys;
	private Map<String, Integer> counts;
	private Map<String, String> childrenToParents;

	public Integer getNumberOfKeys() {
		return numberOfKeys;
	}

	public void setNumberOfKeys(Integer numberOfKeys) {
		this.numberOfKeys = numberOfKeys;
	}
	
	public Map<String, Integer> getCounts() {
		return new HashMap<>(counts);
	}

	public void setCounts(Map<String, Integer> counts) {
		this.counts = new HashMap<>(counts);
	}

	public Map<String, String> getChildrenToParents() {
		return childrenToParents;
	}

	public void setChildrenToParents(Map<String, String> childrenToParents) {
		this.childrenToParents = childrenToParents;
	}
	
}
