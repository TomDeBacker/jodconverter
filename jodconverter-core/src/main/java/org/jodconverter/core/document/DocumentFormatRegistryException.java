/*
 * Copyright (c) 2004 - 2012; Mirko Nasato and contributors
 *               2016 - 2022; Simon Braconnier and contributors
 *               2022 - present; JODConverter
 *
 * This file is part of JODConverter - Java OpenDocument Converter.
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

package org.jodconverter.core.document;

import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * Exception thrown when a {@link DefaultDocumentFormatRegistry} cannot be created and initialized
 * properly.
 */
public class DocumentFormatRegistryException extends RuntimeException {
  private static final long serialVersionUID = -4334974313547581948L;

  /**
   * Constructs an exception with the specified detail message and cause.
   *
   * @param message the detail message.
   * @param cause the cause.
   */
  public DocumentFormatRegistryException(
      final @NonNull String message, final @NonNull Throwable cause) {
    super(message, cause);
  }
}
