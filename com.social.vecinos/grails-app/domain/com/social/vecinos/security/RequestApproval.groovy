package com.social.vecinos.security

import java.util.Date;

class RequestApproval {

    static constraints = {
		welcomeMessage(blank:false)
		isApproved(nullable:false)
		approvalKey(blank:false)
		approvalDate(nullable:false) 
    }
	
	static mapping = {
		table("request_approval")
		
		id(column: "request_approval_id", generator: "identity")
		welcomeMessage(column: "welcome_message", sqlType: "varchar(4000)", length: 4000)
		isApproved(column: "is_approved")
		approvalKey(column: "approval_key", sqlType: "varchar(100)", length: 100)
		approvalDate(column: "approval_date")
		version(false)
	}
	
	static belongsTo = [userRequest: UserRequest]
	
	RequestApproval() {
		this.welcomeMessage = ""
		this.isApproved = false
		this.approvalKey = null
		this.approvalDate = null
	}
	
	String welcomeMessage
	Boolean isApproved
	String approvalKey
	Date approvalDate
}
