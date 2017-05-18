/**   
  * @Title: MyBatisJunitTest.java 
  * @Package com.ricardo.mybatis.test 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月18日 下午3:10:50 
  * @version V1.0   
*/
package com.ricardo.mybatis.test;



import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.ricardo.mybatis.domain.User;
import com.sun.istack.internal.logging.Logger;

/** 
 * @ClassName: MyBatisJunitTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月18日 下午3:10:50 
 *  
 */
public class MyBatisJunitTest {
	
	private static Logger logger = Logger.getLogger(MyBatisJunitTest.class);
	
	public SqlSession getSqlSession(){
        String resource = "conf.xml";
        //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream is = MyBatisTest.class.getClassLoader().getResourceAsStream(resource);
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        
        return sessionFactory.openSession();
	}
	

	@Test
	public void testAdd() {
		 SqlSession sqlSession = getSqlSession();
		 String statement ="com.ricardo.mybatis.mapping.userMapper.addUser";
		 User user = new User();
		 user.setName("大龙");
		 user.setAge(100);
		 int retResult = sqlSession.insert(statement,user);
		 sqlSession.commit();
		 sqlSession.close();
		System.out.println(retResult);	 
	}
	
	@Test
	public void testDelete(){
		SqlSession sqlSession = getSqlSession();
		String statement = "com.ricardo.mybatis.mapping.userMapper.deleteUser";
		int retResult = sqlSession.delete(statement, 11);
		sqlSession.commit();
		sqlSession.close();
		
		System.out.println(retResult);
	}
	
	 @Test
	 public void testGetAll(){
	          SqlSession sqlSession = getSqlSession();
	          /**
	 73          * 映射sql的标识字符串，
	 74          * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
	 75          * getAllUsers是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
	 76          */
	          String statement = "com.ricardo.mybatis.mapping.userMapper.getAllUser";//映射sql的标识字符串
	          //执行查询操作，将查询结果自动封装成List<User>返回
	          List<User> lstUsers = sqlSession.selectList(statement);
	          //使用SqlSession执行完SQL之后需要关闭SqlSession
	          sqlSession.close();
	          logger.info(statement);
	         System.out.println(lstUsers);
	      } 

}
