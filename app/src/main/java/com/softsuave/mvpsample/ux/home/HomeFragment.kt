package com.softsuave.mvpsample.ux.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.softsuave.mvpsample.R
import com.softsuave.mvpsample.ux.BaseFragment

class HomeFragment : BaseFragment(), HomeContract.View {

    val presenter: HomeContract.Presenter = HomePresenter(this)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
}