package org.fintx.tool.ddl;



import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;


class MyGenericClass {

    private static List<String> foo;
    public static void foo(List<String> foo) {
        MyGenericClass.foo=foo;
    }

    public static void main(String[] args) throws Exception,NoSuchFieldException {
        Method method = MyGenericClass.class.getMethod("foo", List.class);

        Type[] genericParameterTypes = method.getGenericParameterTypes();

        for (Type genericParameterType : genericParameterTypes) {
            if (genericParameterType instanceof ParameterizedType) {
                ParameterizedType aType = (ParameterizedType) genericParameterType;
                Type[] parameterArgTypes = aType.getActualTypeArguments();
                for (Type parameterArgType : parameterArgTypes) {
                    Class parameterArgClass = (Class) parameterArgType;
                    System.out.println("parameterArgClass = "
                            + parameterArgClass);
                }
            }
        }
        //Field should be public
        //Field field=MyClass.class.getField("foo");
        Field field= MyGenericClass.class.getDeclaredFields()[0];
        System.out.println((Class)((ParameterizedType)field.getGenericType()).getActualTypeArguments()[0]);
    }
    
   
}