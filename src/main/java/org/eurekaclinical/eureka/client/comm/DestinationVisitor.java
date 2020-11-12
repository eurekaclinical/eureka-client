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
/**
 *
 * @author Andrew Post
 */
public interface DestinationVisitor {

    void visit(CohortDestination cohortDestination);

    void visit(I2B2Destination i2b2Destination);

    void visit(Neo4jDestination neo4jDestination);

    void visit(PatientSetExtractorDestination patientSetExtractorDestination);
    
    void visit(PatientSetSenderDestination patientSetSenderDestination);
    
    void visit(TabularFileDestination tabularFileDestination);
    
    void visit(RelDbDestination relDbDestination);
    
    void visit(PatientListDestination patientListDestination);

	void visit(OmopDestination omopDestination);
	
	void visit(PhenotypeSearchDestination phenotypeSearchDestination);
	
	void visit(CovidOmopDestination covidOmopDestination);
}
