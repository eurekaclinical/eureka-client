/*
 * #%L
 * Eureka Common
 * %%
 * Copyright (C) 2012 - 2013 Emory University
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
package org.eurekaclinical.eureka.client.comm;

import java.util.List;

import org.eurekaclinical.eureka.client.comm.exception.PhenotypeHandlingException;

public final class SystemPhenotype extends Phenotype {

    private SystemType systemType;
    private List<SystemPhenotype> children;
    private boolean isParent;
    private List<String> properties;

    public SystemPhenotype() {
        super(Type.SYSTEM);
    }

    public SystemType getSystemType() {
        return systemType;
    }

    public void setSystemType(SystemType systemType) {
        this.systemType = systemType;
    }

    public List<SystemPhenotype> getChildren() {
        return children;
    }

    public void setChildren(List<SystemPhenotype> children) {
        this.children = children;
    }

    public boolean isParent() {
        return isParent;
    }

    public void setParent(boolean isParent) {
        this.isParent = isParent;
    }

    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }

    @Override
    public boolean isInSystem() {
        return true;
    }

    @Override
    public void accept(PhenotypeVisitor visitor)
            throws PhenotypeHandlingException {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "SystemPhenotype{" + "systemType=" + systemType + ", children=" + children + ", isParent=" + isParent + ", properties=" + properties + '}';
    }
    
}
