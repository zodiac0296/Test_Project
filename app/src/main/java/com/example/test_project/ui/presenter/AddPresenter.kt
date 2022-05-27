package com.example.test_project.ui.presenter

import com.example.test_project.room.entities.Payment
import com.example.test_project.ui.repository.Repository

class AddPresenter: IAddPresenter {
    private val repository = Repository()

    override fun insert(payment: Payment) {
        repository.insert(payment)
    }

    override fun deleteItemFromDatabase(payment: Payment) {
        repository.deleteItemFromDatabase(payment)
    }

    override fun updateItemFromDatabase(payment: Payment) {
        repository.updateItemDatabase(payment)
    }
}