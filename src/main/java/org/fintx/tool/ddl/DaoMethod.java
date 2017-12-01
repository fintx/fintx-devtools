package org.fintx.tool.ddl;



import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;


@Retention(RUNTIME)
@Repeatable(DaoMethods.class)
public @interface DaoMethod {
    public String name();
    public Class<?> returnType();
    public Param[] params() default {};
    public String[] mapper() default {};

}
