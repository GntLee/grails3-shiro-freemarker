package com.test

import grails.converters.JSON
import grails.transaction.Transactional

@Transactional(readOnly = true)
class Test1Controller {

    @Transactional
    def save() {
        def info = [result: false,msg: "test1保存失败"]
        if(new Test1("test1").save(flush:true)) {
            info.result = true
            info.msg = "test1保存成功"
        }
        render info as JSON
    }

}
