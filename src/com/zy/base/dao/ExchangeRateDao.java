package com.zy.base.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.zy.base.entity.ExchangeRate;
import com.zy.common.dao.CommonDao;

public interface ExchangeRateDao extends CommonDao<ExchangeRate, String> {

	@Query("from ExchangeRate e where e.deleteFlag = 0 order by e.createDate desc ")
	public List<ExchangeRate> findExchangeRates();
	
}
