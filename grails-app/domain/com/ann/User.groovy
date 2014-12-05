package com.ann

import java.util.Date;

class User {
    String realname					//使用者真實名稱
	String email					//電郵
    String username					//帳號名稱
    String passwordHash				//密碼(加密)
    String additionalInfo			//備註訊息
    Date dateCreated				//創立時間
	Date lastUpdated				//更新時間
	def beforeInsert = {
	   dateCreated = new Date()
	}
	def beforeUpdate = {
	   lastUpdated = new Date()
	}
	boolean passwordChangeRequiredOnNextLogon  = false		//強制換密碼
	boolean active = true									//帳號是否有效
    
    static hasMany = [ roles: Role, permissions: String ]

    static constraints = {
        realname(nullable: false)
        username(nullable: false, blank: false, unique: true)
		passwordHash(nullable: false, blank: false)
        email(email: true, unique:true,nullable: false)
        additionalInfo(nullable:true)
    }

    static mapping = {
		additionalInfo type: 'text'
		cache true
		cache roles : true
		cache permissions : true
	}

	String toString(){username +"-"+ realname}
}
