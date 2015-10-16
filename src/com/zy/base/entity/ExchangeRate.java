package com.zy.base.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.zy.common.entity.BaseEntity;

/**
 * 汇率
 * @author Administrator
 *
 */
@Entity
@Table(name="base_exchange_rate")
public class ExchangeRate extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5998187215490857470L;

	private double usd;		//美元
	
	private double hkd;		//港元
	
	private double rmb;		//人民币
	
	private int coin;		//虚拟币

	public double getUsd() {
		return usd;
	}

	public void setUsd(double usd) {
		this.usd = usd;
	}

	public double getHkd() {
		return hkd;
	}

	public void setHkd(double hkd) {
		this.hkd = hkd;
	}

	public double getRmb() {
		return rmb;
	}

	public void setRmb(double rmb) {
		this.rmb = rmb;
	}

	public int getCoin() {
		return coin;
	}

	public void setCoin(int coin) {
		this.coin = coin;
	}
	
}
