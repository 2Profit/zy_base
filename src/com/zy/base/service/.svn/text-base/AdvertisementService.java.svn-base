package com.zy.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy.base.dao.AdvertisementDao;
import com.zy.base.entity.Advertisement;
import com.zy.common.service.CommonService;

@Service
public class AdvertisementService extends CommonService<Advertisement,String>{

	@Autowired
	private AdvertisementDao advertisementDao;

	@Autowired
	public void setAdvertisementDao(AdvertisementDao advertisementDao) {
		super.setCommonDao(advertisementDao);
	}
	
}
