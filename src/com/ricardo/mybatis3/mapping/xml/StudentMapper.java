/**   
  * @Title: StudentMapper.java 
  * @Package com.ricardo.mybatis3.mapping.annotation 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月19日 下午5:55:17 
  * @version V1.0   
*/
package com.ricardo.mybatis3.mapping.xml;

import java.util.List;


import com.ricardo.mybatis3.domain.Student;

/** 
 * @ClassName: StudentMapper 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月19日 下午5:55:17 
 *  
 */
/*
 *  配合相同路径下的StudentMapper.xml文件使用（XML+Interface）
 *  配合Annotation使用（Annotation+Interface）详见com/ricardo/mybatis3/annotation/StudentMapper.java
 */

public interface StudentMapper {
	
	public Student findStudentWithAddress(int id);
	public List<Student> getAllStudent();
	public List<Student> findAllStudentByNameEmail(String name,String email);
	public Student getStudent(int id);
	public void insertStudent(Student student);
}
