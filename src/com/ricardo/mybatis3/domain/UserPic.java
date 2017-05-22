/**   
  * @Title: UserPic.java 
  * @Package com.ricardo.mybatis3.domain 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月22日 上午11:02:15 
  * @version V1.0   
*/
package com.ricardo.mybatis3.domain;

import java.util.Arrays;

/** 
 * @ClassName: UserPic 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月22日 上午11:02:15 
 *  
 */
public class UserPic {
	private int id;
	private String name;
	private byte[] pic;
	private String bio;
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p> 
	 * @param i
	 * @param name2
	 * @param pic2
	 * @param bio2 
	*/
	public UserPic(int i, String name2, byte[] pic2, String bio2) {
		this.id = i;
		this.name = name2;
		this.pic = pic2;
		this.bio = bio2;
	}
	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p>  
	*/
	public UserPic() {
		// TODO Auto-generated constructor stub
	}
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
	public byte[] getPic() {
		return pic;
	}
	public void setPic(byte[] pic) {
		this.pic = pic;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	@Override
	public String toString() {
		return "UserPic [id=" + id + ", name=" + name + ", pic="
				+ Arrays.toString(pic) + ", bio=" + bio + "]";
	}
	
}
