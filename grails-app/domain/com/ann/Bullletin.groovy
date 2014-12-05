package com.ann

import java.util.Date;

// 公告欄訊息 數據Entity
class Bullletin {

	String bulletin_topic
	String bulletin_content
	String picfile
	Date startdate
	Date enddate
	Boolean keep
	Boolean gotop
	
	Date dateCreated
	Date lastUpdated
	def beforeInsert = {
	   dateCreated = new Date()		// 創建日期
	}
	def beforeUpdate = {
	   lastUpdated = new Date()		// 更新日期
	}
	
    static constraints = {
		bulletin_topic 		blank: false, nullable:false, maxSize: 60
		bulletin_content 	blank: false, nullable:false, maxSize: 1024
		picfile    			blank: true,  nullable:true,  maxSize: 256
		startdate			blank: true,  nullable:true
		enddate				blank: true,  nullable:true
    }
	
	static mapping = {
		bulletin_content type: 'text'
	}
	
	String toString()	{bulletin_topic}
}
