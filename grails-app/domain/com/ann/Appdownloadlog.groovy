package com.ann

class Appdownloadlog {
	
	String eventname
	String eventdesc
	String storekey      			// app key in app store
	String deviceid      			// app device id 
	String openudid      			// openudid for tracking
	String ipaddress				// ip address for current device location
	String eventstatus              // noinstall,install,event,pay
	String checkstatusdetail		// specify for event status, can be special event position label
	Integer amount = 0				// for payment, can deliver how much pay for app
	String aux1
	String aux2
	String aux3
	String aux4
	String aux5   
	
	Date dateCreated				//創立時間
	Date lastUpdated				//更新時間
	def beforeInsert = {
	   dateCreated = new Date()		//即時時間取用
	}
	def beforeUpdate = {
	   lastUpdated = new Date()		//即時時間取用
	}
	
    static constraints = {
		eventname				blank: true,  	nullable:true,	maxSize: 80
		eventdesc				blank: true,  	nullable:true,	maxSize: 180
		storekey 				blank: true,  	nullable:true,	maxSize: 70
		deviceid  				blank: true,  	nullable:true,	maxSize: 40
		openudid 				blank: true,  	nullable:true,	maxSize: 40
		ipaddress				blank: true,  	nullable:true,	maxSize: 20
		eventstatus    			blank: true,  	nullable:true,	maxSize: 16       
		checkstatusdetail		blank: true,  	nullable:true,	maxSize: 100			
		aux1					blank: true,  	nullable:true,	maxSize: 80
		aux2					blank: true,  	nullable:true,	maxSize: 255
		aux3					blank: true,  	nullable:true,	maxSize: 255
		aux4					blank: true,  	nullable:true,	maxSize: 255
		aux5					blank: true,  	nullable:true,	maxSize: 255
    }
}
