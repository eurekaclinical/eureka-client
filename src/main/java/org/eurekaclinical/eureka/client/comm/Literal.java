package org.eurekaclinical.eureka.client.comm;

/*
 * #%L
 * Eureka Common
 * %%
 * Copyright (C) 2012 - 2014 Emory University
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
import java.util.Date;
import org.protempa.proposition.value.Value;
import org.protempa.proposition.value.ValueComparator;

/**
 *
 * @author Andrew Post
 */
public class Literal extends Node {

    private String name;

    private Date start;

    private Date finish;
    
    private String propertyName;
    
    private ValueComparator propertyValueComparator;
    
    private Value propertyValue;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public ValueComparator getPropertyValueComparator() {
        return propertyValueComparator;
    }

    public void setPropertyValueComparator(ValueComparator propertyValueComparator) {
        this.propertyValueComparator = propertyValueComparator;
    }

    public Value getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(Value propertyValue) {
        this.propertyValue = propertyValue;
    }

    @Override
    public void accept(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }
    
    @Override
    public String toString() {
        return "Literal{" + "name=" + name + ", start=" + start + ", finish=" + finish + 
                ", propertyName=" + propertyName + ", propertyValueComparator=" + propertyValueComparator +
                ", propertyValue=" + propertyValue + '}';
    }
    
}
