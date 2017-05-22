/**   
  * @Title: CourseMapper.java 
  * @Package com.ricardo.mybatis3.mapping.xml 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月21日 下午8:30:21 
  * @version V1.0   
*/
package com.ricardo.mybatis3.mapping.xml;

import java.util.List;
import java.util.Map;

import com.ricardo.mybatis3.domain.Course;

/** 
 * @ClassName: CourseMapper 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月21日 下午8:30:21 
 *  
 */
public interface CourseMapper {

	public List<Course> searchCourse(Map<String,Object> map);
	public List<Course> searchCourse1(Map<String,Object> map);
	public List<Course> searchCourse2(Map<String,Object> map);
	public List<Course> searchCourse3(Map<String,Object> map);
	public List<Course> searchCourse4(Map<String,Object> map);
	public List<Course> searchCourse5(Map<String,Object> map);
}
