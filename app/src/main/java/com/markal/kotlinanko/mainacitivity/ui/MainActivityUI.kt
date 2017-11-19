package com.markal.kotlinanko.mainacitivity.ui

import android.view.View
import android.widget.TextView
import com.markal.kotlinanko.mainacitivity.MainActivity
import com.markal.kotlinanko.mainacitivity.presentation.MainActivityPresenter
import com.markal.kotlinanko.mainacitivity.presentation.MainActivityViewModel
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import javax.inject.Inject

/**
 * Author: Martin Kalenda
 * Created: 11/16/2017
 */
class MainActivityUI @Inject constructor(private val presenter: MainActivityPresenter) : ReactiveView<MainActivityViewModel>(presenter), AnkoComponent<MainActivity> {

    private lateinit var name: TextView

    override fun bindViewModel(viewModel: MainActivityViewModel) {
        name.text = viewModel.user
    }

    override fun createView(ui: AnkoContext<MainActivity>): View = ui.apply { layout() }.view

    private fun AnkoContext<MainActivity>.layout() {
        verticalLayout {
            name = textView()
            button("Button") {
                onClick { presenter.buttonClicked() }
            }
        }
    }
}
