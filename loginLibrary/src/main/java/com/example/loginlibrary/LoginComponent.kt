package com.example.loginlibrary

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.loginlibrary.databinding.LoginLayoutBinding

class LoginComponent @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private val binding: LoginLayoutBinding

    init {
        val inflater = LayoutInflater.from(context)
        binding = LoginLayoutBinding.inflate(inflater, this, true)

        // Add any additional setup code or event listeners here
    }
}