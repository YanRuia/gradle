/*
 * Copyright 2017 the original author or authors.
 *
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
 */

package org.gradle.internal.metaobject;

/**
 * A decorated domain object type may optionally implement this interface to dynamically expose properties in addition to those declared statically on the type.
 *
 * Note that when a type implements this interface, dynamic Groovy dispatch will not be used to discover opaque properties. That is, methods such as propertyMissing() will be ignored.
 */
public interface PropertyMixIn {
    PropertyAccess getAdditionalProperties();
}
