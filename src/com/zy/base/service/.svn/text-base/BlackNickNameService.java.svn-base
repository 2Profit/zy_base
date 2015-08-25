package com.zy.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy.base.dao.BlackNickNameDao;
import com.zy.base.entity.BlackNickName;
import com.zy.common.service.CommonService;

@Service
public class BlackNickNameService  extends CommonService<BlackNickName,String>{

	@Autowired
	private BlackNickNameDao blackNickNameDao;

	@Autowired
	public void setBlackNickNameDao(BlackNickNameDao blackNickNameDao) {
		super.setCommonDao(blackNickNameDao);
	}
	
}
