package com.softsuave.mvpsample.ux.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.softsuave.mvpsample.R
import com.softsuave.mvpsample.ux.BaseFragment
import com.softsuave.mvpsample.ux.home.HomeFragment
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : BaseFragment(), LoginContract.View {

    val presenter: LoginContract.Presenter = LoginPresenter(this)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_login.setOnClickListener {
            presenter.onLoginClicked(et_email.text.toString(), et_password.text.toString())
        }
    }

    override fun onLoginCompleted() {
        mainActivity.presenter.showScreen(HomeFragment())
    }

    override fun showForgotPasswordScreen() {

    }
}