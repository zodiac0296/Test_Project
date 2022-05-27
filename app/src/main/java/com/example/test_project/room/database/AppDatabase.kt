package com.example.test_project.room.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.test_project.room.dao.PaymentDao
import com.example.test_project.room.entities.Payment

@Database(entities = arrayOf(Payment::class), version = 2, exportSchema = false)
abstract class AppDatabase: RoomDatabase(){
        abstract fun paymentDao(): PaymentDao
    }
