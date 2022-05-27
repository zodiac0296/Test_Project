package com.example.test_project.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.test_project.R
import com.example.test_project.databinding.FragmentAddPaymentBinding
import com.example.test_project.room.entities.Payment
import com.example.test_project.ui.presenter.AddPresenter


class AddPaymentFragment : Fragment() {

    private lateinit var binding: FragmentAddPaymentBinding

    private val presenter by lazy { AddPresenter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAddPaymentBinding.inflate(inflater, container, false)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSave.setOnClickListener {
            val payment = Payment(
                0,
                binding.btnSave.text.toString(),
                binding.amount.text.toString().toDouble(),
            )
            presenter.insert(payment)
            findNavController().navigate(R.id.action_addPaymentFragment_to_paymentFragment)
        }
    }
}