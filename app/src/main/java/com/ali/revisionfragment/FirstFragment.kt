package com.ali.revisionfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ali.revisionfragment.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    lateinit var binding: FragmentFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentFirstBinding.inflate(inflater, container, false)
    // send data from Fragment to Activity
        val myinterface:onFragmentClick =activity as onFragmentClick
        binding.btnFrag.setOnClickListener {
            myinterface.onClickInterListener("Alio Mamdouh")
        }
        return binding.root
    }
    // send data from Fragment to Activity
    interface onFragmentClick {
        fun onClickInterListener(msg: String)
    }

}