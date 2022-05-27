package com.example.test_project.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.test_project.R
import com.example.test_project.room.entities.Payment

class PaymentAdapter(private var payment: List<Payment>):
    RecyclerView.Adapter<PaymentAdapter.TransactionViewHolder>() {

    class TransactionViewHolder(view: View): RecyclerView.ViewHolder(view){

        val title : TextView = view.findViewById(R.id.title)
        val amount : TextView = view.findViewById(R.id.amount)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.payment_layout, parent, false)
        return TransactionViewHolder(view)

    }
    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        var payment = payment[position]
        val context = holder.amount.context
        holder.title.text = payment.title.toString()
        if(payment.amount >= 0){
            holder.amount.text = "+ $%.2f".format(payment.amount)
            holder.amount.setTextColor(ContextCompat.getColor(context, R.color.green))
        }else {
            holder.title.text = "- $%.2f".format(Math.abs(payment.amount))
            holder.amount.setTextColor(ContextCompat.getColor(context, R.color.red))
        }
    }

    override fun getItemCount(): Int {
        return payment.size
    }

}