package org.eurekaclinical.eureka.client.comm;

/*-
 * #%L
 * Eureka! Client
 * %%
 * Copyright (C) 2016 Emory University
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

/**
 *
 * @author Andrew Post
 */
public class JobEvent {

    /**
     * The unique identifier for the job event.
     */
    private Long id;
    /**
     * The status of the event.
     */
    private JobStatus status;

    /**
     * The exception stack trace. The name is prefixed with a z to force
     * hibernate to populate this field last in insert and update statements to
     * avoid the dreaded
     * <code>ORA-24816: Expanded non LONG bind data supplied after actual LONG or LOB column</code>
     * error message from Oracle. Hibernate apparently orders fields
     * alphabetically.
     */
    private String exceptionStackTrace;
    /**
     * The time stamp for the event.
     */
    private Date timeStamp;
    /**
     * The message generated for the event.
     */
    private String message;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public JobStatus getStatus() {
        return status;
    }

    public void setStatus(JobStatus status) {
        this.status = status;
    }

    public String getExceptionStackTrace() {
        return exceptionStackTrace;
    }

    public void setExceptionStackTrace(String exceptionStackTrace) {
        this.exceptionStackTrace = exceptionStackTrace;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
