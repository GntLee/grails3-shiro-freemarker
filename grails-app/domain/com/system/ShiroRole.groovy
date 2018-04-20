package com.system

class ShiroRole {

    String name
    String roleName

    ShiroRole(String name, String roleName) {
        this.name = name
        this.roleName = roleName
    }
    
    static hasMany = [users: ShiroUser, permissions: String ]
    static belongsTo = ShiroUser

    static constraints = {
        name(nullable: false, blank: false, unique: true)
    }
}
