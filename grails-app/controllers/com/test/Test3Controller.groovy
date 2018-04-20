package com.test

import grails.converters.JSON

import grails.transaction.Transactional

@Transactional(readOnly = true)
class Test3Controller {


    @Transactional
    def save() {
        def info = [result: false, msg: "test3保存失败"]

        def test3 = new Test3("test3")
        if(test3.save(flush:true)) {
            info.result = true
            info.msg = "test3保存成功"
        }
        render info as JSON
    }

}