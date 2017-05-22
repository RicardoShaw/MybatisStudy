/**   
  * @Title: CourseServiceTest.java 
  * @Package com.ricardo.mybatis3.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月21日 下午8:33:46 
  * @version V1.0   
*/
package com.ricardo.mybatis3.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ricardo.mybatis3.domain.Course;
import com.ricardo.mybatis3.service.CourseService;

/** 
 * @ClassName: CourseServiceTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月21日 下午8:33:46 
 *  
 */
public class CourseServiceTest {
	
	private static CourseService courseService;
	

	@BeforeClass
	public static void setup(){
		courseService = new CourseService();
	}
	@AfterClass
	public static void teardown(){
		courseService= null;
	}
	
	
	/**
	 * Test method for {@link com.ricardo.mybatis3.service.CourseService#searchCourse(java.util.Map)}.
	 */
	@Test
	public void testSearchCourse() {
		Map<String,Object> map = new HashMap();
		map.put("tutorId",2 );
		map.put("courseName", "%java%");
		
		List<Course> courses=courseService.searchCourse3(map);
	
		for(Course course:courses){
			System.out.println(course);
		}
	}
	
	@Test
	public void testSearchCourse5() {
		Map<String,Object> map = new HashMap();
		List<Integer> tutorIds=new ArrayList();
		tutorIds.add(1);
		tutorIds.add(2);
		
		List<Course> courses=courseService.searchCourse5(map);
	
		for(Course course:courses){
			System.out.println(course);
		}
	}

}
