package com.markal.kotlinanko.mainacitivity.domain

import io.reactivex.Observable
import kotlinx.coroutines.experimental.Deferred
import kotlinx.coroutines.experimental.channels.ProducerScope
import kotlinx.coroutines.experimental.rx2.rxObservable
import org.jetbrains.anko.coroutines.experimental.bg

/**
 * Author: Martin Kalenda
 * Created: 11/19/2017
 */
abstract class BackgroundUsecase<in I, O>(private val block: suspend ProducerScope<O>.(I) -> O) {
    fun execute(input: I): Observable<O> = rxObservable {
        block(input)
    }
}
