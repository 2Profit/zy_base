package com.zy.base.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.zy.common.entity.BaseEntity;

/**
 * 国籍
 * @author Administrator
 *
 */
@Entity
@Table(name="base_nationality")
public class Nationality extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8434593961393606542L;

	private String name;			//名称

	private Integer orderNo;		//排序号
	
	@Column(name="name", length=256)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="order_no")
	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	
}
