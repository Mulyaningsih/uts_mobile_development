package com.okta.okta_uts.activity.login

import com.okta.okta_uts.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}