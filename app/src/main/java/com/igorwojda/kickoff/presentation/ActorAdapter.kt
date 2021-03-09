package com.igorwojda.kickoff.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.igorwojda.kickoff.databinding.ItemActorBinding
import kotlin.properties.Delegates

class ActorAdapter: RecyclerView.Adapter<ActorAdapter.ViewHolder>() {

    var items by Delegates.observable(listOf<String>()) { _, _, _ ->
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemActorBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    inner class ViewHolder(private val binding: ItemActorBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(s: String) {
            binding.textView.text = s
        }
    }
}