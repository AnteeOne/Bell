package com.anteeone.bell.ui.objects

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.anteeone.bell.R
import com.anteeone.bell.ui.fragments.SettingsFragment
import com.mikepenz.materialdrawer.AccountHeader
import com.mikepenz.materialdrawer.AccountHeaderBuilder
import com.mikepenz.materialdrawer.Drawer
import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.model.DividerDrawerItem
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem
import com.mikepenz.materialdrawer.model.ProfileDrawerItem
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem

class AppDrawer(val activity: AppCompatActivity,
                val toolbar: Toolbar) {

    private lateinit var mDrawer:Drawer
    private lateinit var mHeader:AccountHeader

    fun create(){
        createHeader()
        createDrawer()
    }

    private fun createDrawer(){
        mDrawer = DrawerBuilder()
            .withActivity(activity)
            .withToolbar(toolbar)
            .withActionBarDrawerToggle(true)
            .withSelectedItem(-1)
            .withAccountHeader(mHeader)
            .addDrawerItems(
                PrimaryDrawerItem()
                    .withIdentifier(100)
                    .withIconTintingEnabled(true)
                    .withName("New Group")
                    .withIcon(R.drawable.group_24px)
                    .withSelectable(false),
                PrimaryDrawerItem()
                    .withIdentifier(101)
                    .withIconTintingEnabled(true)
                    .withIcon(R.drawable.lock_24px)
                    .withName("New Secret Chat")
                    .withSelectable(false),
                PrimaryDrawerItem()
                    .withIdentifier(102)
                    .withIconTintingEnabled(true)
                    .withName("New Channel")
                    .withIcon(R.drawable.campaign_24px)
                    .withSelectable(false),
                PrimaryDrawerItem()
                    .withIdentifier(103)
                    .withIconTintingEnabled(true)
                    .withName("Contacts")
                    .withIcon(R.drawable.person_24px)
                    .withSelectable(false),
                PrimaryDrawerItem()
                    .withIdentifier(104)
                    .withIconTintingEnabled(true)
                    .withIcon(R.drawable.local_phone_24px)
                    .withName("Calls")
                    .withSelectable(false),
                PrimaryDrawerItem()
                    .withIdentifier(105)
                    .withIconTintingEnabled(true)
                    .withIcon(R.drawable.bookmarks_24px)
                    .withName("Saved Messages")
                    .withSelectable(false),
                PrimaryDrawerItem()
                    .withIdentifier(106)
                    .withIconTintingEnabled(true)
                    .withIcon(R.drawable.settings_24px)
                    .withName("Settings")
                    .withSelectable(false),
                DividerDrawerItem(),
                PrimaryDrawerItem()
                    .withIdentifier(107)
                    .withIconTintingEnabled(true)
                    .withIcon(R.drawable.person_add_24px)
                    .withName("Invite Friends")
                    .withSelectable(false),
                PrimaryDrawerItem()
                    .withIdentifier(108)
                    .withIconTintingEnabled(true)
                    .withIcon(R.drawable.help_24px)
                    .withName("Bell FAQ")
                    .withSelectable(false)
            ).withOnDrawerItemClickListener(object : Drawer.OnDrawerItemClickListener{
                override fun onItemClick(
                    view: View?,
                    position: Int,
                    drawerItem: IDrawerItem<*>
                ): Boolean {
                    when(position){
                        7 -> activity.supportFragmentManager.beginTransaction()
                            .addToBackStack(null)
                            .replace(R.id.dataContainer,
                                SettingsFragment()
                            )
                            .commit()
                    }
                    return false;
                }

            }).build()
    }

    private fun createHeader(){
        mHeader = AccountHeaderBuilder()
            .withActivity(activity)
            .withHeaderBackground(R.drawable.header)
            .addProfiles(
                ProfileDrawerItem()
                    .withName("AnteeOne")
                    .withEmail("azatpscl@gmail.com")

            ).build()
    }

}