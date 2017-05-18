/**   
  * @Title: TeahcerMapperI.java 
  * @Package com.ricardo.mybatis.mapping 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月18日 下午8:42:31 
  * @version V1.0   
*/
package com.ricardo.mybatis.mapping;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.ricardo.mybatis.domain.Teacher;

/** 
 * @ClassName: TeahcerMapperI 
 * @Description: 注解形的mybatis映射，详细看ClazzMapperI文件 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月18日 下午8:42:31 
 *  
 */
public interface TeacherMapperI {
	@Select("select * from teacher where t_id=#{id}")
	@Results({@Result(id=true,property="id",column="t_id"),
		@Result(property="name",column="t_name")})
	public Teacher getTeacher(int id);
}
