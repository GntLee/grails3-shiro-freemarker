package com.global

class ErrorController {

    def error() {
        render view: "/web/error/500"
    }

    def notFound() {
        render view: "/web/error/400"
    }

}
