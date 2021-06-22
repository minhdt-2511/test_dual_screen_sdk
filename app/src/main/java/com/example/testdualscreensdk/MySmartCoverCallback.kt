package com.example.testdualscreensdk

import com.lge.display.DisplayManagerHelper

class MySmartCoverCallback : DisplayManagerHelper.SmartCoverCallback() {

    override fun onTypeChanged(type: Int) {
        super.onTypeChanged(type)
    }

    override fun onStateChanged(state: Int) {
        super.onStateChanged(state)
    }
}