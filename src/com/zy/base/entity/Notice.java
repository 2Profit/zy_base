package com.zy.base.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.zy.common.entity.BaseEntity;

/**
 *	公告
 * @author Jeff Xu
 *
 */
@Entity
@Table(name = "base_notice")
public class Notice extends BaseEntity{

	private static final long serialVersionUID = 7626772414167292630L;

	private String language;//语言类型（0-简体，1-繁体）
	private String title;//标题
	private String applyType;//应用平台类型（0-交易平台，1-前台系统，2-通用）
	private String displayType;//弹窗类型（0-弹窗，1-通知栏，2-通用）
	private String noticeType;//公告类型（0-重要公告，1-优惠通知）
	private String photoUrl;//图片
	private String content;//内文
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date startDate;//有效期开始日期
	private Date endDate;// 有效期截止日期
	private Boolean status;// 是否有效
	
	
	//用于查询结束时间
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date endDateFrom;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date endDateTo;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date startDateFrom;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date startDateTo;
	private String[] ids;//用于传递id数组
	private Integer imageWidth;//图片宽
	private Integer imageHeight;//图片高
	
	
	@Column(length=2)
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Column(length=64)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Column(length=2)
	public String getApplyType() {
		return applyType;
	}
	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}
	@Column(length=2)
	public String getDisplayType() {
		return displayType;
	}
	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}
	@Column(length=2)
	public String getNoticeType() {
		return noticeType;
	}
	public void setNoticeType(String noticeType) {
		this.noticeType = noticeType;
	}
	@Column(length=128)
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	@Column(length=1024)
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	
	
	@javax.persistence.Transient
	public Date getEndDateFrom() {
		return endDateFrom;
	}
	public void setEndDateFrom(Date endDateFrom) {
		this.endDateFrom = endDateFrom;
	}
	@javax.persistence.Transient
	public Date getEndDateTo() {
		return endDateTo;
	}
	public void setEndDateTo(Date endDateTo) {
		this.endDateTo = endDateTo;
	}
	@javax.persistence.Transient
	public Date getStartDateFrom() {
		return startDateFrom;
	}
	public void setStartDateFrom(Date startDateFrom) {
		this.startDateFrom = startDateFrom;
	}
	@javax.persistence.Transient
	public Date getStartDateTo() {
		return startDateTo;
	}
	public void setStartDateTo(Date startDateTo) {
		this.startDateTo = startDateTo;
	}
	@javax.persistence.Transient
	public String[] getIds() {
		return ids;
	}
	public void setIds(String[] ids) {
		this.ids = ids;
	}
	@javax.persistence.Transient
	public Integer getImageWidth() {
		return imageWidth;
	}
	public void setImageWidth(Integer imageWidth) {
		this.imageWidth = imageWidth;
	}
	@javax.persistence.Transient
	public Integer getImageHeight() {
		return imageHeight;
	}
	public void setImageHeight(Integer imageHeight) {
		this.imageHeight = imageHeight;
	}

	
	
	
}
