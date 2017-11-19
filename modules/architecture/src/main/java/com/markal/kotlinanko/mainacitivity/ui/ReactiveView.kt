package com.markal.kotlinanko.mainacitivity.ui

import com.markal.kotlinanko.mainacitivity.presentation.ReactivePresenter
import io.reactivex.disposables.CompositeDisposable

/**
 * Author: Martin Kalenda
 * Created: 11/17/2017
 */
abstract class ReactiveView<in M>(private val presenter: ReactivePresenter<M>) {

    private val compositeDisposable: CompositeDisposable = CompositeDisposable()

    fun onCreate() {
        compositeDisposable.addAll(
                presenter.getViewModel().subscribe(this::bindViewModel)
        )
    }

    fun onDestroy() {
        compositeDisposable.dispose()
    }

    abstract fun bindViewModel(viewModel: M)
}
