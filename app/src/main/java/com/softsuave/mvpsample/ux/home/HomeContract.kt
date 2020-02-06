package com.softsuave.mvpsample.ux.home

import com.softsuave.mvpsample.ux.BasePresenter
import com.softsuave.mvpsample.ux.BaseView

interface HomeContract {
    interface View : BaseView {

    }

    interface Presenter : BasePresenter<View> {

    }

}