/**   
  * @Title: UserPicServiceTest.java 
  * @Package com.ricardo.mybatis3.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月22日 下午12:06:55 
  * @version V1.0   
*/
package com.ricardo.mybatis3.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ricardo.mybatis.util.MyBatisUtil;
import com.ricardo.mybatis3.domain.UserPic;
import com.ricardo.mybatis3.mapping.xml.UserPicMapper;
import com.ricardo.mybatis3.service.UserPicService;

/** 
 * @ClassName: UserPicServiceTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月22日 下午12:06:55 
 *  
 */
public class UserPicServiceTest {
	private static UserPicService userPicService;

	/** 
	 * @Title: setUp 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @throws java.lang.Exception    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	@Before
	public void setUp() throws Exception {
		userPicService = new  UserPicService();
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
		userPicService = null;
	}

	/**
	 * Test method for {@link com.ricardo.mybatis3.service.UserPicService#insertPic(com.ricardo.mybatis3.domain.UserPic)}.
	 */
	@Test
	public void testInsertPic() {
		byte[] pic = null;
		try(InputStream is = new FileInputStream(new File("E:\\logs\\a.jpg"))){
			pic = new byte[is.available()];
			is.read(pic);
		}catch(FileNotFoundException e){ 
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		String name = "UserName";
		String bio="put some lenghty bio here";
		UserPic userpic = new UserPic();
		userpic.setName(name);
		userpic.setBio(bio);
		userpic.setPic(pic);
		
		userPicService.insertPic(userpic);
		
	}

	/**
	 * Test method for {@link com.ricardo.mybatis3.service.UserPicService#selectPic(int)}.
	 */
	@Test
	public void testSelectPic() {
		UserPic userpic = 	userPicService.selectPic(1);
		byte[] pic = userpic.getPic();
		try(OutputStream os = new FileOutputStream(new File("e://logs//copy//a.jpg"))){
			os.write(pic);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
			
		catch (  IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
