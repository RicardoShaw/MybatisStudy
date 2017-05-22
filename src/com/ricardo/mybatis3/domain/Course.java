/**   
  * @Title: Course.java 
  * @Package com.ricardo.mybatis3.domain 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月21日 下午4:37:51 
  * @version V1.0   
*/
package com.ricardo.mybatis3.domain;

import java.sql.Date;

import org.apache.ibatis.type.Alias;

/** 
 * @ClassName: Course 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月21日 下午4:37:51 
 *  
 */
@Alias("mCourse")
public class Course {
	private int id;
	private String name;
	private String description;
	private Date start;
	private Date end;
	private int tutorId;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public int getTutorId() {
		return tutorId;
	}
	public void setTutorId(int tutorId) {
		this.tutorId = tutorId;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", description="
				+ description + ", start=" + start + ", end=" + end
				+ ", tutorId=" + tutorId + "]";
	}
	

}
