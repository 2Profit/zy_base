package com.zy.base.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.zy.base.entity.Nationality;
import com.zy.common.dao.CommonDao;

public interface NationalityDao extends CommonDao<Nationality, String> {

	@Query("from Nationality n where n.deleteFlag = 0 order by n.orderNo ")
	public List<Nationality> findNationalities();
	
}
