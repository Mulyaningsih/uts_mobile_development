package com.okta.okta_uts.activity.register.presenter

interface RegisterView {
    fun onSuccessRegister()
    fun onErrorRegister(msg: String?)
}