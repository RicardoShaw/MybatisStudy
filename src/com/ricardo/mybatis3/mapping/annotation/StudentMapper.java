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

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
	
	
	
	@Select("select * from students")
	@Results({
		@Result(id=true,property="id",column="stud_id"),
		@Result(property="name",column="name"),
		@Result(property="phone",column="phone"),
		@Result(property="gender",column="gender"),
		@Result(property="email",column="email"),
		@Result(property="date",column="dob"),
		@Result(property="address.id",column="add_id")
		
	})
	List<Student> getAllStudent1();
	
	Student getStudent(int id);
	
	@Insert("insert into students(name,gender,email,phone) values(#{name},#{gender},#{email},#{phone}")
	@Options(useGeneratedKeys=true,keyProperty="id")
	void insertStudent(Student student);
	
	
	@Delete("delete from students where stud_id=#{id}")
	void deleteStudent(int id);
	
	@Update("update students set name=#{name},email=#{email},gender=#{gender},phone=#{phone} where stud_id=#{id}")
	void updateStudent(Student student);
}
