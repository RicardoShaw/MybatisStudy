/**   
  * @Title: ClazzMapperI.java 
  * @Package com.ricardo.mybatis.mapping 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月18日 下午7:40:11 
  * @version V1.0   
*/
package com.ricardo.mybatis.mapping;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.One;

import com.ricardo.mybatis.domain.Clazzes;

/** 
 * @ClassName: ClazzMapperI 
 * @Description: 注解形的映射配置，详细看ClazzMapper.xml文件
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月18日 下午7:40:11 
 *  
 */
public interface ClazzMapperI {
	@Select("select * from class c,teacher t where c.teacher_id=t.t_id and c.c_id=#{id}")
	@Results({@Result(id=true,property="id",column="c_id"),
			@Result(property="name",column="c_name"),
			@Result(property="teacher",column="t_id",one=@One(select="com.ricardo.mybatis.mapping.TeacherMapperI.getTeacher"))})
	public Clazzes findById(int id);

}
