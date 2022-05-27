package com.example.test_project.room.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "payment")
data class Payment(
    @PrimaryKey(autoGenerate = true)
    var title: Int,
    var description: String,
    var amount: Double
):Serializable
