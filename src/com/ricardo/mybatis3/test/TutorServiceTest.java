/**   
  * @Title: TutorServiceTest.java 
  * @Package com.ricardo.mybatis3.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月22日 下午4:56:56 
  * @version V1.0   
*/
package com.ricardo.mybatis3.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ricardo.mybatis3.domain.Tutor;
import com.ricardo.mybatis3.service.TutorService;

/** 
 * @ClassName: TutorServiceTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月22日 下午4:56:56 
 *  
 */
public class TutorServiceTest {
	private static TutorService tutorService;
	/** 
	 * @Title: setUp 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @throws java.lang.Exception    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	@Before
	public void setUp() throws Exception {
		tutorService = new TutorService();
	}

	/** 
	 * @Title: tearDown 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @throws java.lang.Exception    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	@After
	public void tearDown() throws Exception {
		tutorService = null;
	}

	/**
	 * Test method for {@link com.ricardo.mybatis3.service.TutorService#getAllStudent()}.
	 */
	@Test
	public void testGetAllStudent() {
		List<Tutor> tutors = tutorService.findAllTutor();
		for(Tutor tutor:tutors){
			System.out.println(tutor);
		}
	}

}
