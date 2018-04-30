package org.fintx.tool.ddl;



import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;


@Retention(RUNTIME)
@Repeatable(RepositoryMethods.class)
public @interface RepositoryMethod {
    public String name();
    public Class<?> returnType();
    public Param[] params() default {};
    public String[] mapper() default {};

}
