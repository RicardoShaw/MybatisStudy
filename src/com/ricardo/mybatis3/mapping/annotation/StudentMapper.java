/**   
  * @Title: StudentMapper.java 
  * @Package com.ricardo.mybatis3.mapping.annotation 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月19日 下午5:55:17 
  * @version V1.0   
*/
package com.ricardo.mybatis3.mapping.annotation;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.ricardo.mybatis3.domain.Student;

/** 
 * @ClassName: StudentMapper 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月19日 下午5:55:17 
 *  
 */
public interface StudentMapper {
	@Select("select * from students")
	@ResultMap("com.ricardo.mybatis3.mapping.xml.StudentMapper.studentResult")
	List<Student> getAllStudent();
	Student getStudent(int id);
	void insertStudent(Student student);
}
