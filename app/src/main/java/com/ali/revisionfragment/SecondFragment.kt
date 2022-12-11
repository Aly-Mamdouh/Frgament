package com.ali.revisionfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class SecondFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_second, container, false)
        return view
    }

    override fun onStart() {
        super.onStart()
        // send data from activity to fragment
        val name = arguments?.getString("key")
        view?.findViewById<TextView>(R.id.second_frag_tv)?.text = name

    }

    // send data from activity to fragment
    fun newInstance(name: String): SecondFragment {
        val args = Bundle()
        val fragment = SecondFragment()
        args.putString("key", name)
        fragment.arguments = args
        return fragment
    }


}