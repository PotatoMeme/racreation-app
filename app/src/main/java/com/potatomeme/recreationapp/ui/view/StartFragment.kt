package com.potatomeme.recreationapp.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.potatomeme.recreationapp.R
import com.potatomeme.recreationapp.databinding.FragmentStartBinding
import com.potatomeme.recreationapp.ui.viewmodel.MainViewModel

class StartFragment : Fragment() {
    private var _binding: FragmentStartBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: MainViewModel

    var name = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_start, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.starFragment = this
        viewModel = (activity as MainActivity).viewModel

        viewModel.flagResult.observe(viewLifecycleOwner) { response ->
            val flagData = response.flagData
            name = flagData[0].countryNm
            viewModel.searchInfoWithName(name)
            Toast.makeText(context,flagData[0].toString(),Toast.LENGTH_LONG).show()
        }
        viewModel.infoResult.observe(viewLifecycleOwner) { response ->
            val infoData = response.infoData
            Toast.makeText(context,infoData[0].toString(),Toast.LENGTH_LONG).show()
        }
    }

    fun btn1Click() {
        viewModel.searchFlagWithNum(1)
        Toast.makeText(context, "btn1 Clicked", Toast.LENGTH_LONG).show()
    }

    fun btn2Click() {
        Toast.makeText(context, "btn2 Clicked", Toast.LENGTH_LONG).show()
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}