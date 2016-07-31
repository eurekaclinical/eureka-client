package org.eurekaclinical.eureka.client.comm.json;

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

import java.io.IOException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.deser.std.UntypedObjectDeserializer;

/**
 * Acts like the default deserializer for untyped objects, except if the 
 * default deserializer returns an {@link Integer}, convert into a 
 * {@link Long}.
 * 
 * @author Andrew Post
 */
public class SourceConfigOptionValueDeserializer extends UntypedObjectDeserializer {

	@Override
	public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException, JsonProcessingException {
		Object out = super.deserializeWithType(jp, ctxt, typeDeserializer);
        if (out instanceof Integer) {
            return Long.valueOf((Integer)out).longValue();
        }
        return out;
	}

	@Override
	public Object deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		Object out = super.deserialize(jp, ctxt);
        if (out instanceof Integer) {
            return Long.valueOf((Integer)out).longValue();
        }
        return out;
	}
	
}
