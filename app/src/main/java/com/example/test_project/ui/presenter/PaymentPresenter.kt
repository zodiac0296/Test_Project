package com.example.test_project.ui.presenter

import com.example.test_project.room.entities.Payment
import com.example.test_project.ui.repository.Repository

class PaymentPresenter(private val iMainView: IMainView) : IPaymentPresenter {

    private val repository = Repository()

    init {
        getAllPayment()
        fetch()
    }

    override fun getAllPayment(): List<Payment> {
        return repository.getAllPayment()

    }

    override fun fetch() {
        iMainView.setRecyclerView(getAllPayment())
    }
}