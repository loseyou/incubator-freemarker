/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.freemarker.core.model;

import org.apache.freemarker.core.TemplateException;
import org.apache.freemarker.core.model.impl.SimpleHash;

/**
 * "extended hash" template language data type; extends {@link TemplateHashModel} by allowing
 * iterating through its keys and values.
 * 
 * <p>In templates they are used like hashes, but these will also work (among others):
 * {@code myExtHash?size}, {@code myExtHash?keys}, {@code myExtHash?values}.
 * @see SimpleHash
 */
public interface TemplateHashModelEx extends TemplateHashModel {

    /**
     * @return the number of key/value mappings in the hash.
     */
    int size() throws TemplateException;

    /**
     * @return a collection containing the keys in the hash. Every element of 
     *      the returned collection must implement the {@link TemplateStringModel}
     *      (as the keys of hashes are always strings).
     */
    TemplateCollectionModel keys() throws TemplateException;

    /**
     * @return a collection containing the values in the hash. The elements of the
     * returned collection can be any kind of {@link TemplateModel}-s.
     */
    TemplateCollectionModel values() throws TemplateException;
}