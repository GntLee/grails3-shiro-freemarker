package com.global


class ErrorInterceptor {

    int order = HIGHEST_PRECEDENCE+100

    static anon = ["error","notFound"]

    ErrorInterceptor() {
        match(controller: "error",action: "*")
    }

    boolean before() {
        if(actionName in anon) {
            return true
        }
        accessControl {
            true
        }
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
