/**   
  * @Title: TutorService.java 
  * @Package com.ricardo.mybatis3.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月22日 下午4:55:03 
  * @version V1.0   
*/
package com.ricardo.mybatis3.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.ricardo.mybatis.util.MyBatisUtil;
import com.ricardo.mybatis3.domain.Student;
import com.ricardo.mybatis3.domain.Tutor;
import com.ricardo.mybatis3.mapping.annotation.TutorMapper;
import com.ricardo.mybatis3.mapping.xml.StudentMapper;

/** 
 * @ClassName: TutorService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月22日 下午4:55:03 
 *  
 */
public class TutorService {
	private static Logger logger = Logger.getLogger(TutorService.class);
	public List<Tutor> findAllTutor(){
		
		try (SqlSession sqlSession = MyBatisUtil.getSqlSession(true)){
			TutorMapper mapper= sqlSession
					.getMapper(TutorMapper.class);
			return mapper.findAllTutor();
		} 
	}
}
