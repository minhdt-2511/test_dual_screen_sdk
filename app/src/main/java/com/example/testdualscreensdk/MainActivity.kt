package com.example.testdualscreensdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lge.display.DisplayManagerHelper

class MainActivity : AppCompatActivity() {

    private lateinit var _displayManagerHelper: DisplayManagerHelper
    private lateinit var _coverDisplayCallback: MyCoverDisplayCallback
    private lateinit var _smartCoverCallback: MySmartCoverCallback

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        _displayManagerHelper = DisplayManagerHelper(applicationContext)
        _coverDisplayCallback = MyCoverDisplayCallback()
        _smartCoverCallback = MySmartCoverCallback()
    }

    companion object {
        private const val TAG = "DualScreenStatus"
    }
}