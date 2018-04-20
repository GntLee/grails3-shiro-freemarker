package com.system

class ShiroUser {

    String username
    String nickname
    String passwordHash

    ShiroUser(String username, String passwordHash) {
        this.username = username
        this.passwordHash = passwordHash
    }

    static hasMany = [roles: ShiroRole, permissions: String]

    static constraints = {
        username(nullable: false, blank: false, unique: true)
        nickname nullable: true
    }
}
