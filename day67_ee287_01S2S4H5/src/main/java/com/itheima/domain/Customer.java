package com.itheima.domain;

import java.io.Serializable;

/**
 * 客户的实体类
 * @author 86131
 *
 */
public class Customer implements Serializable {

	private Long custIdLong;
	private String custName;
	private String custSource;
	private String custIndustry;
	private String custLevel;
	private String custAddress;
	private String custPhone;
	public Long getCustIdLong() {
		return custIdLong;
	}
	public void setCustIdLong(Long custIdLong) {
		this.custIdLong = custIdLong;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustSource() {
		return custSource;
	}
	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}
	public String getCustIndustry() {
		return custIndustry;
	}
	public void setCustIndustry(String custIndustry) {
		this.custIndustry = custIndustry;
	}
	public String getCustLevel() {
		return custLevel;
	}
	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	
	@Override
	public String toString() {
		return "Customer [custIdLong=" + custIdLong + ", custName=" + custName + ", custSource=" + custSource
				+ ", custIndustry=" + custIndustry + ", custLevel=" + custLevel + ", custAddress=" + custAddress
				+ ", custPhone=" + custPhone + "]";
	}
	
}
