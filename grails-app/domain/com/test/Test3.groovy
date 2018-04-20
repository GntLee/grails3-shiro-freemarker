package com.test

class Test3 {

    String id
    String title

    Test3(String title) {
        this.title = title
    }

    static constraints = {

    }

    static mapping = {
        id generator: "uuid.hex", type:"string"
    }
}
