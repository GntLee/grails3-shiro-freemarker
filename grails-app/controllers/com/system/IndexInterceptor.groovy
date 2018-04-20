package com.system


class IndexInterceptor {

    int order = HIGHEST_PRECEDENCE+100

    static anon = ["index"]

    IndexInterceptor() {
        match(controller: "index",action: "*")
    }

    boolean before() {

        println actionName
        if(actionName in anon) {
            println "success..."
            return true
        }else{
            accessControl(auth: true)
        }


    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
