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
package com.fintx.generator.mapper;

import com.fintx.generator.Context;
import com.fintx.generator.MapperGenerator;
import com.fintx.generator.java.JavaGenerator;
import com.squareup.javapoet.JavaFile;
import org.mybatis.generator.api.dom.java.CompilationUnit;

import java.util.List;

/**
 * @author bluecreator(qiang.x.wang@gmail.com)
 *
 */
public interface JavaSqlMapperGenerator  extends JavaGenerator,MapperGenerator {
  
}
