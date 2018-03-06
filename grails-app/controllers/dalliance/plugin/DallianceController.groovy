package dalliance.plugin

import grails.converters.JSON

class DallianceController {

	def index() {}

	def loadScripts() {
		List<Map> rows = []
		for (String file in ['/build/dalliance-all', '/dalliance']) {
			rows << [path: servletContext.contextPath + pluginContextPath + file + '.js', type: 'script']
		}

		render([success: true, totalCount: rows.size(), files: rows] as JSON)
	}
}
