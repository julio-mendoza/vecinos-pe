package com.social.vecinos.security

import org.grails.databinding.BindingFormat

class UserRequest {

	static constraints = {
		userName(blank: false, unique: true)
		password(blank: false)
		firstName(blank: false)
		lastName(blank: false)
		emailAddress(blank: false, unique: true)
		birthDate(nullable: false)
		requestDate(nullable:false)
		isApproved(nullable: false)
		isCreated(nullable: false)
	}
	
	static mapping = {
		table("user_request")
		
		id(column: "user_request_id", generator: "identity")
		userName(column: "user_name")
		password(column: "password")
		firstName(column: "first_name")
		lastName(column: "last_name")
		emailAddress(column: "email_address")
		birthDate(column: "birth_date")
		requestDate(column: "request_date")
		isApproved(column: "is_approved")
		isCreated(column: "is_created")
		version(false)
	}
	
	static hasMany = [approvals: RequestApproval]
	
	UserRequest() {
		this.userName = ""
		this.password = ""
		this.firstName = ""
		this.lastName = ""
		this.emailAddress = ""
		this.birthDate = null
		this.requestDate = null
		this.isApproved = false
		this.isCreated = false
	}
	
	String userName
	String password
	String firstName
	String lastName
	String emailAddress
	Date birthDate
	Date requestDate
	Boolean isApproved
	Boolean isCreated
}
