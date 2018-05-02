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
package com.fintx.generator;

import org.mybatis.generator.config.Context;

/**
 * @author bluecreator(qiang.x.wang@gmail.com)
 *
 */
public class Field {
    
    private String name;
    
    private String type;
    
    private String comment;
    
    private String alias;
    
    private String schemaName;
    
    private String schemaType;
    
    protected String typeHandler;
    
    private int length;
    
    private String indexGroup;
    
    private String uniqueGroup;  
    
    protected int scale;

    protected boolean identity;
    
    protected boolean ignored;
      
    protected boolean generatedKey;
    
    protected Context context;

    protected IntrospectedEntity introspectedEntity;

}
