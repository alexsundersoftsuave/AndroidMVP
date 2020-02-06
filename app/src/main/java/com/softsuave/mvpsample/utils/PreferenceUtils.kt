package com.softsuave.mvpsample.utils

import android.content.Context
import android.content.SharedPreferences
import com.softsuave.mvpsample.contants.PreferenceKey

object PreferenceUtils {

    private const val NAME = "AndroidMVP"

    fun isLogged(context: Context): Boolean {
        return getPreference(context).getBoolean(PreferenceKey.LOGGED_IN, false)
    }

    fun setLogged(context: Context, loggedIn: Boolean) {
        val editor = getPreference(context).edit()
        editor.putBoolean(PreferenceKey.LOGGED_IN, loggedIn)
        commit(editor)
    }

    private fun commit(editor: SharedPreferences.Editor) {
        if (!editor.commit())
            editor.apply()
    }

    private fun getPreference(context: Context): SharedPreferences {
        return context.getSharedPreferences(NAME, Context.MODE_PRIVATE)
    }

}