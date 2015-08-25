package com.zy.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy.base.dao.BlackMobileDao;
import com.zy.base.entity.BlackMobile;
import com.zy.common.service.CommonService;

@Service
public class BlackMobileService extends CommonService<BlackMobile,String>{

	@Autowired
	private BlackMobileDao blackMobileDao;

	@Autowired
	public void setBlackMobileDao(BlackMobileDao blackMobileDao) {
		super.setCommonDao(blackMobileDao);
	}	
	
}
