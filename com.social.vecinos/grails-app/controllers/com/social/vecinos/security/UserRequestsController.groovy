package com.social.vecinos.security

import grails.converters.JSON
import grails.converters.XML

class UserRequestsController {
	
	def userRequestService
	
    def list() {
		def rowIndex = params.rowIndex?.toInteger()
		def numRows = params.numRows?.toInteger()
		def listResult = userRequestService.retrieveAllRequests(rowIndex, numRows)
		withFormat {
			json { render listResult as JSON }
			xml { render listResult as XML }
		}
	}
	
	def show() {
		def objResult = []
		if (!objResult.data) {
			withFormat {
				json { response.sendError(404) }
				xml { response.sendError(404) }
			}
			return
		}
		withFormat {
			json { render objResult as JSON }
			xml { render objResult as XML }
		}
	}
	
	def save() {
		def newUserRequest = new UserRequest(request.JSON)
		def result = userRequestService.saveUserRequest(newUserRequest)
		
		withFormat {
			json { render result as JSON }
			xml { render result as XML }
		}
	}
	
	def update(id) {
		def newUserRequest = new UserRequest(request.JSON)
		def result = userRequestService.saveUserRequest(newUserRequest)
		
		withFormat {
			json { render result as JSON }
			xml { render result as XML }
		}
	}
	
	def delete(id) {
		def newUserRequest = new UserRequest(request.JSON)
		def result = userRequestService.saveUserRequest(newUserRequest)
		
		withFormat {
			json { render result as JSON }
			xml { render result as XML }
		}
	}
}
