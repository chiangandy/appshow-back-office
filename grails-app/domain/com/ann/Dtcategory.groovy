package com.ann

//目錄數據模組
import java.util.Date;

class Dtcategory {
	
	String catname				// 主目錄名稱
	String catdesc				// 主目錄說明
	static hasMany = [ subcategory : Dtsubcategory ]
	
	
	Date dateCreated
	Date lastUpdated
	def beforeInsert = {
	   dateCreated = new Date()		// 創建日期
	}
	def beforeUpdate = {
	   lastUpdated = new Date()		// 更新日期
	}

    static constraints = {
		catname blank: false, nullable:false, maxSize: 30
		catdesc blank: true, nullable:true, maxSize: 120
    }
	
	static mapping = {
		catdesc type: 'text'
	}
	
	String toString()	{catname}
}
