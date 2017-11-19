package com.markal.kotlinanko.mainacitivity.presentation

import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject

/**
 * Author: Martin Kalenda
 * Created: 11/17/2017
 */
abstract class ReactivePresenter<M>{

    private val bind = PublishSubject.create<M>()

    fun getViewModel(): Observable<M> = bind

    protected fun updateViewModel(viewModel: M) = bind.onNext(viewModel)
}