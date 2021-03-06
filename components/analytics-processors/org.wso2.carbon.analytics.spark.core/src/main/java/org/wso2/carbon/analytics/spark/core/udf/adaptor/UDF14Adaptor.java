/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.wso2.carbon.analytics.spark.core.udf.adaptor;


import org.apache.spark.sql.api.java.UDF14;
import org.apache.spark.sql.types.DataType;
import org.wso2.carbon.analytics.spark.core.exception.AnalyticsUDFException;
import org.wso2.carbon.analytics.spark.core.util.AnalyticsCommonUtils;

import java.lang.reflect.Method;

/**
 * This class represents custom UDF type 14 adaptor
 */
public class UDF14Adaptor implements UDF14 {

    private static final long serialVersionUID = -9036521725519994291L;
    private Class<Object> udfClass;
    private String udfMethodName;
    private Class[] parameterTypes;

    public UDF14Adaptor(Class<Object> udfClass, String udfMethodName, Class[] parameterTypes)
            throws AnalyticsUDFException {
        this.udfClass = udfClass;
        this.udfMethodName = udfMethodName;
        this.parameterTypes = parameterTypes;

    }

    @Override
    public Object call(Object o, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7,
                       Object o8, Object o9, Object o10, Object o11, Object o12, Object o13,
                       Object o14) throws Exception {
        Object udfInstance = udfClass.newInstance();
        Method udfMethod = udfClass.getDeclaredMethod(udfMethodName, parameterTypes);
        return udfMethod.invoke(udfInstance, o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
    }
}
