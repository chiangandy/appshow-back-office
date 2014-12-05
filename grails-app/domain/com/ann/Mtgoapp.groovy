package com.ann

//隸屬App軟技術據模組
import java.util.Date;

class Mtgoapp {

	String appname
	String picfile		// app圖示
	String appdesc
	String dtversion
	static hasMany = [vditems : com.ann.Vditems, appsubcategory : com.ann.Appsubcategory, appdownload: com.ann.Appdownload ]
	
	Date dateCreated
	Date lastUpdated
	def beforeInsert = {
	   dateCreated = new Date()		// 創建日期
	}
	def beforeUpdate = {
	   lastUpdated = new Date()		// 更新日期
	}
	
    static constraints = {
		appname 	blank: false, nullable:false, maxSize: 30
		appdesc 	blank: true, nullable:true, maxSize: 512
		picfile    	blank: false, nullable:false, maxSize: 256
		dtversion 	blank: true
    }
	
	String toString()	{appname}	//顯示app項目名稱
}
