package com.example.testdualscreensdk

import com.lge.display.DisplayManagerHelper

class MyCoverDisplayCallback : DisplayManagerHelper.CoverDisplayCallback() {

    override fun onCoverDisplayEnabledChangedCallback(state: Int) {
        super.onCoverDisplayEnabledChangedCallback(state)
    }
}