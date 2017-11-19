package com.markal.kotlinanko.mainacitivity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.markal.kotlinanko.mainacitivity.ui.MainActivityUI
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.support.DaggerAppCompatActivity
import org.jetbrains.anko.setContentView
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject internal lateinit var ui: MainActivityUI

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        ui.setContentView(this)
        ui.onCreate()
    }

    override fun onDestroy() {
        super.onDestroy()
        ui.onDestroy()
    }
}
