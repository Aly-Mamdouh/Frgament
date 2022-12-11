package com.ali.revisionfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.ali.revisionfragment.databinding.ActivityMainBinding

lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity(),FirstFragment.onFragmentClick {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.firstFrag.setOnClickListener {
            addFragment(FirstFragment())
        }

        binding.secondFrag.setOnClickListener {
            // send data from activity to fragment
            val myFragment = SecondFragment().newInstance("Alio")
            addFragment(myFragment)
        }
    }

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frag_cont_view, fragment).commit()
    }
    // send data from Fragment to Activity
    override fun onClickInterListener(msg: String) {
        binding.mainTv.text=msg
    }
}