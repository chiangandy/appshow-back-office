package com.ann

import java.util.Date;

// 主頁面 廣告情報 Entity
class Dtpromote {

	String promote_topic
	String promotedesc
	
	String picfile
	Mtgoapp appowner
	Vditems vditems_id
	Date startdate
	Date enddate
	Boolean keep_active
	Integer	left_XY = 1
	Integer top_XY = 1
	Integer width_XY = 100
	Integer high_XY = 100
	
	Date dateCreated
	Date lastUpdated
	def beforeInsert = {
	   dateCreated = new Date()		// 創建日期
	}
	def beforeUpdate = {
	   lastUpdated = new Date()		// 更新日期
	}
	
    static constraints = {
		promote_topic 	blank: false, nullable:false, maxSize: 50
		promotedesc		blank: true,  nullable:true,  maxSize: 200
		picfile    		blank: true,  nullable:true,  maxSize: 256
		left_XY 		blank: false, nullable:false 
		top_XY 			blank: false, nullable:false
		width_XY 		blank: false, nullable:false
		high_XY 		blank: false, nullable:false
		startdate		blank: true,  nullable:true
		enddate			blank: true,  nullable:true
    }
	
	String toString()	{promote_topic}	
}
