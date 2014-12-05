package com.ann

// 媒體項目數據模組
import java.util.Date;

class Vditems {
	String vditemname
	String youtubekey
	String vditemdesc
	String vditemtype
	String mediaurl
	String createuser
	String picfile		//uid = UUID.randomUUID().toString() uuid重新命名
	
	Mtgoapp appowner
	
	//mtgo.Dtsubcategory category
	static hasMany = [ dtsubcategory: com.ann.Dtsubcategory, vdcomments: com.ann.Vdcomments]
	//static belongsTo = [dtsubcategory: Dtsubcategory]

	
	Date dateCreated
	Date lastUpdated
	def beforeInsert = {
	   dateCreated = new Date()		// 創建日期
	}
	def beforeUpdate = {
	   lastUpdated = new Date()		// 更新日期
	}
	
    static constraints = {
		vditemname blank: false, nullable:false, maxSize: 50
		youtubekey	blank: true, nullable:true,  maxSize: 40
		vditemdesc blank: true,  nullable:true,  maxSize: 200
		vditemtype blank: true,  nullable:true,  maxSize: 20
		createuser blank: true,  nullable:true,  maxSize: 50
		mediaurl   blank: false, nullable:false, maxSize: 128
		picfile    blank: false, nullable:false, maxSize: 256
    }
	
	static mapping = {
		vditemdesc type: 'text'
	}
	
	String toString()	{vditemname}	//顯示媒體項目名稱
}
