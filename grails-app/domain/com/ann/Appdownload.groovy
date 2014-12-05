package com.ann

import java.util.Date;

// app推薦下載功能數據維護
class Appdownload {

	Mtgoapp mtgoapp
	String storekey
	String apptopic
	String apppublisher
	String appdesc
	String mediaurl
	String picfile					//廣告圖像
	String picfiled1				//廣告圖像
	String picfiled2				//廣告圖像
	String picfiled3				//廣告圖像
	Date datestart					//開始廣告時間
	Date datestop					//截止廣告時間時間
	String opuser
	int comrate						//給予星號等級 

	Date dateCreated				//創立時間
	Date lastUpdated				//更新時間
	def beforeInsert = {
	   dateCreated = new Date()		//即時時間取用
	}
	def beforeUpdate = {
	   lastUpdated = new Date()		//即時時間取用
	}
    static constraints = {
		apptopic		blank: false,  	nullable:false,	maxSize: 80
		apppublisher 	blank: true,  	nullable:true,  maxSize: 60
		appdesc			blank: true,  	nullable:true,  maxSize: 500
		storekey		blank: true,  	nullable:true,  maxSize: 40
		mediaurl   		blank: true, 	nullable:true, 	maxSize: 128
		picfile    		blank: false, 	nullable:false, maxSize: 256
		opuser   		blank: true, 	nullable:true, 	maxSize: 128
		picfiled1		blank: true, 	nullable:true, 	maxSize: 128
		picfiled2		blank: true, 	nullable:true, 	maxSize: 128
		picfiled3		blank: true, 	nullable:true, 	maxSize: 128
		comrate 		range: 0..5
    }
}
