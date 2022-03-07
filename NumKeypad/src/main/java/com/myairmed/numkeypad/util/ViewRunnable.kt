package com.myairmed.numkeypad.util

import android.view.View

internal abstract class ViewRunnable : Runnable {
    var view: View? = null
}