/**   
  * @Title: PhoneTypeHandler.java 
  * @Package com.ricardo.mybatis3.typehandlers 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月19日 下午7:08:14 
  * @version V1.0   
*/
package com.ricardo.mybatis3.typehandlers;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import com.ricardo.mybatis3.type.Phone;

/** 
 * @ClassName: PhoneTypeHandler 
 * @Description: 自建Mybaties的TypeHandler
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月19日 下午7:08:14 
 *  
 */
public class PhoneTypeHandler extends BaseTypeHandler<Phone> {

	/* (非 Javadoc) 
	 * <p>Title: setNonNullParameter</p> 
	 * <p>Description: </p> 
	 * @param ps
	 * @param i
	 * @param parameter
	 * @param jdbcType
	 * @throws SQLException 
	 * @see org.apache.ibatis.type.BaseTypeHandler#setNonNullParameter(java.sql.PreparedStatement, int, java.lang.Object, org.apache.ibatis.type.JdbcType) 
	*/
	@Override
	public void setNonNullParameter(PreparedStatement ps, int i,
			Phone parameter, JdbcType jdbcType) throws SQLException {
		ps.setString(i, parameter.toString());
	}

	/* (非 Javadoc) 
	 * <p>Title: getNullableResult</p> 
	 * <p>Description: </p> 
	 * @param rs
	 * @param columnName
	 * @return
	 * @throws SQLException 
	 * @see org.apache.ibatis.type.BaseTypeHandler#getNullableResult(java.sql.ResultSet, java.lang.String) 
	*/
	@Override
	public Phone getNullableResult(ResultSet rs, String columnName)
			throws SQLException {
		// 这里使用getString（）而不用其他的是因为phone这个属性在数据库里面就是String类型的
		return new Phone(rs.getString(columnName));
	}

	/* (非 Javadoc) 
	 * <p>Title: getNullableResult</p> 
	 * <p>Description: </p> 
	 * @param rs
	 * @param columnIndex
	 * @return
	 * @throws SQLException 
	 * @see org.apache.ibatis.type.BaseTypeHandler#getNullableResult(java.sql.ResultSet, int) 
	*/
	@Override
	public Phone getNullableResult(ResultSet rs, int columnIndex)
			throws SQLException {
		// TODO Auto-generated method stub
		return new Phone(rs.getString(columnIndex));
	}

	/* (非 Javadoc) 
	 * <p>Title: getNullableResult</p> 
	 * <p>Description: </p> 
	 * @param cs
	 * @param columnIndex
	 * @return
	 * @throws SQLException 
	 * @see org.apache.ibatis.type.BaseTypeHandler#getNullableResult(java.sql.CallableStatement, int) 
	*/
	@Override
	public Phone getNullableResult(CallableStatement cs, int columnIndex)
			throws SQLException {
		// TODO Auto-generated method stub
		return new Phone(cs.getString(columnIndex));
	}

}
