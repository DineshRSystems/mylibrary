package com.visioncritical.mylibrary

import android.content.Context
import android.util.Log
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest


class RestClient {

    fun getRequest(context: Context) {
        val url = "http://httpbin.org/get?param1=hello"

        val jsonObjectRequest = JsonObjectRequest(Request.Method.GET, url, null,
            {
                Log.d("RestClient", "response: $it")
            },
            { error ->
                Log.e("RestClient", "error: $error")
            }
        )

        VolleySingleton.getInstance(context).addToRequestQueue(jsonObjectRequest)
    }
}