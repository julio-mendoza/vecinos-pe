package com.social.vecinos.security

class UserRequest {

    static constraints = {
    }
	
	String userName
	String password
	String firstName
	String lastName
	String emailAddress
	Date birthDate
	String gender
	Date createdOn
	String createdBy
	Date modifiedOn
	String modifiedBy
}
