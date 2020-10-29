package com.visioncritical.testdistribution

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.visioncritical.mylibrary.LibraryTest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LibraryTest.shared.testLog("Hello")
        LibraryTest.shared.testVolley(this)
    }
}