package com.markal.kotlinanko

import com.markal.kotlinanko.mainacitivity.injection.MainActivityModule
import dagger.Component

/**
 * Author: Martin Kalenda
 * Created: 11/19/2017
 */
@Component(modules = arrayOf(ActivityBuilder::class, MainActivityModule::class))
interface AppComponent{
    fun inject(mainActivity: MyApplication)
}
