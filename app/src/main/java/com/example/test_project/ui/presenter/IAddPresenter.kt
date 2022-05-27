package com.example.test_project.ui.presenter

import com.example.test_project.room.entities.Payment

interface IAddPresenter {
    fun insert(payment: Payment)
    fun deleteItemFromDatabase(payment: Payment)
    fun updateItemFromDatabase(payment: Payment)
}