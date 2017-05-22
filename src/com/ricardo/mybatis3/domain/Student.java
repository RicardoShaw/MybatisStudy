/**   
  * @Title: Student.java 
  * @Package com.ricardo.mybatis3.domain 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月19日 下午5:41:06 
  * @version V1.0   
*/
package com.ricardo.mybatis3.domain;

import java.sql.Date;

import org.apache.ibatis.type.Alias;
import com.ricardo.mybatis3.type.Gender;
import com.ricardo.mybatis3.type.Phone;

/** 
 * @ClassName: Student 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月19日 下午5:41:06 
 *  
 */
/* 注解模式，也可以在mybatis-config.xml文件中配置*/
@Alias("mStudent")
public class Student {
	private int id;
	private String name;
	private Phone phone;
	private String email;
	private Address address;
	private Date date;
	private Gender gender;
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

	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone
				+ ", email=" + email + ", address=" + address + ", date="
				+ date + ", gender=" + gender + "]";
	}
	


}
