package com.zy.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy.base.dao.NationalityDao;
import com.zy.base.entity.Nationality;
import com.zy.common.service.CommonService;

@Service
public class NationalityService extends CommonService<Nationality, String> {

	@Autowired
	private NationalityDao nationalityDao;
	
	@Autowired
	public void setNationalityDao(NationalityDao nationalityDao){
		super.setCommonDao(nationalityDao);
	}
	
	public List<Nationality> findNationalities(){
		return nationalityDao.findNationalities();
	}
	
}
