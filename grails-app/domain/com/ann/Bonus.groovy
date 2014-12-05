package com.ann

import java.util.Date;

class Bonus {
	
	User user
	Integer	bonus = 0
	String eventtopic			//事件事由
	String eventdesc			//詳細描述
	String eventfrom			// bonus event 創立來源，手機操作或是後台設定的
	boolean activeevent = true	//交易是否有效
	Date dateCreated			//創建時間
	Date lastUpdated			//更新時間
	def beforeInsert = {
	   dateCreated = new Date()
	}
	def beforeUpdate = {
	   lastUpdated = new Date()
	}
	
    static constraints = {
		eventtopic		nullable: false,	maxSize: 50
		eventdesc		nullable: true
		eventfrom		nullable: true
		bonus			range: -9999..9999
		
    }
	
	String toString(){user?.username+"-"+eventtopic+"-"+bonus.toString()}
}
