package com.semin.androidarchitectureexample.presentation.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<Binding: ViewDataBinding>(@LayoutRes val layoutId: Int): AppCompatActivity() {
    private var binding: Binding? = null

    protected fun bind(block: Binding.() -> Unit) {
        binding?.let(block)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutId)
        binding?.initView()
    }

    abstract fun Binding.initView()
}