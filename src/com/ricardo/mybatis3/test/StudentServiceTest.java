/**   
  * @Title: StudentServiceTest.java 
  * @Package com.ricardo.mybatis3.test 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月19日 下午6:07:47 
  * @version V1.0   
*/
package com.ricardo.mybatis3.test;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ricardo.mybatis3.domain.Address;
import com.ricardo.mybatis3.domain.Student;
import com.ricardo.mybatis3.service.StudentService;
import com.ricardo.mybatis3.type.Gender;
import com.ricardo.mybatis3.type.Phone;

/** 
 * @ClassName: StudentServiceTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月19日 下午6:07:47 
 *  
 */
public class StudentServiceTest {
	private static StudentService studentService;
	
	
	@BeforeClass
	public static void setup(){
		studentService = new StudentService();
	}
	@AfterClass
	public static void teardown(){
		studentService= null;
	}

	/**
	 * Test method for {@link com.ricardo.mybatis3.service.StudentService#getAllStudent()}.
	 */
	@Test
	public void testGetAllStudent() {
		List<Student> students=studentService.getAllStudent();
		Assert.assertNotNull(students);
		for(Student student:students){
			System.out.println(student);
		}
	}
	
	
	@Test
	public void testInsertStudent(){
		Student student = new Student();
		student.setName("ricardo");
		student.setEmail("206809449@qq.com");
		student.setPhone(new Phone("188","8888","8888"));
		student.setGender(Gender.MALE);
		studentService.insertStudent(student);
	}
	
	@Test
	public void testFindStudentWithAddress(){
		Student student = studentService.findStudentWithAddress(1);
		System.out.println(student);
	}
	
	

}
