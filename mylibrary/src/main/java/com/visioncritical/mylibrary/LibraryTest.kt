package com.visioncritical.mylibrary

import android.content.Context
import android.util.Log

class LibraryTest private constructor() {

    private object HOLDER {
        val INSTANCE = LibraryTest()
    }

    companion object {
        val shared: LibraryTest by lazy { HOLDER.INSTANCE }
    }

    fun testVolley(context: Context) {
        RestClient().getRequest(context)
    }

    fun testLog(message: String) {
        Log.d("LibraryTest", message)
    }
}