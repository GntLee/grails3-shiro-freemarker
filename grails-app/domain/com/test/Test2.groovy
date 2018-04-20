package com.test

class Test2 {

    String id

    String title

    Test2(String id,String title) {
        this.id = id
        this.title = title
    }

    static mapping = {
        id generator:'assigned', type:'string'
    }

}