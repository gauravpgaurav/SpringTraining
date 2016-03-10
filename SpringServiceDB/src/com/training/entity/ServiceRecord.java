package com.training.entity;

import org.springframework.stereotype.Component;

@Component("ServiceRecord")
public class ServiceRecord {

	private String serviceId;
	private String customerName;
	private long handPhone;
	private String productId;
	private String productType;
	private String serviceDesc;

	public ServiceRecord() {
		super();
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getHandPhone() {
		return handPhone;
	}

	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}

	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getServiceDesc() {
		return serviceDesc;
	}

	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}

	@Override
	public String toString() {
		return "ServiceRecord [serviceId=" + serviceId + ", customerName=" + customerName + ", handPhone=" + handPhone
				+ ", productId=" + productId + ", productType=" + productType + ", serviceDesc=" + serviceDesc + "]";
	}

	

}
