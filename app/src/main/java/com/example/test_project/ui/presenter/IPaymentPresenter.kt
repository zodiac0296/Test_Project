package com.example.test_project.ui.presenter

import com.example.test_project.room.entities.Payment

interface IPaymentPresenter {
    fun getAllPayment(): List<Payment>

    fun fetch()
}