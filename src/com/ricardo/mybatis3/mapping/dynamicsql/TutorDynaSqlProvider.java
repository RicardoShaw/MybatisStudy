/**   
  * @Title: TutorDynaSqlProvider.java 
  * @Package com.ricardo.mybatis3.mapping.dynamicsql 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月22日 下午6:39:25 
  * @version V1.0   
*/
package com.ricardo.mybatis3.mapping.dynamicsql;

import org.apache.ibatis.jdbc.SQL;

/** 
 * @ClassName: TutorDynaSqlProvider 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月22日 下午6:39:25 
 *  
 */
public class TutorDynaSqlProvider {
	public String findTutorByIdSql(final int tutorId){
//		return "select * from tutor where tutor_id="+tutorId;
		return new SQL(){{
				SELECT("*");
				FROM("tutor");
				WHERE("tutor_id="+tutorId);
			}
		}.toString();
	}
	
	
	public String findTutorByIdSql(){
		return new SQL(){{
			SELECT("*");
			FROM("tutor");
			WHERE("tutor_id=#{tutorId}");
		}
	}.toString();
	}
	

}
