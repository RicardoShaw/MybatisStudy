/**   
  * @Title: MyBatis3XmlTest.java 
  * @Package com.ricardo.mybatis3.test 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月19日 下午5:50:35 
  * @version V1.0   
*/
package com.ricardo.mybatis3.test;


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.ricardo.mybatis.util.MyBatisUtil;

/** 
 * @ClassName: MyBatis3XmlTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月19日 下午5:50:35 
 *  
 */
public class MyBatis3XmlTest {

	
	@Test
	public void test() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
	}

}
