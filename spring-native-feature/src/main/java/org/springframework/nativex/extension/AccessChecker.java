/*
 * Copyright 2020 the original author or authors.
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
package org.springframework.nativex.extension;

import org.springframework.nativex.type.TypeSystem;

public interface AccessChecker {

	/**
	 * Check if reflective/resource access should be allowed to the specified type
	 * @param typeSystem the type system
	 * @param typename the type name
	 * @return {@code true} if the access is allowed.
	 */
	boolean check(TypeSystem typeSystem, String typename);
}
