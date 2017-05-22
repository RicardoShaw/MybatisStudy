/**   
  * @Title: TutorMapper.java 
  * @Package com.ricardo.mybatis3.mapping.annotation 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月22日 下午4:36:40 
  * @version V1.0   
*/
package com.ricardo.mybatis3.mapping.annotation;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.ricardo.mybatis3.domain.Tutor;

/** 
 * @ClassName: TutorMapper 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月22日 下午4:36:40 
 *  
 */
public interface TutorMapper {
	@Select("select * from tutor")
	@Results({
			@Result(id=true,property="id",column="tutor_id"),
			@Result(property="name",column="name"),
			@Result(property="phone",column="phone"),
			@Result(property="email",column="email"),
			@Result(property="address",column="add_id",one=@One(select="com.ricardo.mybatis3.mapping.annotation.AddressMapper.findAddress")),
			@Result(property="courses",column="tutor_id",many=@Many(select="com.ricardo.mybatis3.mapping.annotation.CourseMapper.findCourseByTutorId"))
	})
	public List<Tutor> findAllTutor();
	
	@SelectProvider(type=com.ricardo.mybatis3.mapping.dynamicsql.TutorDynaSqlProvider.class,method="findTutorByIdSql")
	public Tutor findTutorByIdSql(int tutorId);
	
	@SelectProvider(type=com.ricardo.mybatis3.mapping.dynamicsql.TutorDynaSqlProvider.class,method="findTutorByIdSql")
	public Tutor findTutorByIdSql();

}
