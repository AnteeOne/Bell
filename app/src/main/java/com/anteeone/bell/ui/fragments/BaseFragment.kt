package com.anteeone.bell.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

open class BaseFragment(var layout:Int) : Fragment() {

    private lateinit var mRootView: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mRootView = layoutInflater.inflate(layout,container,false)
        return mRootView
    }

    override fun onStart() {
        super.onStart()
    }

}