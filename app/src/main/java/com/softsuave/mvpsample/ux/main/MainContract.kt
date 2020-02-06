package com.softsuave.mvpsample.ux.main

import com.softsuave.mvpsample.ux.BaseFragment
import com.softsuave.mvpsample.ux.BasePresenter
import com.softsuave.mvpsample.ux.BaseView

interface MainContract {
    interface View : BaseView {
        fun showScreen(fragment: BaseFragment)

        fun pushScreen(fragment: BaseFragment)
    }

    interface Presenter : BasePresenter<View> {
        fun onAppLaunched()

        fun showScreen(fragment: BaseFragment)

        fun pushScreen(fragment: BaseFragment)
    }
}