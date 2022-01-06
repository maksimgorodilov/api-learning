package com.matim.api.apimanagementexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer


@SpringBootApplication
class ApimanagementexampleApplication: SpringBootServletInitializer() {
	override fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder? {
		return application.sources(ApimanagementexampleApplication::class.java)
	}

	fun main(args: Array<String>) {
		runApplication<ApimanagementexampleApplication>(*args)
	}
}
