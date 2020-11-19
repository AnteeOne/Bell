package com.anteeone.bell

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.anteeone.bell.databinding.ActivityMainBinding
import com.anteeone.bell.ui.fragments.ChatsFragment
import com.anteeone.bell.ui.objects.AppDrawer

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding:ActivityMainBinding
    private lateinit var mAppDrawer: AppDrawer
    private lateinit var mToolbar : Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
        initFields()
        initFunc()

    }

    private fun initFunc(){
        setSupportActionBar(mToolbar)
        supportFragmentManager.beginTransaction()
            .replace(R.id.dataContainer,
                ChatsFragment()
            )
            .commit()
        mAppDrawer = AppDrawer(this,mToolbar).also {
            it.create()
        }
    }


    private fun initFields(){
        mToolbar = mBinding.mainToolbar
    }
}