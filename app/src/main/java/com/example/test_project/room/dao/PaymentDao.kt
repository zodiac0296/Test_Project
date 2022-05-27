package com.example.test_project.room.dao

import androidx.room.*
import com.example.test_project.room.entities.Payment
@Dao
interface PaymentDao {

    @Query("SELECT * from payment")
    fun getAll(): List<Payment>

    @Insert
    fun insert(vararg payment: Payment)

    @Delete
    fun delete(payment: Payment)

    @Update
    fun update(vararg payment: Payment)
}