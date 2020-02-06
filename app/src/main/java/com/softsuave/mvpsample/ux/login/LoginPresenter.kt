package com.softsuave.mvpsample.ux.login

import com.softsuave.mvpsample.utils.PreferenceUtils
import com.softsuave.mvpsample.utils.Utils

class LoginPresenter(override val view: LoginContract.View) : LoginContract.Presenter {
    override fun onLoginClicked(email: String, password: String) {
        if (email.isBlank())
            view.showMessage("Enter an email.")
        else if (!Utils.isValidEmail(email))
            view.showMessage("Enter valid email.")
        else if (password.isEmpty())
            view.showMessage("Enter a password.")
        else if (password.length < 6)
            view.showMessage("Password should have 6 characters.")
        else {
            PreferenceUtils.setLogged(view.mainActivity, true)
            view.showMessage("Logged in successfully...")
            view.onLoginCompleted()
        }
    }

    override fun onForgotPasswordClicked() {
        view.showForgotPasswordScreen()
    }
}