package com.zy.base.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.zy.common.entity.BaseEntity;

/**
 * 手机黑名单
 * @author Jeff Xu
 *
 */
@Entity
@Table(name = "base_mobile_backlist")
public class BlackMobile extends BaseEntity{

	private static final long serialVersionUID = -3641254459529259169L;

}
