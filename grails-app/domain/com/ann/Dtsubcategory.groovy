package com.ann

//子目錄數據模組
import java.util.Date;

class Dtsubcategory {
	
	String subcatname			// 子目錄名稱
	String subcatdesc			// 子目錄說明
	
	Dtcategory dtcategory	// 主目錄歸屬項目
	static belongsTo = Vditems
	static hasMany = [vditems : com.ann.Vditems ]

	
	
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
		if (dtcategory==null) {
			subcatname
		} else {
			dtcategory.catname + '>' + subcatname
		}
		
	}
}
