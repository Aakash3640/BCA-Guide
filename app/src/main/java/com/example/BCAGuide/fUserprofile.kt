package com.example.BCAGuide

class fUserprofile {

    lateinit var userName: String
    lateinit var userEmail: String
    lateinit var userPhone: String

    constructor()
    constructor(userName:String,userEmail:String,userPhone:String){
        this.userName = userName
        this.userEmail = userEmail
        this.userPhone = userPhone
    }

}