class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
		
		// REST Services
		//** User Request resource
		name entity: "/api/UserRequests/$userRequestId/$controller/$id"(parseRequest:true) {
			action = [GET: "show", PUT: "update", DELETE: "delete"]
			constraints {
				id(matches:/\d+/)
			}
		}

		name collection: "/api/UserRequests/$userRequestId/$controller"(parseRequest:true) {
			action = [GET: "list", POST: "save"]
		}
		
		//** Generic API
		name entity: "/api/$controller/$id"(parseRequest:true) {
			action = [GET: "show", PUT: "update", DELETE: "delete"]
			constraints {
				id(matches:/\d+/)
			}
		}

		name collection: "/api/$controller"(parseRequest:true) {
			action = [GET: "list", POST: "save"]
		}
	}
}
