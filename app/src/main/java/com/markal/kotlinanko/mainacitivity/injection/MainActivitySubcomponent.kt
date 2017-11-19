package com.markal.kotlinanko.mainacitivity.injection

import com.markal.kotlinanko.mainacitivity.MainActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Author: Martin Kalenda
 * Created: 11/19/2017
 */
@Subcomponent
interface MainActivitySubcomponent : AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}
