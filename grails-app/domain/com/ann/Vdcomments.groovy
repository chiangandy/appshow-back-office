package com.ann

// 評論項目數據模組
import java.util.Date;

class Vdcomments {
	
	String comtopic				//評論主題
	String comtext				//評論內容
	int comrate					//給予星號等級
	Vditems vditems			//歸屬媒體項目
	//Videoshow videoshow
	//Mtgoapp mtapp				//隸屬app
	
	Date dateCreated
	Date lastUpdated
	def beforeInsert = {
	   dateCreated = new Date()		// 創建日期
	}
	def beforeUpdate = {
	   lastUpdated = new Date()		// 更新日期
	}

    static constraints = {
		comtopic  	blank: false, nullable:false, maxSize: 140
		comtext  	blank: false, nullable:false, maxSize: 900
		comrate 	range: 0..5
    }
	
	static mapping = {
		comtext type: 'text'
		comrate defaultValue: 3
	}
	
	String toString()	{comtopic}	//顯示媒體項目名稱
}
