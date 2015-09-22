package com.zy.base.dao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.zy.base.entity.Notice;
import com.zy.common.dao.CustomBaseSqlDaoImpl;
import com.zy.common.entity.PageModel;

public class NoticeDaoImpl extends CustomBaseSqlDaoImpl implements NoticeCustomDao{
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@SuppressWarnings("unchecked")
	@Override
	public PageModel<Notice> queryForPage(Notice queryDto,PageModel<Notice> pageModel) {
		
		StringBuilder hql = new StringBuilder("select l from Notice l where 1=1 ");
		Map<String,Object> params = new HashMap<String,Object>();
		
		if(StringUtils.isNotBlank(queryDto.getId())){
			hql.append(" and l.id = :id ");
			params.put("id", queryDto.getId());
		}
		if(StringUtils.isNotBlank(queryDto.getApplyType())){
			hql.append(" and l.applyType = :applyType ");
			params.put("applyType", queryDto.getApplyType());
		}
		if(StringUtils.isNotBlank(queryDto.getNoticeType())){
			hql.append(" and l.noticeType = :noticeType ");
			params.put("noticeType", queryDto.getNoticeType());
		}
		if(StringUtils.isNotBlank(queryDto.getTitle())){
			hql.append(" and l.title like :title ");
			params.put("title", "%"+queryDto.getTitle()+"%");
		}
		if(queryDto.getStatus()!=null){
			hql.append(" and l.status = :status ");
			params.put("status", queryDto.getStatus());
		}
		
		if(queryDto.getEndDateFrom()!=null){
			hql.append(" and l.endDate >= :endDateFrom ");
			params.put("endDateFrom", queryDto.getEndDateFrom());
		}
		if(queryDto.getEndDateTo()!=null){
			hql.append(" and l.endDate = :endDateTo ");
			params.put("endDateTo", queryDto.getEndDateTo());
		}
		if(queryDto.getStartDateFrom()!=null){
			hql.append(" and l.startDate >= :startDateFrom ");
			params.put("startDateFrom", queryDto.getStartDateFrom());
		}
		if(queryDto.getStartDateTo()!=null){
			hql.append(" and l.startDate = :startDateTo ");
			params.put("startDateTo", queryDto.getStartDateTo());
		}
		
		if(queryDto.getDeleteFlag()!=null){
			hql.append(" and l.deleteFlag = :deleteFlag ");
			params.put("deleteFlag", queryDto.getDeleteFlag());
		}
		
		hql.append(" order by l.updateDate desc ");
		
		return this.queryForPageWithParams(hql.toString(),params,pageModel.getCurrentPage(), pageModel.getPageSize());
	}
	
	@Override
	public void updateDeleteFlag(String[] ids,Integer isDelete){
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("isDelete", isDelete);
		params.put("ids", Arrays.asList(ids));
		namedParameterJdbcTemplate.update("update base_notice set delete_flag = :isDelete, update_date = now() where id in (:ids) ", params);
	}
}
