package org.fintx.tool.ddl;


import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;


@Retention(RUNTIME)
public @interface Transient {
    public String name();
    public String type();
    public int length();
    public int comment();
    public String[] uniqueGroups();
    public String[] indexGroups();
}
