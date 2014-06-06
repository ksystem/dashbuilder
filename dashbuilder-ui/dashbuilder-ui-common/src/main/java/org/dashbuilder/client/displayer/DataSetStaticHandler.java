    /**
 * Copyright (C) 2014 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dashbuilder.client.displayer;

import java.util.Collection;

import org.dashbuilder.client.dataset.DataSetReadyCallback;
import org.dashbuilder.model.dataset.DataSet;
import org.dashbuilder.model.dataset.DataSetMetadata;
import org.dashbuilder.model.dataset.sort.SortOrder;

public class DataSetStaticHandler implements DataSetHandler {

    protected DataSet dataSet;
    protected DataSet result;

    public DataSetStaticHandler(DataSet dataSet) {
        this.dataSet = dataSet;
        this.result = dataSet;
    }

    public DataSetMetadata getDataSetMetadata() {
        return dataSet.getMetadata();
    }

    public DataSetHandler selectIntervals(String columnId, Collection<String> intervalNames) {
        // NOT SUPPORTED YET
        return this;
    }

    public DataSetHandler filterDataSet(String columnId, Collection<Comparable> allowedValues) {
        // NOT SUPPORTED YET
        return this;
    }

    public DataSetHandler filterDataSet(String columnId, Comparable lowValue, Comparable highValue) {
        // NOT SUPPORTED YET
        return this;
    }

    public DataSetHandler sortDataSet(String columnId, SortOrder order) {
        // NOT SUPPORTED YET
        return this;
    }

    public DataSetHandler trimDataSet(int offset, int rows) {
        result = result.trim(offset, rows);
        return this;
    }

    public DataSetHandler resetAllOperations() {
        result = dataSet;
        return this;
    }

    public DataSetHandler lookupDataSet(DataSetReadyCallback callback) {
        callback.callback(result);
        return this;
    }
}