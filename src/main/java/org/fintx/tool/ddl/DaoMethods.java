package org.fintx.tool.ddl;



import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;


@Retention(RUNTIME)
public @interface DaoMethods {
    public DaoMethod[] value();
  }
