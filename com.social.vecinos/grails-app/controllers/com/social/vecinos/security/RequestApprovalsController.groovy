package com.social.vecinos.security

import grails.converters.JSON
import grails.converters.XML

class RequestApprovalsController {
	
	def list() {
		def listResult = [params.userRequestId?.toInteger()]
		withFormat {
			json { render listResult as JSON }
			xml { render listResult as XML }
		}
	}
	
	def show() {
		def objResult = [params.userRequestId?.toInteger(), params.id?.toInteger()]
//		if (!objResult.data) {
//			withFormat {
//				json { response.sendError(404) }
//				xml { response.sendError(404) }
//			}
//			return
//		}
		withFormat {
			json { render objResult as JSON }
			xml { render objResult as XML }
		}
	}
	
	def save() {
		def result = new UserRequest(request.JSON)
		//def result = userRequestService.saveUserRequest(newUserRequest)
		
		withFormat {
			json { render params as JSON }
			xml { render params as XML }
		}
	}
}