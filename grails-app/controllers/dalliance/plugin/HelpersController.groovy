package dalliance.plugin

import org.codehaus.groovy.grails.plugins.GrailsPluginManager

class HelpersController {

	GrailsPluginManager pluginManager

	def index() {}

	def getPluginPath() {
		render request.contextPath + '/static' + pluginManager.getGrailsPlugin('dalliance-plugin').pluginPath
	}
}
