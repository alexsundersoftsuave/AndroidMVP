package com.softsuave.mvpsample.ux.main

import com.softsuave.mvpsample.utils.PreferenceUtils
import com.softsuave.mvpsample.ux.BaseFragment
import com.softsuave.mvpsample.ux.home.HomeFragment
import com.softsuave.mvpsample.ux.login.LoginFragment

class MainPresenter(override val view: MainContract.View) : MainContract.Presenter {
    override fun onAppLaunched() {
        if (PreferenceUtils.isLogged(view.mainActivity)) {
            view.showScreen(HomeFragment())
        } else {
            view.showScreen(LoginFragment())
        }
    }

    override fun showScreen(fragment: BaseFragment) {
        view.showScreen(fragment)
    }

    override fun pushScreen(fragment: BaseFragment) {
        view.pushScreen(fragment)
    }


}