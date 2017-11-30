package org.fintx.tool.mybatis;



import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@MappedJdbcTypes({JdbcType.DATE,JdbcType.TIMESTAMP})
@MappedTypes({Date.class})
public class UTCDateTypeHandler implements TypeHandler<Date> {

    @Override
    public void setParameter(final PreparedStatement ps, final int i, final Date date, final JdbcType jdbcType) throws SQLException {
        if (date == null) {
            ps.setNull(i, jdbcType.TYPE_CODE);
        }
        else {
            Timestamp timestamp = new Timestamp(date.getTime());
            ps.setTimestamp(i, timestamp, getUTCCalendar());
        }
    }

    @Override
    public Date getResult(final ResultSet rs, final String columnName) throws SQLException {
        return rs.getTimestamp(columnName, getUTCCalendar());
    }

    @Override
    public Date getResult(final ResultSet rs, final int columnIndex) throws SQLException {
        return rs.getTimestamp(columnIndex, getUTCCalendar());
    }

    @Override
    public Date getResult(final CallableStatement cs, final int columnIndex) throws SQLException {
        return cs.getTimestamp(columnIndex, getUTCCalendar());
    }

    private static Calendar getUTCCalendar() {
        return Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    }
}
