/*
 * Copyright 2022 Netflix, Inc.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.netflix.conductor.validations;

import com.netflix.conductor.dao.MetadataDAO;

/**
 * This context is defined to get access to {@link MetadataDAO} inside {@link
 * WorkflowTaskValidConstraint} constraint validator to validate {@link
 * com.netflix.conductor.common.metadata.workflow.WorkflowTask}.
 */
public class ValidationContext {

    private static MetadataDAO metadataDAO;

    public static void initialize(MetadataDAO metadataDAO) {
        ValidationContext.metadataDAO = metadataDAO;
    }

    public static MetadataDAO getMetadataDAO() {
        return metadataDAO;
    }
}
