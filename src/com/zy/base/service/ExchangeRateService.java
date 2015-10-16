package com.zy.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy.base.dao.ExchangeRateDao;
import com.zy.base.entity.ExchangeRate;
import com.zy.common.service.CommonService;

@Service
public class ExchangeRateService extends CommonService<ExchangeRate, String>{

	@Autowired
	private ExchangeRateDao exchangeRateDao;
	
	@Autowired
	public void setExchangeRateDao(ExchangeRateDao exchangeRateDao){
		super.setCommonDao(exchangeRateDao);
	}
	
	public List<ExchangeRate> findExchangeRates(){
		return exchangeRateDao.findExchangeRates();
	}
	
	public ExchangeRate findCurrentExchangeRate(){
		List<ExchangeRate> exchangeRates = findExchangeRates();
		if(exchangeRates != null && !exchangeRates.isEmpty()){
			return exchangeRates.get(0);
		}
		return null;
	}
	
}
