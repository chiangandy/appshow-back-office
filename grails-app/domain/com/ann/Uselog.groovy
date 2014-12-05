package com.ann

// App log記錄 Entity
class Uselog {
	
	Integer appowner_id
	Integer vditems_id
	Integer category_id
	Integer subcategory_id
	String event_topic
	String event_content
	Date eventtime
	def beforeInsert = {
		eventtime = new Date()		// 創建日期
	 }
	
    static constraints = {
		appowner_id 	blank: true, 	nullable:true
 		vditems_id 		blank: true, 	nullable:true
		category_id 	blank: true, 	nullable:true
		subcategory_id 	blank: true, 	nullable:true
		event_topic 	blank: false, 	nullable:false, 	maxSize: 30
		event_topic 	blank: false, 	nullable:false, 	maxSize: 255		
   }
	String toString()	{event_topic}
}
