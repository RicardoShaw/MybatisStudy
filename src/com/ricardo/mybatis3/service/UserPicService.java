/**   
  * @Title: UserPicService.java 
  * @Package com.ricardo.mybatis3.service 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月22日 上午11:13:50 
  * @version V1.0   
*/
package com.ricardo.mybatis3.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.ricardo.mybatis.util.MyBatisUtil;
import com.ricardo.mybatis3.domain.UserPic;
import com.ricardo.mybatis3.mapping.xml.UserPicMapper;

/** 
 * @ClassName: UserPicService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月22日 上午11:13:50 
 *  
 */
public class UserPicService {
	private static Logger logger = Logger.getLogger(UserPicService.class);
	public void insertPic(UserPic userpic){
		try(SqlSession sqlSession = MyBatisUtil.getSqlSession(true)){
			UserPicMapper mapper = sqlSession.getMapper(UserPicMapper.class);
			mapper.insertPic(userpic);
		}
	}
	
	public UserPic selectPic(int id){
		try(SqlSession sqlSession = MyBatisUtil.getSqlSession(true)){
			UserPicMapper mapper = sqlSession.getMapper(UserPicMapper.class);
			return mapper.selectPic(id);
		}
		
	}


}
