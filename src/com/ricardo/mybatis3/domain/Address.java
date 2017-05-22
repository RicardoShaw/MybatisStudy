/**   
  * @Title: Address.java 
  * @Package com.ricardo.mybatis3.domain 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月21日 下午3:21:04 
  * @version V1.0   
*/
package com.ricardo.mybatis3.domain;

import org.apache.ibatis.type.Alias;

/** 
 * @ClassName: Address 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月21日 下午3:21:04 
 *  
 */
@Alias("mAddress")
public class Address {
	private int id;
	private String country;
	private String city;
	private String street;
	
	public Address(){}
	
	public Address(int id,String country,String city,String street){
		this.id = id;
		this.country= country;
		this.city = city;
		this.street = street;
	}
	
	public Address(String columnName){
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", country=" + country + ", city=" + city
				+ ", street=" + street + "]";
	}
	

}
