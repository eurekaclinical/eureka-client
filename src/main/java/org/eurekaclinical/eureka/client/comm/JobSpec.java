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

import java.util.Date;
import java.util.List;

/**
 * Hold information about a user's file upload.
 *
 * @author Andrew Post
 */
public class JobSpec {

    private Long jobMode;
    
    public static enum Side {
        START,
        FINISH
    }
    
    private String sourceConfigId;
    private String destinationId;
    private String dateRangePhenotypeKey;
    private Date earliestDate;
    private Side earliestDateSide;
    private Date latestDate;
    private Side latestDateSide;
    private SourceConfig prompts;
    private List<String> propositionIds;
    private String name;

    public String getSourceConfigId() {
        return sourceConfigId;
    }

    public void setSourceConfigId(String sourceId) {
        this.sourceConfigId = sourceId;
    }

    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public String getDateRangePhenotypeKey() {
        return dateRangePhenotypeKey;
    }

    public void setDateRangePhenotypeKey(String phenotypeKey) {
        this.dateRangePhenotypeKey = phenotypeKey;
    }

    public Date getEarliestDate() {
        return earliestDate;
    }

    public void setEarliestDate(Date earliestDate) {
        this.earliestDate = earliestDate;
    }

    public Side getEarliestDateSide() {
        return earliestDateSide;
    }

    public void setEarliestDateSide(Side earliestDateSide) {
        this.earliestDateSide = earliestDateSide;
    }

    public Date getLatestDate() {
        return latestDate;
    }

    public void setLatestDate(Date latestDate) {
        this.latestDate = latestDate;
    }

    public Side getLatestDateSide() {
        return latestDateSide;
    }

    public void setLatestDateSide(Side latestDateSide) {
        this.latestDateSide = latestDateSide;
    }

    public void setJobMode(Long jobMode) {
        this.jobMode = jobMode;
    }
    
    public Long getJobMode() {
        return this.jobMode;
    }

    public SourceConfig getPrompts() {
        return prompts;
    }

    public void setPrompts(SourceConfig prompts) {
        this.prompts = prompts;
    }

    public List<String> getPropositionIds() {
        return propositionIds;
    }

    public void setPropositionIds(List<String> propositionIds) {
        this.propositionIds = propositionIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
