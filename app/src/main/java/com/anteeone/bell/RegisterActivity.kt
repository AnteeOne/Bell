package com.anteeone.bell

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anteeone.bell.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }
}