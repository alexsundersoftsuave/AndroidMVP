package com.softsuave.mvpsample.ux

interface BasePresenter<T : BaseView> {
    val view: T
}