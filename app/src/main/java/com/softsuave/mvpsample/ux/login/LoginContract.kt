package com.softsuave.mvpsample.ux.login

import com.softsuave.mvpsample.ux.BasePresenter
import com.softsuave.mvpsample.ux.BaseView

interface LoginContract {
    interface View : BaseView {
        fun onLoginCompleted()

        fun showForgotPasswordScreen()
    }

    interface Presenter : BasePresenter<View> {
        fun onLoginClicked(email: String, password: String)

        fun onForgotPasswordClicked()
    }
}