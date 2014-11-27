package com.social.vecinos.security

import grails.transaction.Transactional

@Transactional
class UserRequestService {

	def retrieveAllRequests(rowIndex, numRows) {
		def query = UserRequest.createCriteria()
		def result = query.list {
			order("requestDate", "desc")
			order("id", "desc")
			if (rowIndex) firstResult(rowIndex)
			maxResults(numRows ?: 50)
		}
		[data: result, total: UserRequest.count()]
	}
	
	def saveUserRequest(UserRequest userRequest) {
		userRequest.isApproved = false
		userRequest.isCreated = false
		
		
		if(userRequest.save()) {
			userRequest
		} else {
			userRequest.errors.each { println it }
		}
	}
}