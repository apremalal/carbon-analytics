/*
* Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* WSO2 Inc. licenses this file to you under the Apache License,
* Version 2.0 (the "License"); you may not use this file except
* in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.carbon.analytics.dataservice.core;

/**
 * This class hold constants that required for data service
 */
public class Constants {
    
    public static final String PERMISSION_LIST_TABLE = "/permission/admin/manage/analytics/table/list";
    public static final String PERMISSION_CREATE_TABLE = "/permission/admin/manage/analytics/table/create";
    public static final String PERMISSION_DROP_TABLE = "/permission/admin/manage/analytics/table/drop";
    public static final String PERMISSION_LIST_RECORD = "/permission/admin/manage/analytics/records/get";
    public static final String PERMISSION_PUT_RECORD = "/permission/admin/manage/analytics/records/put";
    public static final String PERMISSION_GET_RECORD = "/permission/admin/manage/analytics/records/get";
    public static final String PERMISSION_DELETE_RECORD = "/permission/admin/manage/analytics/records/delete";
    public static final String PERMISSION_SEARCH_RECORD = "/permission/admin/manage/analytics/records/search";
    public static final String DEFAULT_CHARSET = "UTF8";
    public static final String ANALYTICS_SCHEMA_FILE_EXTENSION = "xml";
    public static final String RETENTION_PERIOD = "retentionPeriod";
    public static final String INCLUDE_TABLES = "includeTables";
    public static final String INCLUDE_CLASS_SPLITTER = "###";
    public static final String DISABLE_ANALYTICS_DATA_PURGING_JVM_OPTION = "disableDataPurging";
    public static final int RECORDS_BATCH_SIZE = 1000;
    public static final String ANALYTICS_DATA_PURGING = "ANALYTICS_DATA_PURGING";
    public static final String TABLE = "table";
    public static final String TENANT_ID = "tenantId";
    public static final String CRON_STRING = "cronString";
    
}
