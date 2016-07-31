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

import org.eurekaclinical.eureka.client.comm.exception.PhenotypeHandlingException;

public final class Frequency extends Phenotype {

    private Integer atLeast;
    private Boolean isConsecutive;
    private PhenotypeField phenotype;
    private Boolean isWithin;
    private Integer withinAtLeast;
    private Long withinAtLeastUnits;
    private Integer withinAtMost;
    private Long withinAtMostUnits;
    private Long frequencyType;

    public Frequency() {
        super(Type.FREQUENCY);
    }

    public Long getFrequencyType() {
        return frequencyType;
    }

    public void setFrequencyType(Long frequencyType) {
        this.frequencyType = frequencyType;
    }

    public Integer getAtLeast() {
        return atLeast;
    }

    public void setAtLeast(Integer atLeast) {
        this.atLeast = atLeast;
    }

    public Boolean getIsConsecutive() {
        return isConsecutive;
    }

    public void setIsConsecutive(Boolean isConsecutive) {
        this.isConsecutive = isConsecutive;
    }

    public PhenotypeField getPhenotype() {
        return phenotype;
    }

    public void setPhenotype(PhenotypeField phenotype) {
        this.phenotype = phenotype;
    }

    public Boolean getIsWithin() {
        return isWithin;
    }

    public void setIsWithin(Boolean isWithin) {
        this.isWithin = isWithin;
    }

    public Integer getWithinAtLeast() {
        return withinAtLeast;
    }

    public void setWithinAtLeast(Integer withinAtLeast) {
        this.withinAtLeast = withinAtLeast;
    }

    public Long getWithinAtLeastUnits() {
        return withinAtLeastUnits;
    }

    public void setWithinAtLeastUnits(Long withinAtLeastUnits) {
        this.withinAtLeastUnits = withinAtLeastUnits;
    }

    public Integer getWithinAtMost() {
        return withinAtMost;
    }

    public void setWithinAtMost(Integer withinAtMost) {
        this.withinAtMost = withinAtMost;
    }

    public Long getWithinAtMostUnits() {
        return withinAtMostUnits;
    }

    public void setWithinAtMostUnits(Long withinAtMostUnits) {
        this.withinAtMostUnits = withinAtMostUnits;
    }

    @Override
    public void accept(PhenotypeVisitor visitor)
            throws PhenotypeHandlingException {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Frequency{" + "atLeast=" + atLeast + ", isConsecutive=" + isConsecutive + ", phenotype=" + phenotype + ", isWithin=" + isWithin + ", withinAtLeast=" + withinAtLeast + ", withinAtLeastUnits=" + withinAtLeastUnits + ", withinAtMost=" + withinAtMost + ", withinAtMostUnits=" + withinAtMostUnits + ", frequencyType=" + frequencyType + '}';
    }
    
}
