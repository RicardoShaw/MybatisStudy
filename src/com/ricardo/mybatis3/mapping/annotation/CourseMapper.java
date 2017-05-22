/**   
  * @Title: CourseMapper.java 
  * @Package com.ricardo.mybatis3.mapping.annotation 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月22日 下午4:45:36 
  * @version V1.0   
*/
package com.ricardo.mybatis3.mapping.annotation;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.ricardo.mybatis3.domain.Course;

/** 
 * @ClassName: CourseMapper 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月22日 下午4:45:36 
 *  
 */
public interface CourseMapper {
	@Select("select * from course where tutor_id=#{id}")
	@Results({
		@Result(id=true,property="id",column="id"),
		@Result(property="name",column="name"),
		@Result(property="description",column="description"),
		@Result(property="start",column="start_date"),
		@Result(property="end",column="end_date"),
		@Result(property="tutorId",column="tutor_id"),
	})
	public List<Course> findCourseByTutorId(int id);
}
