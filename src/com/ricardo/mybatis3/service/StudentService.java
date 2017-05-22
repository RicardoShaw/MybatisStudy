/**   
  * @Title: StudentService.java 
  * @Package com.ricardo.mybatis3.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月19日 下午5:59:11 
  * @version V1.0   
*/
package com.ricardo.mybatis3.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.ricardo.mybatis.util.MyBatisUtil;
import com.ricardo.mybatis3.domain.Student;
import com.ricardo.mybatis3.mapping.xml.StudentMapper;

/** 
 * @ClassName: StudentService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月19日 下午5:59:11 
 *  
 */
public class StudentService {
	private static Logger logger = Logger.getLogger(StudentService.class);
	public List<Student> getAllStudent(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		try {
			StudentMapper studentMapper = sqlSession
					.getMapper(StudentMapper.class);
			return studentMapper.getAllStudent();
		} finally{
			sqlSession.close();
		}
	}
	
	public void insertStudent(Student student){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		try {
			StudentMapper studentMapper = sqlSession
					.getMapper(StudentMapper.class);
			studentMapper.insertStudent(student);
		} finally{
			sqlSession.close();
		}
	}
	
	
	public Student findStudentWithAddress(int id){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		try {
			StudentMapper studentMapper = sqlSession
					.getMapper(StudentMapper.class);
			return studentMapper.findStudentWithAddress(id);
		}finally{
			sqlSession.close();
		}
	}
}
