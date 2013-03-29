/*
 * Copyright 2013 FasterXML.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the license for the specific language governing permissions and
 * limitations under the license.
 */

package com.fasterxml.jackson.datatype.jsr310.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;

import java.io.IOException;
import java.time.Period;

/**
 * Deserializer for Java 8 temporal {@link Period}s.
 *
 * @author Nick Williams
 * @since 2.2.0
 */
public class PeriodDeserializer extends JSR310DeserializerBase<Period>
{
    public PeriodDeserializer()
    {
        super(Period.class);
    }

    @Override
    public Period deserialize(JsonParser parser, DeserializationContext context) throws IOException
    {
        return Period.parse(parser.getText());
    }
}
