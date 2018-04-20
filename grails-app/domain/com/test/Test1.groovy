package com.test

class Test1 {

    String id

    String title

    Test1 (String title) {
        this.title = title
    }

    static constraints = {

    }

    static mapping = {
        id generator:'uuid.hex', params:[separator:'-']
    }
}
