package com.example.test_project.ui.presenter

import com.example.test_project.room.entities.Payment

interface IMainView {
    fun setRecyclerView(array: List<Payment>?)
}