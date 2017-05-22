/**   
  * @Title: UserPicMapper.java 
  * @Package com.ricardo.mybatis3.mapping.xml 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月22日 上午11:12:48 
  * @version V1.0   
*/
package com.ricardo.mybatis3.mapping.xml;

import com.ricardo.mybatis3.domain.UserPic;

/** 
 * @ClassName: UserPicMapper 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月22日 上午11:12:48 
 *  
 */
public interface UserPicMapper {
	public void insertPic(UserPic userpic);
	public UserPic selectPic(int id);
}
