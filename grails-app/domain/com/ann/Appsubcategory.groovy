package com.ann

import java.util.Date;

class Appsubcategory {
	
	String subcatname			// 子目錄名稱
	String subcatdesc			// 子目錄說明
	
	Appcategory appcategory	// 主目錄歸屬項目
	
	static belongsTo = Mtgoapp
	static hasMany = [mtgoapp : com.ann.Mtgoapp ]
	
	Date dateCreated
	Date lastUpdated
	def beforeInsert = {
	   dateCreated = new Date()		// 創建日期
	}
	def beforeUpdate = {
	   lastUpdated = new Date()		// 更新日期
	}
	
	static constraints = {
		subcatname blank: false, nullable:false, maxSize: 30
		subcatdesc blank: true, nullable:true, maxSize: 120
	}
	
	static mapping = {
		subcatdesc type: 'text'
	}
	
	String toString(){
		if (appcategory==null) {
			subcatname
		} else {
			appcategory.catname + '>' + subcatname
		}
		
	}

}
