package com.softsuave.mvpsample.ux

import android.widget.Toast
import androidx.fragment.app.Fragment
import com.softsuave.mvpsample.ux.main.MainActivity

open class BaseFragment : Fragment(), BaseView {
    override val mainActivity: MainActivity
        get() = activity as MainActivity

    override fun showMessage(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    override fun showMessage(message: Int) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}