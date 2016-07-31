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
import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.eurekaclinical.eureka.client.comm.json.SourceConfigOptionValueDeserializer;

/**
 *
 * @author Andrew Post
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = DefaultSourceConfigOption.class, name = "DEFAULT"),
    @JsonSubTypes.Type(value = FileSourceConfigOption.class, name = "FILE"),
    @JsonSubTypes.Type(value = UriSourceConfigOption.class, name = "URI")
})
public abstract class SourceConfigOption {

    public static enum BackendPropertyType {
        STRING,
        BOOLEAN,
        INTEGER,
        LONG,
        FLOAT,
        DOUBLE,
        CHARACTER,
        STRING_ARRAY,
        DOUBLE_ARRAY,
        FLOAT_ARRAY,
        INTEGER_ARRAY,
        LONG_ARRAY,
        BOOLEAN_ARRAY,
        CHARACTER_ARRAY;
    }

    private String name;

    @JsonDeserialize(using = SourceConfigOptionValueDeserializer.class)
    private Object value;

    private String displayName;
    private String description;
    private boolean required;
    private BackendPropertyType propertyType;
    private boolean prompt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public BackendPropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(BackendPropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrompt(boolean prompt) {
        this.prompt = prompt;
    }

    public boolean isPrompt() {
        return this.prompt;
    }

}
