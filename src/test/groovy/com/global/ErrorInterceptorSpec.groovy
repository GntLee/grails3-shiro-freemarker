package com.global


import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(ErrorInterceptor)
class ErrorInterceptorSpec extends Specification {

    def setup() {
    }

    def cleanup() {

    }

    void "Test error interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"error")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
