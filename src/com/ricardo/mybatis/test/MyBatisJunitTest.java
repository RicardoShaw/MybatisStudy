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

import com.ricardo.mybatis.domain.Order;
import com.ricardo.mybatis.domain.User;
import com.ricardo.mybatis.util.MyBatisUtil;
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
	
	

	@Test
	public void testAdd() {
		 SqlSession sqlSession = MyBatisUtil.getSqlSession();
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
	     public void testUpdate(){
	         SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
	         /**
	          * 映射sql的标识字符串，
	          * com.ricardo.mybatis.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
	         * updateUser是update标签的id属性值，通过update标签的id属性值就可以找到要执行的SQL
	         */
	         String statement = "com.ricardo.mybatis.mapping.userMapper.updateUser";//映射sql的标识字符串
	         User user = new User();
	         user.setId(3);
	         user.setName("孤傲苍狼");
	         user.setAge(25);
	         //执行修改操作
	         int retResult = sqlSession.update(statement,user);
	        //使用SqlSession执行完SQL之后需要关闭SqlSession
	         sqlSession.close();
	         System.out.println(retResult);
	     }
	
	@Test
	public void testDelete(){
		 SqlSession sqlSession = MyBatisUtil.getSqlSession();
		String statement = "com.ricardo.mybatis.mapping.userMapper.deleteUser";
		int retResult = sqlSession.delete(statement, 11);
		sqlSession.commit();
		sqlSession.close();
		
		System.out.println(retResult);
	}
	
	 @Test
	 public void testGetAll(){
		 SqlSession sqlSession = MyBatisUtil.getSqlSession();
	          /**
	 73          * 映射sql的标识字符串，
	 74          * com.ricardo.mybatis.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
	 75          * getAllUsers是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
	 76          */
	          String statement = "com.ricardo.mybatis.mapping.userMapper.getAllUser";//映射sql的标识字符串
	          //执行查询操作，将查询结果自动封装成List<User>返回
	          List<User> lstUsers = sqlSession.selectList(statement);
	          //使用SqlSession执行完SQL之后需要关闭SqlSession
	          sqlSession.close();
	          logger.info(lstUsers.toString());
	          System.out.println(lstUsers);
	      } 
	 
	 
	 @Test
	    public void testGetOrderById(){
	        SqlSession sqlSession = MyBatisUtil.getSqlSession();
	        /**
	         * 映射sql的标识字符串，
	         * com.ricardo.mybatis.mapping.orderMapper是orderMapper.xml文件中mapper标签的namespace属性的值，
	         * getOrderById是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
	         */
	        String statement = "com.ricardo.mybatis.mapping.orderMapper.getOrderById";//映射sql的标识字符串
	        //执行查询操作，将查询结果自动封装成Order对象返回
	        Order order = sqlSession.selectOne(statement,1);//查询orders表中id为1的记录
	        //使用SqlSession执行完SQL之后需要关闭SqlSession
	        sqlSession.close();
	        System.out.println(order);//打印结果：null，也就是没有查询出相应的记录
	    }
	    
	    @Test
	    public void testGetOrderById2(){
	        SqlSession sqlSession = MyBatisUtil.getSqlSession();
	        /**
	         * 映射sql的标识字符串，
	         * com.ricardo.mybatis.mapping.orderMapper是orderMapper.xml文件中mapper标签的namespace属性的值，
	         * selectOrder是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
	         */
	        String statement = "com.ricardo.mybatis.mapping.orderMapper.selectOrder";//映射sql的标识字符串
	        //执行查询操作，将查询结果自动封装成Order对象返回
	        Order order = sqlSession.selectOne(statement,1);//查询orders表中id为1的记录
	        //使用SqlSession执行完SQL之后需要关闭SqlSession
	        sqlSession.close();
	        System.out.println(order);//打印结果：Order [id=1, orderNo=aaaa, price=23.0]
	    }
	    
	    @Test
	    public void testGetOrderById3(){
	        SqlSession sqlSession = MyBatisUtil.getSqlSession();
	        /**
	         * 映射sql的标识字符串，
	         * com.ricardo.mybatis.mapping.orderMapper是orderMapper.xml文件中mapper标签的namespace属性的值，
	         * selectOrderResultMap是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
	         */
	        String statement = "com.ricardo.mybatis.mapping.orderMapper.selectOrderResultMap";//映射sql的标识字符串
	        //执行查询操作，将查询结果自动封装成Order对象返回
	        Order order = sqlSession.selectOne(statement,1);//查询orders表中id为1的记录
	        //使用SqlSession执行完SQL之后需要关闭SqlSession
	        sqlSession.close();
	        System.out.println(order);//打印结果：Order [id=1, orderNo=aaaa, price=23.0]
	    }

}
