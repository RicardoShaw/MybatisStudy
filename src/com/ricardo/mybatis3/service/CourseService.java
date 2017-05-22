/**   
  * @Title: CourseService.java 
  * @Package com.ricardo.mybatis3.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月21日 下午8:29:37 
  * @version V1.0   
*/
package com.ricardo.mybatis3.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.ricardo.mybatis.util.MyBatisUtil;
import com.ricardo.mybatis3.domain.Course;
import com.ricardo.mybatis3.mapping.xml.CourseMapper;

/** 
 * @ClassName: CourseService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月21日 下午8:29:37 
 *  
 */
public class CourseService {
	private static Logger logger = Logger.getLogger(CourseService.class);
	public List<Course> searchCourse(Map<String,Object> map){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		try {
			CourseMapper studentMapper = sqlSession
					.getMapper(CourseMapper.class);
			return studentMapper.searchCourse(map);
		} finally{
			sqlSession.close();
		}
	}
	
	public List<Course> searchCourse1(Map<String,Object> map){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		try {
			CourseMapper studentMapper = sqlSession
					.getMapper(CourseMapper.class);
			return studentMapper.searchCourse1(map);
		} finally{
			sqlSession.close();
		}
	}
	public List<Course> searchCourse2(Map<String,Object> map){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		try {
			CourseMapper studentMapper = sqlSession
					.getMapper(CourseMapper.class);
			return studentMapper.searchCourse2(map);
		} finally{
			sqlSession.close();
		}
	}
	
	public List<Course> searchCourse3(Map<String,Object> map){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		try {
			CourseMapper studentMapper = sqlSession
					.getMapper(CourseMapper.class);
			return studentMapper.searchCourse3(map);
		} finally{
			sqlSession.close();
		}
	}
	
	public List<Course> searchCourse4(Map<String,Object> map){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		try {
			CourseMapper studentMapper = sqlSession
					.getMapper(CourseMapper.class);
			return studentMapper.searchCourse4(map);
		} finally{
			sqlSession.close();
		}
	}
	
	public List<Course> searchCourse5(Map<String,Object> map){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		try {
			CourseMapper studentMapper = sqlSession
					.getMapper(CourseMapper.class);
			return studentMapper.searchCourse5(map);
		} finally{
			sqlSession.close();
		}
	}
}
