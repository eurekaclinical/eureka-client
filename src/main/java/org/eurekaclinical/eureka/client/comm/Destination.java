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
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;

/**
 * The configuration for a Protempa run, including the input data store
 * information, the output i2b2 data store information, ontology information,
 * and other related items.
 *
 * @author hrathod
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = CohortDestination.class, name = "COHORT"),
    @JsonSubTypes.Type(value = I2B2Destination.class, name = "I2B2"),
    @JsonSubTypes.Type(value = Neo4jDestination.class, name = "NEO4J"),
    @JsonSubTypes.Type(value = PatientSetExtractorDestination.class, name = "PATIENTSETEXTRACTOR"),
    @JsonSubTypes.Type(value = PatientSetSenderDestination.class, name = "PATIENTSETSENDER"),
    @JsonSubTypes.Type(value = TabularFileDestination.class, name = "TABULARFILE"),
    @JsonSubTypes.Type(value = RelDbDestination.class, name = "RELDB"),
    @JsonSubTypes.Type(value = PatientListDestination.class, name="PATIENTLIST"),
    @JsonSubTypes.Type(value = OmopDestination.class, name="AOUPARTICIPANT"),
    @JsonSubTypes.Type(value = PhenotypeSearchDestination.class, name="PHENOTYPESEARCH"),
    @JsonSubTypes.Type(value = CovidOmopDestination.class, name="COVIDOMOP")
})
public abstract class Destination {

    /**
     * The unique identifier for the configuration.
     */
    private Long id;
    private DestinationType type;
    private String name;
    private String description;
    private PhenotypeField[] phenotypeFields;
    private List<Link> links;

    /**
     * The unique identifier for the owner of this configuration.
     */
    private Long ownerUserId;

    private boolean read;
    private boolean write;
    private boolean execute;

    @JsonProperty("created_at")
    private Date createdAt;

    @JsonProperty("updated_at")
    private Date updatedAt;

    private boolean getStatisticsSupported;
    private boolean jobConceptListSupported;
    private List<String> requiredConcepts;

    public Destination() {

    }

    /**
     * Get the unique identifier for the configuration.
     *
     * @return The unique identifier for the configuration.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Set the unique identifier for the configuration.
     *
     * @param inId The unique identifier for the configuration.
     */
    public void setId(Long inId) {
        this.id = inId;
    }

    @JsonIgnore
    public DestinationType getType() {
        return type;
    }

    /**
     * Get the unique identifier for the owner of the configuration.
     *
     * @return The unique identifier for the owner of the configuration.
     */
    public Long getOwnerUserId() {
        return this.ownerUserId;
    }

    /**
     * Set the unique identifier for the owner of the configuration.
     *
     * @param inUserId The unique identifier for the owner of the configuration.
     */
    public void setOwnerUserId(Long inUserId) {
        this.ownerUserId = inUserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PhenotypeField[] getPhenotypeFields() {
        return phenotypeFields;
    }

    public void setPhenotypeFields(PhenotypeField[] phenotypeFields) {
        this.phenotypeFields = phenotypeFields;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public boolean isWrite() {
        return write;
    }

    public void setWrite(boolean write) {
        this.write = write;
    }

    public boolean isExecute() {
        return execute;
    }

    public void setExecute(boolean execute) {
        this.execute = execute;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public boolean isGetStatisticsSupported() {
        return getStatisticsSupported;
    }

    public void setGetStatisticsSupported(boolean getStatisticsSupported) {
        this.getStatisticsSupported = getStatisticsSupported;
    }

    public boolean isJobConceptListSupported() {
        return this.jobConceptListSupported;
    }

    public void setJobConceptListSupported(boolean jobConceptListSupported) {
        this.jobConceptListSupported = jobConceptListSupported;
    }

    public List<String> getRequiredConcepts() {
        return requiredConcepts;
    }

    public void setRequiredConcepts(List<String> requiredConcepts) {
        this.requiredConcepts = requiredConcepts;
    }

    public abstract void accept(DestinationVisitor destinationVisitor);

    @Override
    public String toString() {
        return "Destination{" + "id=" + id + ", type=" + type + ", name=" + name + ", description=" + description + ", phenotypeFields=" + phenotypeFields + ", links=" + links + ", ownerUserId=" + ownerUserId + ", read=" + read + ", write=" + write + ", execute=" + execute + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", getStatisticsSupported=" + getStatisticsSupported + ", jobConceptListSupported=" + jobConceptListSupported + ", requiredConcepts=" + requiredConcepts + '}';
    }
    
}
