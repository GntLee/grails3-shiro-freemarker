package com.system


import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(IndexInterceptor)
class IndexInterceptorSpec extends Specification {

    def setup() {
    }

    def cleanup() {

    }

    void "Test index interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"index")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
