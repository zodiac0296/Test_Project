package com.example.test_project.ui.repository

import com.example.test_project.App
import com.example.test_project.room.entities.Payment

class Repository {

    private val db = App.instance
    private val dao = db?.getDatabase()?.paymentDao()

    init {
        getAllPayment()
    }

    fun insert(payment: Payment) {
        dao?.insert(payment)
    }

    fun getAllPayment(): List<Payment> {
        return dao!!.getAll()
    }

    fun deleteItemFromDatabase(payment: Payment) {
        dao?.delete(payment)
    }

    fun updateItemDatabase(payment: Payment) {
        dao?.update(payment)
    }

}
