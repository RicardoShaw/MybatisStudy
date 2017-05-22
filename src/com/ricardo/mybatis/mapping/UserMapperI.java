/**   
  * @Title: UserMapper.java 
  * @Package com.ricardo.mybatis.mapping 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月18日 下午4:21:11 
  * @version V1.0   
*/
package com.ricardo.mybatis.mapping;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ricardo.mybatis.domain.User;

/** 
 * @ClassName: UserMapper 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月18日 下午4:21:11 
 *  
 */
public interface UserMapperI {
	
	@Insert("insert into user(name,age) values(#{name},#{age})")
	public int add(User user);
	
	
	@Delete("delete from user where id=#{id}")
	public int deleteById(int id);
	
	@Update("update user set name=#{name},age=#{age} where id=#{id}")
	public int update(User user);
	
	@Select("select * from user")
	public List<User> getAll();
	
	@Select("select * from user where id=#{id}")
	public User getById(int id);
}
