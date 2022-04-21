package com.swkim.presentation.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.swkim.presentation.R
import com.swkim.presentation.base.BaseFragment
import com.swkim.presentation.databinding.FragmentMainBinding


class MainFragment : BaseFragment<FragmentMainBinding>(R.layout.fragment_main) {


    override fun init() {
        binding.fragment = this
    }

    fun startBtnClick(view : View) {
        this.findNavController().navigate(R.id.action_mainFragment_to_womanNameFragment)
    }

}