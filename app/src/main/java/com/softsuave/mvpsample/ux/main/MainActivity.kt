package com.softsuave.mvpsample.ux.main

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.softsuave.mvpsample.R
import com.softsuave.mvpsample.ux.BaseFragment

class MainActivity : AppCompatActivity(), MainContract.View {
    val tag = javaClass.simpleName
    val presenter: MainContract.Presenter = MainPresenter(this)
    override val mainActivity: MainActivity
        get() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.onAppLaunched()
    }

    override fun showScreen(fragment: BaseFragment) {
        Log.d(tag, "replaceFragment with tag : " + fragment.javaClass.name)
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fl_container, fragment, fragment.javaClass.name)
        fragmentTransaction.commit()
    }

    override fun pushScreen(fragment: BaseFragment) {
        Log.d(tag, "addFragmentWithBackStack with tag : " + fragment.javaClass.name)
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fl_container, fragment, fragment.javaClass.name)
        fragmentTransaction.addToBackStack(fragment.javaClass.name)
        fragmentTransaction.commit()
    }

    override fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun showMessage(message: Int) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}