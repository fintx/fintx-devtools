/**
 *  Copyright 2018 FinTx
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fintx.generator.schema;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.config.Context;

import java.util.Properties;

/**
 * @author bluecreator(qiang.x.wang@gmail.com)
 *
 */
public class Column {
    protected String actualColumnName;

    protected int jdbcType;

    protected String jdbcTypeName;

    protected boolean nullable;

    protected int length;

    protected int scale;

    protected boolean identity;

    protected boolean isSequenceColumn;

    protected String javaProperty;

    protected FullyQualifiedJavaType fullyQualifiedJavaType;

    protected String tableAlias;

    protected String typeHandler;

    protected Context context;

    protected boolean isColumnNameDelimited;

    protected TableSqlFile table;

    protected Properties properties;

    // any database comment associated with this column. May be null
    protected String remarks;

    protected String defaultValue;

    /**
     * true if the JDBC driver reports that this column is auto-increment.
     */
    protected boolean isAutoIncrement;

    /**
     * true if the JDBC driver reports that this column is generated.
     */
    protected boolean isGeneratedColumn;

    /**
     * True if there is a column override that defines this column as GENERATED ALWAYS.
     */
    protected boolean isGeneratedAlways;
}
