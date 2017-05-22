/**   
  * @Title: Tutor.java 
  * @Package com.ricardo.mybatis3.domain 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月19日 下午7:49:47 
  * @version V1.0   
*/
package com.ricardo.mybatis3.domain;


import java.util.List;

import org.apache.ibatis.type.Alias;

import com.ricardo.mybatis3.type.Phone;

/** 
 * @ClassName: Tutor 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月19日 下午7:49:47 
 *  
 */
@Alias("mTutor")
public class Tutor {
	private int id;
	private String name;
	private String email;
	private Phone phone;
	private Address address;
	private List<Course> courses;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Tutor [id=" + id + ", name=" + name + ", email=" + email
				+ ", phone=" + phone + ", address=" + address + ", courses="
				+ courses + "]";
	}
	
}
