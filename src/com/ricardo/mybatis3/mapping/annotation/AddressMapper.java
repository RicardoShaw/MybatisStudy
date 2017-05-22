/**   
  * @Title: AddressMapper.java 
  * @Package com.ricardo.mybatis3.mapping.annotation 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月22日 下午4:42:27 
  * @version V1.0   
*/
package com.ricardo.mybatis3.mapping.annotation;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.ricardo.mybatis3.domain.Address;

/** 
 * @ClassName: AddressMapper 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月22日 下午4:42:27 
 *  
 */
public interface AddressMapper {
	@Select("select * from addresses where add_id=#{id}")
	@Results({
		@Result(id=true,property="id",column="add_id"),
		@Result(property="country",column="country"),
		@Result(property="city",column="city"),
		@Result(property="street",column="street")
	})
	public Address findAddress(int id);
}
