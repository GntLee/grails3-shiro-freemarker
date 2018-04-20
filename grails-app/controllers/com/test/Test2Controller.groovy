package com.test

import grails.converters.JSON
import grails.transaction.Transactional

@Transactional(readOnly = true)
class Test2Controller {


    @Transactional
    def save() {
        println "==========================="
        def info = [result: false, msg: "test2保存失败"]
        try {
            def id = UUID.randomUUID().toString().toUpperCase().replaceAll("-","")
            println id
            def test2 = new Test2(id,"test2")
            if(test2.save(flush:true)) {
                info.result = true
                info.msg = "test2保存成功"
            }
        } catch (e) {
            e.printStackTrace()
        }
        render info as JSON
    }

}
