package com.zy.base.dao;

import com.zy.base.entity.Notice;
import com.zy.common.entity.PageModel;

public interface NoticeCustomDao {

	PageModel<Notice> queryForPage(Notice queryDto,PageModel<Notice> pageModel);
	
	public void updateDeleteFlag(String[] ids,Integer isDelete);
}
