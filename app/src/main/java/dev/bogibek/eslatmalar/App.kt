package dev.bogibek.eslatmalar

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {
        override fun onCreate() {
            super.onCreate()
            context = this
        }

        companion object {
            @SuppressLint("StaticFieldLeak")
            var context: Context? = null
                private set
        }
    }
