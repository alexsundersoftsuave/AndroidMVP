package com.softsuave.mvpsample.ux

import com.softsuave.mvpsample.ux.main.MainActivity

interface BaseView {
    val mainActivity: MainActivity

    fun showMessage(message: String)

    fun showMessage(message: Int)
}