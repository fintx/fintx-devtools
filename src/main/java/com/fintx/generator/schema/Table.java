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

import com.fintx.generator.IntrospectedModel;
import com.fintx.generator.file.TargetFile;
import org.mybatis.generator.config.ColumnOverride;
import org.mybatis.generator.config.GeneratedKey;
import org.mybatis.generator.config.IgnoredColumn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * @author bluecreator(qiang.x.wang@gmail.com)
 *
 */
public class Table {

    private HashMap<Column,Boolean> columns;

    private GeneratedKey generatedKey;

    private String tableName;

    private IntrospectedModel<?, ?, ?, Table> introspectedModel;

    private String alias;
    
    private String comments;

   

}
