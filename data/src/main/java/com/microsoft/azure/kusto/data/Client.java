// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

package com.microsoft.azure.kusto.data;

import com.microsoft.azure.kusto.data.exceptions.DataClientException;
import com.microsoft.azure.kusto.data.exceptions.DataServiceException;

public interface Client {
    KustoOperationResult execute(String command) throws DataServiceException, DataClientException;

    KustoOperationResult execute(String database, String command) throws DataServiceException, DataClientException;

    KustoOperationResult execute(String database, String command, ClientRequestProperties properties) throws DataServiceException, DataClientException;

    String executeForJsonResult(String database) throws DataServiceException, DataClientException;

    String executeForJsonResult(String database, String command) throws DataServiceException, DataClientException;

    String executeForJsonResult(String database, String command, ClientRequestProperties properties) throws DataServiceException, DataClientException;
}