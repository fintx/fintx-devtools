package org.fintx.tool.ddl;




import org.fintx.scheduler.BatchExecution;
import org.fintx.scheduler.BatchInfo;
import org.fintx.scheduler.JobExecution;
import org.fintx.scheduler.JobInfo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;


//TODO 自动生成mybatisGeneratorConfig.xml
public class DdlGenerator {
    private FieldEntryRelation listRelation;
    private FieldEntryRelation singleRelation;

    public DdlGenerator() {
        this.listRelation = FieldEntryRelation.ONE2MANY;
        this.singleRelation = FieldEntryRelation.MANY2ONE;
    }

    public DdlGenerator(FieldEntryRelation listRelation, FieldEntryRelation singleRelation) {
        this.listRelation = listRelation;
        this.singleRelation = singleRelation;
    }

    public FieldEntryRelation getListRelation() {
        return listRelation;
    }

    public void setListRelation(FieldEntryRelation listRelation) {
        this.listRelation = listRelation;
    }

    public FieldEntryRelation getSingleRelation() {
        return singleRelation;
    }

    public void setSingleRelation(FieldEntryRelation singleRelation) {
        this.singleRelation = singleRelation;
    }

    /**
     * 根据表名称 和 实体属性 创建一张表, Collection类型属性创建关联关系表，其他复合类型创建关联ID
     * 
     * @param clazz 实体类
     */
    public String createDdl(final Class<?> clazz, final List<String> referTables, final String relatedIdColumn,final boolean sharding) {
        StringBuffer sb = new StringBuffer("");
        System.out.println(clazz.getName());
        String tableName = getSqlField(clazz.getSimpleName());
        sb.append("CREATE TABLE t_" + tableName + " (\n");
        // sb.append(" `id` int(11) NOT NULL AUTO_INCREMENT,");
        if (null != relatedIdColumn) {
            sb.append(relatedIdColumn + "  BIGINT UNSIGNED NOT NULL,\n");
        }
        Field field[] = clazz.getDeclaredFields();
        for (Field f : field) {
            if (f.getName().equalsIgnoreCase("id"))
                continue;
            Annotation annotation = f.getAnnotation(Column.class);
            // TODO support Annotation
            String type = f.getType().getName();
            if (type.equals("java.lang.String")) {
                sb.append(getSqlField(f.getName()) + " "+getStringType(f.getName())+" NOT NULL,\n");
            }else if(type.equals("char[]")) {
                sb.append(getSqlField(f.getName()) + " "+getStringType(f.getName())+" NOT NULL,\n");
            }else if(type.equals("char")||type.equals("java.lang.Character")) {
                sb.append(getSqlField(f.getName()) + " CHAR(1) NOT NULL,\n");
            } else if (type.equals("int") || type.equals("java.lang.Integer")) {// int
                sb.append(getSqlField(f.getName()) + " INTEGER NOT NULL,\n");
            } else if (type.equals("byte[]")) {
                sb.append(getSqlField(f.getName()) + " BLOB NOT NULL,\n");
            } else if (type.equals("float") || type.equals("java.lang.Float")) {// double
                sb.append(getSqlField(f.getName()) + " DECIMAL NOT NULL,\n");
            } else if (type.equals("double") || type.equals("java.lang.Double")) {// double
                sb.append(getSqlField(f.getName()) + " DECIMAL NOT NULL,\n");
            } else if (type.equals("long") || type.equals("java.lang.Long")) {// double
                sb.append(getSqlField(f.getName()) + " BIGINT NOT NULL,\n");
            } else if (type.equals("boolean") || type.equals("java.lang.Boolean")) {// double
                sb.append(getSqlField(f.getName()) + " TINYINT(1) NOT NULL,\n");
            } else if (type.equals("java.math.BigDecimal")) {// double
                sb.append(getSqlField(f.getName()) + " DECIMAL NOT NULL,\n");
            } else if (type.equals("java.sql.Timestamp")) {// double
                sb.append(getSqlField(f.getName()) + " TIMESTAMP NOT NULL,\n");
            } else if (type.equals("java.time.LocalDateTime")) {// double
                sb.append(getSqlField(f.getName()) + " TIMESTAMP NOT NULL,\n");
            } else if (type.equals("java.sql.Time")) {// double
                sb.append(getSqlField(f.getName()) + " TIME NOT NULL,\n");
            } else if (type.equals("java.sql.Date")) {// double
                sb.append(getSqlField(f.getName()) + " DATE NOT NULL,\n");
            }  else if (type.equals("java.time.LocalDate")) {// double
                sb.append(getSqlField(f.getName()) + " DATE NOT NULL,\n");
            }else if (type.equals("java.util.Date")) {// double
                sb.append(getSqlField(f.getName()) + " TIMESTAMP NOT NULL,\n");
            } else if (type.equals("byte") || type.equals("java.lang.Byte")) {// double
                sb.append(getSqlField(f.getName()) + " BYTE NOT NULL,\n");
            } else if (type.equals("short") || type.equals("java.lang.Short")) {// double
                sb.append(getSqlField(f.getName()) + " SMALLINT NOT NULL,\n");
            } else if (type.equals("java.math.BigInteger")) {// double
                sb.append(getSqlField(f.getName()) + " BIGINT NOT NULL,\n");
            } else if (type.equals("java.util.Calendar")) {// double
                sb.append(getSqlField(f.getName()) + " TIMESTAMP NOT NULL,\n");
            } else if (type.equals("java.sql.Clob")) {// double
                sb.append(getSqlField(f.getName()) + " TEXT NOT NULL,\n");
            } else if (type.equals("java.sql.Blob")) {// double
                sb.append(getSqlField(f.getName()) + " BLOB NOT NULL,\n");
            } else {
                try {
                    if (Iterable.class.isAssignableFrom(f.getType())) {
                        String entityName = getSqlField(f.getName());
                        if (entityName.endsWith("ies")) {
                            entityName = entityName.substring(0, entityName.length() - 3) + "y";
                        } else if (entityName.endsWith("s")) {
                            entityName = entityName.substring(0, entityName.length() - 1);
                        }
                        if (listRelation == FieldEntryRelation.MANY2MANY) {
                            referTables.add(
                                    "CREATE TABLE t_" + tableName + "_" + entityName + "_relation (\n" + tableName + "_id BIGINT UNSIGNED NOT NULL,\n"
                                            + entityName + "_id BIGINT UNSIGNED NOT NULL\n)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;");
                            referTables.add(
                                    createDdl((Class<?>) ((ParameterizedType) f.getGenericType()).getActualTypeArguments()[0], referTables, null,sharding));
                        } else if (listRelation == FieldEntryRelation.ONE2MANY) {
                            System.out.println(((ParameterizedType) f.getGenericType()).getActualTypeArguments()[0]);
                            // Type[] types=f.getType().getGenericInterfaces();
                            // System.out.println(((TypeVariable)((ParameterizedType)types[0]).getActualTypeArguments()[0]).getGenericDeclaration().getTypeParameters()[0]);
                            System.out.println(f.getType());
                            referTables.add(createDdl((Class<?>) ((ParameterizedType) f.getGenericType()).getActualTypeArguments()[0], referTables,
                                    tableName + "_id",sharding));
                        }
                    } else {
                        sb.append(getSqlField(f.getName()) + "_id BIGINT UNSIGNED NOT NULL,\n");
                        if (singleRelation == FieldEntryRelation.ONE2ONE) {
                            referTables.add(createDdl(f.getType(), referTables, tableName + "_id",sharding));
                        } else if (singleRelation == FieldEntryRelation.MANY2ONE) {
                            System.out.println("field:"+f.getName()+"refer type:"+f.getType());
                            referTables.add(createDdl(f.getType(), referTables, null,sharding));
                        }
                    }
                } catch (Throwable t) {
                    t.printStackTrace();
                    System.err.println("Missing field :" + f.getName() + " of type" + type);
                }
            }
        }
        if(sharding){
            sb.append("shard_type CHAR(2) NOT NULL DEFAULT '',\n");
            sb.append("shard_columns VARCHAR(96) NOT NULL DEFAULT '',\n");
            //扩/缩容之前的基数
            sb.append("shard_base INTEGER NOT NULL DEFAULT 0,\n");
        }
       
        sb.append("id BIGINT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,\n");
        sb.append("ctime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',\n");
        sb.append("mtime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'\n");
        sb.append(") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;\n\n");
        return sb.toString();
    }
    
    /**
     * 根据表名称 和 实体属性 创建一张表, Collection类型属性创建关联关系表，其他复合类型创建关联ID
     * 
     * @param clazz 实体类
     */
    public String createDao(final Class<?> clazz, final List<String> referTables, final String relatedIdColumn,final boolean sharding) {
        return null;
    }
    
    /**
     * 根据表名称 和 实体属性 创建一张表, Collection类型属性创建关联关系表，其他复合类型创建关联ID
     * 
     * @param clazz 实体类
     */
    public String createService(final Class<?> clazz, final List<String> referTables, final String relatedIdColumn,final boolean sharding) {
        return null;
    }
    
    /**
     * 根据表名称 和 实体属性 创建一张表, Collection类型属性创建关联关系表，其他复合类型创建关联ID
     * 
     * @param clazz 实体类
     */
    public String createMapper(final Class<?> clazz, final List<String> referTables, final String relatedIdColumn,final boolean sharding) {
        return null;
    }

    private static String getSqlField(String property) {
        StringBuffer sb = new StringBuffer("");
        char first = property.charAt(0);
        sb.append(Character.toLowerCase(first));
        for (int i = 1; i < property.length(); i++) {
            char next = property.charAt(i);
            if (Character.isUpperCase(next)) {
                sb.append("_" + Character.toLowerCase(next));
            } else {
                sb.append(next);
            }
        }
        return sb.toString();
    }
    
    private static String toSnakeCase(String otherCase) {
        StringBuffer sb = new StringBuffer("");
        char first = otherCase.charAt(0);
        sb.append(Character.toLowerCase(first));
        for (int i = 1; i < otherCase.length(); i++) {
            char next = otherCase.charAt(i);
            if (Character.isUpperCase(next)) {
                sb.append("_" + Character.toLowerCase(next));
            } else if(next=='-'){
                sb.append("_");
            }else{
                sb.append(next);
            }
        }
        return sb.toString();
    }
    
    private static String getTableName(String clazzSimpleName) {
        StringBuffer sb = new StringBuffer("");
        String tableName=toSnakeCase(clazzSimpleName);
        if(false){
          //TODO specify jou reg leg(ledger)  glg(general ledger)
        }
        return sb.toString();
    }
    
    private static String getStringType(String fieldName) {
        
        StringBuffer sb = new StringBuffer("");
       if(fieldName.endsWith("Date")){
           sb.append("VARCHAR(8)");
       }else if(fieldName.endsWith("Time")||"time".equals(fieldName)){
           sb.append("CHAR(14)");
       }else if(fieldName.endsWith("Type")||fieldName.endsWith("Mode")){
           sb.append("CHAR(2)");
       }else if(fieldName.endsWith("Class")||"clazz".equals(fieldName)){
           sb.append("VARCHAR(128)");
       }else if(fieldName.endsWith("Desc")||"desc".equals(fieldName)){
           sb.append("VARCHAR(64)");
       }else if(fieldName.endsWith("Url")||"url".equals(fieldName)||fieldName.endsWith("Endpoint")||"endpoint".equals(fieldName)){
           sb.append("VARCHAR(128)");
       }else if(fieldName.toLowerCase().endsWith("summary")||fieldName.toLowerCase().startsWith("summary")){
           sb.append("VARCHAR(128)");
       }else if(fieldName.toLowerCase().endsWith("remark")||fieldName.toLowerCase().startsWith("remark")){
           sb.append("VARCHAR(128)");
       }else if(fieldName.toLowerCase().endsWith("comment")||fieldName.toLowerCase().startsWith("comment")){
           sb.append("VARCHAR(256)");
       }else{
           sb.append("VARCHAR(32)");
       }
        return sb.toString();
    }
    
 private static String getColumnSpec(Field field) {
        
        StringBuffer sb = new StringBuffer("");
//        Annotation annotation
//       if(fieldName.endsWith("Date")){
//           sb.append("VARCHAR(8)");
//       }else if(fieldName.endsWith("Time")||"time".equals(fieldName)){
//           sb.append("CHAR(14)");
//       }else if(fieldName.endsWith("Type")||fieldName.endsWith("Mode")){
//           sb.append("CHAR(2)");
//       }else if(fieldName.endsWith("Class")||"clazz".equals(fieldName)){
//           sb.append("VARCHAR(128)");
//       }else if(fieldName.endsWith("Desc")||"desc".equals(fieldName)){
//           sb.append("VARCHAR(64)");
//       }else if(fieldName.endsWith("Url")||"url".equals(fieldName)){
//           sb.append("VARCHAR(128)");
//       }else if(fieldName.toLowerCase().endsWith("summary")||fieldName.toLowerCase().startsWith("summary")){
//           sb.append("VARCHAR(128)");
//       }else if(fieldName.toLowerCase().endsWith("remark")||fieldName.toLowerCase().startsWith("remark")){
//           sb.append("VARCHAR(128)");
//       }else if(fieldName.toLowerCase().endsWith("comment")||fieldName.toLowerCase().startsWith("comment")){
//           sb.append("VARCHAR(256)");
//       }else{
//           sb.append("VARCHAR(32)");
//       }
        return sb.toString();
    }
    
  //TODO 自动生成mybatisGeneratorConfig.xml
    public static void main(String[] args) throws Throwable {
//        if(args.length<2||args.length>3){
//            System.out.println("example:");
//        }
//        Class<?> entry=Class.forName(args[0]);
//        StringBuilder sb=new StringBuilder();
//        List<String> tables = new ArrayList<String>();
//        sb.append(new DdlGenerator().createDdl(entry, tables, null));
//        for (String table : tables) {
//            sb.append(table);
//        }
        try{
            StringBuilder sb=new StringBuilder();
            List<String> tables = new ArrayList<String>();
//            sb.append(new DdlGenerator().createDdl(Charging.class, tables, null,ture));
//            for (String table : tables) {
//                sb.append(table);
//            }
//            sb.append(new DdlGenerator().createDdl(ChargingJournal.class, tables, null,ture));
//            for (String table : tables) {
//                sb.append(table);
//            }
//            sb.append(new DdlGenerator().createDdl(Merchant.class, tables, null,ture));
//            for (String table : tables) {
//                sb.append(table);
//            }
//            sb.append(new DdlGenerator().createDdl(Signature.class, tables, null,ture));
//            for (String table : tables) {
//                sb.append(table);
//            }
//            sb.append(new DdlGenerator().createDdl(SignatureJournal.class, tables, null,ture));
//            for (String table : tables) {
//                sb.append(table);
//            }
//            sb.append(new DdlGenerator().createDdl(RequestControl.class, tables, null,ture));
//            for (String table : tables) {
//                sb.append(table);
//            } 
//            sb.append(new DdlGenerator().createDdl(BusinessControl.class, tables, null,ture));
//            for (String table : tables) {
//                sb.append(table);
//            }
            
            sb.append(new DdlGenerator().createDdl(JobInfo.class, tables, null,false));
            for (String table : tables) {
                sb.append(table);
            }
            sb.append(new DdlGenerator().createDdl(JobExecution.class, tables, null,false));
            for (String table : tables) {
                sb.append(table);
            }
            sb.append(new DdlGenerator().createDdl(BatchInfo.class, tables, null,false));
            for (String table : tables) {
                sb.append(table);
            }
            sb.append(new DdlGenerator().createDdl(BatchExecution.class, tables, null,false));
            for (String table : tables) {
                sb.append(table);
            }
            System.out.println(sb.toString());
        }catch(Throwable t){
            t.printStackTrace();
        }
       
       
    }

    public enum FieldEntryRelation {
        ONE2MANY, MANY2MANY, MANY2ONE, ONE2ONE
    }
}
