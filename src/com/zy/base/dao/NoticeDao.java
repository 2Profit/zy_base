package com.zy.base.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.zy.base.entity.Notice;
import com.zy.common.dao.CommonDao;

public interface NoticeDao extends NoticeCustomDao,CommonDao<Notice,String>{

	@Query(" from Notice n where n.startDate <=now() and n.endDate>=now() and n.status = true and n.deleteFlag!=1 and n.noticeType = ?1 order by n.startDate ")
	List<Notice> getNoticeByStatusAndType(String noticeType);
	
	@Query(" from Notice n where n.startDate <=now() and n.endDate>=now() and n.status = true and n.deleteFlag!=1 order by n.startDate ")
	List<Notice> getAllNotice();
	
	@Query(" select count(1) from Notice n where n.startDate <=now() and n.endDate>=now() and n.deleteFlag!=1 and n.status = true and n.noticeType= ?1  ")
	int getNoticeNumbByType(String noticeType);
	
	@Query(" select count(1) from Notice n where n.startDate <=now() and n.endDate>=now() and n.deleteFlag!=1 and n.status = true ")
	int getActiveNoticeNumb();
	
}
