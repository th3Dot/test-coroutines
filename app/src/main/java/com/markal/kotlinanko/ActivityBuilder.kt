package com.markal.kotlinanko

import android.app.Activity
import com.markal.kotlinanko.mainacitivity.MainActivity
import com.markal.kotlinanko.mainacitivity.injection.MainActivitySubcomponent
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

/**
 * Author: Martin Kalenda
 * Created: 11/19/2017
 */
@Module
abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    internal abstract fun bindYourActivityInjectorFactory(builder: MainActivitySubcomponent.Builder): AndroidInjector.Factory<out Activity>
}
