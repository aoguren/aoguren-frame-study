package com.glxt.typehandlers;

import com.glxt.po.PhoneNumber;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Administrator on 2016/12/5.
 */
public class PhoneTypeHandler extends BaseTypeHandler<PhoneNumber>
{

    // region javaType to jdbcType
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, PhoneNumber parameter, JdbcType jdbcType) throws SQLException
    {
        ps.setString(i, parameter.getAsString());
    }

    // endregion

    // region jdbcType to javaType
    @Override
    public PhoneNumber getNullableResult(ResultSet rs, String columnName) throws SQLException
    {
        return new PhoneNumber(rs.getString(columnName));
    }

    @Override
    public PhoneNumber getNullableResult(ResultSet rs, int columnIndex) throws SQLException
    {
        return new PhoneNumber(rs.getString(columnIndex));
    }

    @Override
    public PhoneNumber getNullableResult(CallableStatement cs, int columnIndex) throws SQLException
    {
        return new PhoneNumber(cs.getString(columnIndex));
    }

    // endregion
}
