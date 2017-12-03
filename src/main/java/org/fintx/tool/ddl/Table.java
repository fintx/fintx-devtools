package org.fintx.tool.ddl;


import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;


@Retention(RUNTIME)
public @interface Table {
    public String name() default "";
    public String catalog() default "";
    public String schema() default "";
    public String comment();
}
