package org.fintx.tool.mybatis;

import org.fintx.message.Message;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EnumTypeHandler<E extends Enum<E>&Message<?>> extends BaseTypeHandler<E> {
    private Class<E> type;  
    public EnumTypeHandler(Class<E> type) {  
        if (type == null)  
            throw new IllegalArgumentException("Type argument cannot be null");  
        this.type = type;  
    }  
    private E convert(String code) {  
        E[] objs = type.getEnumConstants(); 
        for (E e : objs) {  
            if (e.getCode().equals(code)) {  
                return e;  
            }  
        }  
        throw new IllegalArgumentException("Type argument "+code+" not define in Enum type");
    }  
    
    private String convert(E e) {  
        if(null==e) {
        	throw new IllegalArgumentException("Type argument cannot be null");  
        }else {
        	return e.getCode().toString();
        }
        
    }  
    
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, E parameter, JdbcType jdbcType) throws SQLException {
      if (jdbcType == null) {
        ps.setString(i, convert(parameter));
      } else {
        ps.setObject(i, convert(parameter), jdbcType.TYPE_CODE); // see r3589
      }
    }

    @Override
    public E getNullableResult(ResultSet rs, String columnName) throws SQLException {
      String s = rs.getString(columnName);
      return s == null ? null : convert(s);
    }

    @Override
    public E getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
      String s = rs.getString(columnIndex);
      return s == null ? null : convert(s);
    }

    @Override
    public E getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
      String s = cs.getString(columnIndex);
      return s == null ? null : convert(s);
    }

}
