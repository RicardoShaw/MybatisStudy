/**   
  * @Title: Phone.java 
  * @Package com.ricardo.mybatis3.type 
  * @Description: TODO(用一句话描述该文件做什么) 
  * @author RicardoShaw
  * @Email  Ricardo_Shaw@outlook.com   
  * @date 2017年5月19日 下午8:14:15 
  * @version V1.0   
*/
package com.ricardo.mybatis3.type;

/** 
 * @ClassName: Phone 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author RicardoShaw
 * @Email Ricardo_Shaw@outlook.com
 * @date 2017年5月19日 下午8:14:15 
 *  
 */
public class Phone {
	private String countryCode;
	private String stateCode;
	private String number;
	
	public Phone(){}
	
	public Phone(String countryCode,String stateCode,String number){
		this.countryCode = countryCode;
		this.stateCode = stateCode;
		this.number = number;
	}
	
	public Phone(String phoneNumber){
		if(phoneNumber != null){
			String[] parts = phoneNumber.split("-");
			if(parts.length>0)
				this.countryCode=parts[0];
			
			if(parts.length>1)
				this.stateCode=parts[1];
			
			if(parts.length>2)
				this.number=parts[2];
		}
	}

	@Override
	public String toString() {
		return countryCode + "-" + stateCode + "-" +number;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	
	
	
}
