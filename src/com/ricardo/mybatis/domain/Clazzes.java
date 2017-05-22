/**   
  * @Title: Clazzes.java 
  * @Package com.ricardo.mybatis.domain 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月18日 下午7:33:25 
  * @version V1.0   
*/
package com.ricardo.mybatis.domain;

/** 
 * @ClassName: Clazzes 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月18日 下午7:33:25 
 *  
 */
public class Clazzes {
	private int id;
	private String name;
	private Teacher teacher;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Clazzes [id=" + id + ", name=" + name + ", teacher=" + teacher
				+ "]";
	}
	
	

}
