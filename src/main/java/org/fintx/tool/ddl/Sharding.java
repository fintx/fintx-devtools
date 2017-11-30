package org.fintx.tool.ddl;




public @interface Sharding {
    
   public  String[] columns();
   public  String type();

}
