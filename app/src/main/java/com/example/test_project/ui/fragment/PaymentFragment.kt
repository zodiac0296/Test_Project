package com.example.test_project.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.test_project.R
import com.example.test_project.adapter.PaymentAdapter
import com.example.test_project.databinding.FragmentPaymentBinding
import com.example.test_project.room.entities.Payment
import com.example.test_project.ui.presenter.IMainView
import com.example.test_project.ui.presenter.PaymentPresenter


class PaymentFragment : Fragment(), IMainView {

    private lateinit var binding: FragmentPaymentBinding
    private lateinit var presenter: PaymentPresenter
    private var adapter: PaymentAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentPaymentBinding.inflate(inflater, container, false)
        presenter = PaymentPresenter(this)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.addBtn.setOnClickListener {
            openAddFragment()
        }
    }

    override fun setRecyclerView(array: List<Payment>?) {
        adapter = PaymentAdapter(array as List<Payment>)
        binding.recyclerview.adapter = adapter
        val balance = array.map { it.amount }.sum()
        val budget = array.filter { it.amount > 0 }.map { it.amount }.sum()
        val expense = balance - budget
        binding.balance.text = "¥ %.2f".format(balance)
        binding.budget.text = "¥ %.2f".format(budget)
        binding.expense.text = "¥ %.2f".format(expense)

    }

    private fun openAddFragment(){

        findNavController().navigate(R.id.action_paymentFragment_to_addPaymentFragment)

    }
}