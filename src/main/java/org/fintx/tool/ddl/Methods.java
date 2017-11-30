package org.fintx.tool.ddl;



import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;


@Retention(RUNTIME)
public @interface Methods {
    public String[] value();
}
