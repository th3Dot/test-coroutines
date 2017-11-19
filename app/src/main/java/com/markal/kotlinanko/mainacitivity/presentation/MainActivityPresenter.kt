package com.markal.kotlinanko.mainacitivity.presentation

import com.markal.kotlinanko.mainacitivity.domain.BackgroundUsecase
import kotlinx.coroutines.experimental.reactive.publish
import kotlinx.coroutines.experimental.runBlocking
import kotlinx.coroutines.experimental.rx2.rxObservable
import javax.inject.Inject

/**
 * Author: Martin Kalenda
 * Created: 11/16/2017
 */
class MainActivityPresenter @Inject constructor(): ReactivePresenter<MainActivityViewModel>() {

    @Inject internal lateinit var getUserUsecase: GetUserUsecase

    suspend fun buttonClicked() {
        val result = getUserUsecase.execute(Unit)

        result.subscribe { updateViewModel(MainActivityViewModel(it)) }
    }
}

class GetUserUsecase @Inject constructor() : BackgroundUsecase<Unit, String>({
    send("user")
    send("SAD")
    "User"
})
