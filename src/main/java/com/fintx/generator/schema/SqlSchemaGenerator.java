/**
 *  Copyright 2017 FinTx
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

import com.fintx.generator.SchemaGenerator;
import com.fintx.generator.file.FileGenerator;
import com.fintx.generator.file.TargetFile;

import java.util.List;

/**
 * @author bluecreator(qiang.x.wang@gmail.com)
 *
 */
public interface SqlSchemaGenerator extends FileGenerator, SchemaGenerator {
    
    public List<SqlFile> getTargetFile();

}
