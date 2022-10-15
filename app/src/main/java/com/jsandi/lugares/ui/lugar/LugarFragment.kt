package com.jsandi.lugares.ui.lugar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.jsandi.lugares.databinding.FragmentLugarBinding
import com.jsandi.lugares.viewModel.LugarViewModel

class LugarFragment : Fragment() {

    private lateinit var LugarViewModel :LugarViewModel;
    private var _binding: FragmentLugarBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val lugarViewModel = ViewModelProvider(this)[LugarViewModel::class.java]
        _binding = FragmentLugarBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}