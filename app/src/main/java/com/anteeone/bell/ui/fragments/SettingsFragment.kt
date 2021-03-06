package com.anteeone.bell.ui.fragments

import android.view.Menu
import android.view.MenuInflater
import com.anteeone.bell.R

class SettingsFragment : BaseFragment(R.layout.fragment_settings) {

    override fun onResume() {
        super.onResume()
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        activity?.menuInflater?.inflate(R.menu.settings_menu,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

}